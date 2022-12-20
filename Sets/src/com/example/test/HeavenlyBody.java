package com.example.test;

import java.util.Objects;
import java.util.Set;
import java.util.HashSet;

public abstract class HeavenlyBody {
    private final Key key;
    private final double orbintalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final Class<? extends HeavenlyBody> bodyType;


    public HeavenlyBody(String name, double orbintalPeriod){
    this.bodyType = this.getClass();
    this.key = new Key(name,getBodyType());
    this.orbintalPeriod = orbintalPeriod;
    this.satellites = new HashSet<>();

    }

    public String getBodyType() {
        String[] test = this.bodyType.getTypeName().split("\\.");
        return test[test.length-1];
        }

    public Key getKey() {
        return key;
    }

    public boolean addSatellite(HeavenlyBody satellite) {
        return this.satellites.add(satellite);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }


    public double getOrbintalPeriod() {
        return orbintalPeriod;
    }

    public static final class Key {
        private String name;
        private String bodyType;

        private Key(String name, String bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public String getBodyType() {
            return bodyType;
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj;
            if(this.name.equals(key.getName())) {
                return(this.bodyType == key.getBodyType());
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyType.hashCode();
        }

        @Override
        public String toString() {
            return this.name + ": " + this.bodyType;
        }
    }

    @Override
    public final boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if(obj instanceof HeavenlyBody) {
            HeavenlyBody theObject = (HeavenlyBody) obj;
            return this.key.equals(theObject.getKey());
        }
            return false;
        }


    @Override
    public final int hashCode() {
        //System.out.println("HashCode called");
        return this.key.hashCode();
    }

    public static Key makeKey(String name, String bodyType) {
        return new Key(name,bodyType);
    }

    @Override
    public String toString() {
        return this.key.name + ": " + this.key.bodyType + ", " + this.orbintalPeriod;
    }
}
