package com.example.asus.myfinal.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ASUS on 17/5/2561.
 */

public class CompanyDao {

    @SerializedName("name")
    private String name;

    @SerializedName("catchPhrase")
    private String catchPhrase;

    @SerializedName("bs")
    private String bs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }
}
