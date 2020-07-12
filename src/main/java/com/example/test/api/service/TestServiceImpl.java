package com.example.test.api.service;

import com.example.test.api.dto.TestDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestServiceImpl implements TestService {
    @Override
    public TestDTO index() {
        TestDTO testDTO = TestDTO.builder()
                .id(1L)
                .name("test")
                .build();
        log.debug("return value {}", testDTO);
        return testDTO;
    }
}
