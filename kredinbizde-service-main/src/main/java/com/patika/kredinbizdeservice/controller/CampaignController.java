//This is the controller class of the Campaign entity.
//The CampaignController class is annotated with @RestController and @RequestMapping("/api/campaigns").
package com.patika.kredinbizdeservice.controller;

import com.patika.kredinbizdeservice.model.Campaign;
import com.patika.kredinbizdeservice.service.CampaignService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("/api/campaigns")
@RequiredArgsConstructor
public class CampaignController {
    private final CampaignService campaignService;

    // The create method is used to save the campaign object
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Campaign create(@RequestBody Campaign campaign) {
        return campaignService.save(campaign);
    }

    // The getAll method is used to get all the campaign objects
    // getAll method returns campaign objects in date order
    @GetMapping
    public List<Campaign> getAll() {
        return campaignService.getAll();
    }
}
