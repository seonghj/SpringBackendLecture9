package com.example.springdatajpa.dto;

public record MenuResponse(
    Long id,
    String name,
    int price,
    String categoryName
) {}
