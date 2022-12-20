package com.example.test;

interface Accessible {
    int SOME_CONSTANT = 100; //public static. All variables of interfaces are set to this
    public void methodA();
    void methodB();  // public. all interfaces methods are public
    boolean methodC();  // public. all interfaces methods are public
}
