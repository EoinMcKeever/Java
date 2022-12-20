package com.company;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("gti")){
            this.model = model;
        } else{
            this.model = "Unknown";
        }

    }

    public String getmodel(){
        return this.model;
    }

}
