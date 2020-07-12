package com.example.test.api.service;

import com.example.test.api.dto.TestDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TestServiceImplTest {
    @Autowired
    private TestService testService;

    @Test
    void 인덱스_서비스_호출() {
        TestDTO testDTO = testService.index();
        assertEquals(1L, testDTO.getId());
    }
}