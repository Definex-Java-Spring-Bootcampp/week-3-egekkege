package com.patika.garantiservice.service;

import com.patika.garantiservice.converter.ApplicationConverter;
import com.patika.garantiservice.entity.Application;
import com.patika.garantiservice.repository.ApplicationRepository;
import com.patika.garantiservice.dto.request.ApplicationRequest;
import com.patika.garantiservice.dto.response.ApplicationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ApplicationService {
    private ApplicationRepository applicationRepository = new ApplicationRepository();

    private final ApplicationConverter applicationConverter;

    public ApplicationResponse createApplication(ApplicationRequest request) {
        Application application = applicationConverter.toApplication(request);
        return applicationConverter.toResponse(applicationRepository.save(application));
    }


    public List<ApplicationResponse> getAll() {
        List<Application> applications = applicationRepository.getAll();
        applicationConverter.toResponseList(applications);
        return applicationConverter.toResponseList(applications);
    }
}
