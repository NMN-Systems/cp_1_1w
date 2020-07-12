package com.example.test.api.controller;

import com.example.test.api.dto.TestDTO;
import com.example.test.api.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApiController {

    final private TestService testService;

    @GetMapping()
     public TestDTO index(){
         return testService.index();
     }
}
