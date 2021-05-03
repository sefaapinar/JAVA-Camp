package Entities;

import Abstract.Entity;

public class Campaign implements Entity {

    private int id;
    private String CampaignName;
    private double DiscountPercentage;

    public Campaign(){

    }

    public Campaign(int id, String campaignName, double discountPercentage) {
        this.id = id;
        this.CampaignName = campaignName;
        this.DiscountPercentage = discountPercentage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCampaignName() {
        return CampaignName;
    }

    public void setCampaignName(String campaignName) {
        CampaignName = campaignName;
    }

    public double getDiscountPercentage() {
        return DiscountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.DiscountPercentage = discountPercentage;
    }
}
