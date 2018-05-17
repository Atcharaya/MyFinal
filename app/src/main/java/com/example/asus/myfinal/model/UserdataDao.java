package com.example.asus.myfinal.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ASUS on 17/5/2561.
 */

public class UserdataDao {

    @SerializedName("id")
    private Number id;

    @SerializedName("name")
    private String name;

    @SerializedName("username")
    private String username;

    @SerializedName("email")
    private String email;

    @SerializedName("address")
    private AddressDao adderess;

    @SerializedName("phone")
    private String phone;

    @SerializedName("website")
    private String website;

    @SerializedName("company")
    private CompanyDao company;

    public Number getId() {
        return id;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AddressDao getAdderess() {
        return adderess;
    }

    public void setAdderess(AddressDao adderess) {
        this.adderess = adderess;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public CompanyDao getCompany() {
        return company;
    }

    public void setCompany(CompanyDao company) {
        this.company = company;
    }
}
