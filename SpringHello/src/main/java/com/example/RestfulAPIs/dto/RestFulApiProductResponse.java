package com.example.RestfulAPIs.dto;

public class RestFulApiProductResponse {
    private Long id;
    private String name;

    public RestFulApiProductResponse() { }

    public RestFulApiProductResponse(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() { return id; }
    public String getName() { return name; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
}
