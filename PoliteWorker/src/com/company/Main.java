package com.company;

public class Main {

    public static void main(String[] args) {
        final Worker WORKER1 = new Worker("Worker 1", true);
        final Worker WORKER2 = new Worker("Worker 2", true);
        final SharedResource sharedResource = new SharedResource(WORKER1);


        new Thread(new Runnable() {
            @Override
            public void run() {
                WORKER1.work(sharedResource, WORKER2);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                WORKER2.work(sharedResource, WORKER1);
            }
        }).start();

    }
}
