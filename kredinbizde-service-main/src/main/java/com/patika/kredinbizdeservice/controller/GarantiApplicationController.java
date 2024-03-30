package com.patika.kredinbizdeservice.controller;

import com.patika.kredinbizdeservice.dto.request.ApplicationRequest;
import com.patika.kredinbizdeservice.model.Application;
import com.patika.kredinbizdeservice.service.ApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/applications/garanti")
@RequiredArgsConstructor
public class GarantiApplicationController {
    private final ApplicationService applicationService;
/*
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Application> createGarantiApplication(@RequestBody ApplicationRequest request) {
        return ResponseEntity.ok().body(applicationService.createGarantiApplication(request));
    }*/

    @GetMapping("/garanti/{email}")
    public ResponseEntity<Application> getByEmail(@PathVariable String email) {
        return ResponseEntity.ok().body(applicationService.getByEmail(email));
    }
}
