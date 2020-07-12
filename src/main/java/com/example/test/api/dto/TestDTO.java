package com.example.test.api.dto;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class TestDTO implements Serializable {
    private long id;
    private String name;

    @Builder
    public TestDTO(long id, String name) {
        this.id = id;
        this.name = name;
    }

}
