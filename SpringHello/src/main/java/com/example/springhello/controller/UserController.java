package com.example.springhello.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final AtomicLong seq = new AtomicLong(0);
    private final Map<Long, UserDto> db = new ConcurrentHashMap<>();

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Map<String, Object> create(@RequestBody CreateUserRequest req) {
        long id = seq.incrementAndGet();
        UserDto user = new UserDto(id, req.name());
        db.put(id, user);

        return Map.of(
                "id", id,
                "user", user

        );
    }

    @GetMapping("/{id}")
    public UserDto get(@PathVariable long id) {
        UserDto user = db.get(id);
        if (user == null) {
            throw new IllegalArgumentException("User not found. id=" + id);
        }
        return user;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id) {
        db.remove(id);
    }

    public record CreateUserRequest(String name) {}
    public record UserDto(long id, String name) {}
}