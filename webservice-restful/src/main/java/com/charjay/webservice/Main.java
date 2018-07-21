package com.charjay.webservice;


public class Main {
    public static void main(String[] args) {
        SayHelloImplService service =new SayHelloImplService();
        SayHelloImpl sayHello = service.getSayHelloImplPort();
        System.out.println(sayHello.sayHello("小林"));
    }
}
