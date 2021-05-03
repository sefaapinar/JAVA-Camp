package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {
    @Override
    public void add(Campaign campaign) {
        System.out.println("Campaign System Added !" + campaign.getCampaignName());
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("Campaign System Updated !" + campaign.getCampaignName());
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println("Campaign System Deleted !" + campaign.getCampaignName());
    }
}
