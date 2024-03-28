package com.patika.kredinbizdeservice.repository;

import com.patika.kredinbizdeservice.model.Campaign;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CampaignRepository {
    private List<Campaign> campaignList = new ArrayList<>();

    public void save(Campaign campaign) {
        campaignList.add(campaign);
    }

    // The list method below is used to get all the campaign objects in date order
    public List<Campaign> getAll() {
        List<Campaign> sortedCampaigns = campaignList;
        Collections.sort(sortedCampaigns, Comparator.comparing(Campaign::getCreateDate).reversed());
        return sortedCampaigns;
    }
}
