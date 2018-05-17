package com.example.asus.myfinal.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ASUS on 17/5/2561.
 */

public class GeoDao {
    @SerializedName("lat")
    private String lat;

    @SerializedName("lng")
    private String lng;

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }
}
