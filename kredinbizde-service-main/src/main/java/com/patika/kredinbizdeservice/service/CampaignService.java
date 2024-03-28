package com.patika.kredinbizdeservice.service;

import com.patika.kredinbizdeservice.model.Campaign;
import com.patika.kredinbizdeservice.repository.CampaignRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Scope(value = "singleton")
@RequiredArgsConstructor
public class CampaignService {
    private CampaignRepository campaignRepository = new CampaignRepository();

    public Campaign save(Campaign campaign) {
        campaignRepository.save(campaign);
        return campaign;
    }

    public List<Campaign> getAll() {
        return campaignRepository.getAll();
    }
}
