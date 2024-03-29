package com.patika.garantiservice.repository;

import com.patika.garantiservice.dto.response.ApplicationResponse;
import com.patika.garantiservice.entity.Application;

import java.util.List;
import java.util.ArrayList;

public class ApplicationRepository {

    private List<Application> applicationList = new ArrayList<>();

    public Application save(Application application) {
        applicationList.add(application);
        return application;
    }

    public List<Application> getAll() {
        return applicationList;
    }
}
