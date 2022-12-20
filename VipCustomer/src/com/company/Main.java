package com.company;

public class Main {

    public static void main(String[] args) {
        VipCustomer x = new VipCustomer("hi",0.5,"email");
        VipCustomer y = new VipCustomer();
        VipCustomer z = new VipCustomer("hello", 1.0);
        System.out.println(x.getName());
        System.out.println(x.getEmail());
        System.out.println(x.getCreditLimit());
        System.out.println(y.getName());
        System.out.println(y.getEmail());
        System.out.println(y.getCreditLimit());
        System.out.println(z.getName());
        System.out.println(z.getEmail());
        System.out.println(z.getCreditLimit());
	// write your code here
    }
}
