package com.patika.garantiservice.controller;


import com.patika.garantiservice.dto.request.ApplicationRequest;
import com.patika.garantiservice.dto.response.ApplicationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.patika.garantiservice.service.ApplicationService;

import java.util.List;

@RestController
@RequestMapping("api/garanti/v1/applications")
@RequiredArgsConstructor
public class ApplicationController {
    private final ApplicationService applicationService;

    @PostMapping
    public ApplicationResponse createApplication(@RequestBody ApplicationRequest request) {
        return applicationService.createApplication(request);
    }

    @GetMapping
    public ResponseEntity<List<ApplicationResponse>> getAll() {
        return ResponseEntity.ok(applicationService.getAll());
    }
}
