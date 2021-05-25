package com.example.practiceresources2;

public class Restaurant {
    int imageRes;
    String nameRes;
    String foodRes;
    double rateRes;
    String voteRes;
    int timeDeliveryRes;
    double feeDeliveryRes;

    public Restaurant(int imageRes, String nameRes, String foodRes, double rateRes, String voteRes, int timeDeliveryRes, double feeDeliveryRes) {
        this.imageRes = imageRes;
        this.nameRes = nameRes;
        this.foodRes = foodRes;
        this.rateRes = rateRes;
        this.voteRes = voteRes;
        this.timeDeliveryRes = timeDeliveryRes;
        this.feeDeliveryRes = feeDeliveryRes;
    }

    public int getImageRes() {
        return imageRes;
    }

    public void setImageRes(int imageRes) {
        this.imageRes = imageRes;
    }

    public String getNameRes() {
        return nameRes;
    }

    public void setNameRes(String nameRes) {
        this.nameRes = nameRes;
    }

    public String getFoodRes() {
        return foodRes;
    }

    public void setFoodRes(String foodRes) {
        this.foodRes = foodRes;
    }

    public double getRateRes() {
        return rateRes;
    }

    public void setRateRes(double rateRes) {
        this.rateRes = rateRes;
    }

    public String getVoteRes() {
        return voteRes;
    }

    public void setVoteRes(String voteRes) {
        this.voteRes = voteRes;
    }

    public int getTimeDeliveryRes() {
        return timeDeliveryRes;
    }

    public void setTimeDeliveryRes(int timeDeliveryRes) {
        this.timeDeliveryRes = timeDeliveryRes;
    }

    public double getFeeDeliveryRes() {
        return feeDeliveryRes;
    }

    public void setFeeDeliveryRes(double feeDeliveryRes) {
        this.feeDeliveryRes = feeDeliveryRes;
    }

}
