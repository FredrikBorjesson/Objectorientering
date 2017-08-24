package com.company.Uppgift4;

public class Singelton {

    private static final Singelton mySingleton = new Singelton();

    public static Singelton getInstance(){
        return mySingleton;
    }

    public String doSomething(){
        return "It's something ¯\\_(ツ)_/¯";
    }
}
