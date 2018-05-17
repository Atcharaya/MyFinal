package com.example.asus.myfinal.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ASUS on 17/5/2561.
 */

public class PhotoDao {

    @SerializedName("thumbnailUrl")
    private String thumbnailUrl;

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }
}
