package com.company;

import java.sql.Time;

public class House {
    private int houseNumber;
    private String streetName;
    private String cityName;
    private String county;
    private String country;

    public House() {

    }

    public House(int houseNumber,String streetName,String cityName,String county,String country) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.cityName = cityName;
        this.county = county;
        this.country = country;
    }


    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCounty() {
        return county;
    }

    public String getCountry() {
        return country;
    }

    public int estimateTravelTime(House House) {
        return 0;
    }
}
