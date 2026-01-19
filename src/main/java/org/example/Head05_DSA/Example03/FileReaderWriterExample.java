package org.example.Head05_DSA.Example03;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterExample {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        try (FileReader fr = new FileReader("/example.txt")) {
            int data;

            while ((data = fr.read()) != -1){
                System.out.print((char) data);
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter("/output.txt")) {
            String content = "Hello File I/O";
            for (char c : content.toCharArray()) {
                fw.write(c);
            }

            fw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
