package com.example.test;

public class Hi {

    private int x;

    public Hi(int x) {
        this.x = x;

    }
    public void loop() {
        for(int x=1;x<13;x++) {
            System.out.println(this.x * x);
        }

    }

}
