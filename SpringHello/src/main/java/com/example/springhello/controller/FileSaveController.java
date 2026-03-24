package com.example.springhello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

@Controller
public class FileSaveController {
    @PostMapping("/upload/save")
    @ResponseBody
    public String save(@RequestParam("file") MultipartFile file) throws IOException {

        if (file == null || file.isEmpty()) {
            return "파일이 비어 있습니다.";
        }

        String original = file.getOriginalFilename();
        if (original == null) {
            original = "unknown";
        }

        original = original.replace("\\", "_").replace("/", "_");

        String savedName = UUID.randomUUID() + "_" + original;

        Path uploadPath = Path
                .of(System.getProperty("user.dir"), "uploads")
                .toAbsolutePath();

        Files.createDirectories(uploadPath);

        Path dest = uploadPath.resolve(savedName);
        file.transferTo(dest.toFile());

        return "저장 완료: " + dest;
    }
}
