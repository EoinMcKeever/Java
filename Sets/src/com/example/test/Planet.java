package com.example.test;

import java.util.Set;

public class Planet extends HeavenlyBody{


    public Planet(String name, double orbintalPeriod) {
        super(name, orbintalPeriod);
        super.getBodyType();
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if (moon.getBodyType().equals("Moon")){
            return super.addSatellite(moon);
        } else {
            return false;
        }

    }

}
