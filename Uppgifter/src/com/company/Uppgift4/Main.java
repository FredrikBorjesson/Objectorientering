package com.company.Uppgift4;

public class Main {

    public static void main(String[] args) {

        Singelton mySingelton = Singelton.getInstance();
        System.out.println(mySingelton.doSomething());
    }
}
