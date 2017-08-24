package com.company.Uppgift9;

import java.util.List;

public class Observable {

    Observer observer;

    public void addObserver(Observer o){
        observer = o;
        System.out.println("Added");
    }

    public void notifyObserver(Object arg){
        observer.update(this, arg);
    }
}
