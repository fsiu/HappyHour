package com.happyhour.com.happyhour.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by fsiu on 5/16/14.
 */
public class User {

    @JsonProperty("user_id")
    private long userId;

    @JsonProperty("user_name")
    private String userName;

    private double lat;

    @JsonProperty("loc")
    private double [] loc;

    private String photo;

    private Likes likes;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double[] getLoc() {
        return loc;
    }

    public void setLoc(double[] loc) {
        this.loc = loc;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Likes getLikes() {
        return likes;
    }
}
