package com.company.Uppgift9;

public class Dependent implements Observer{


    @Override
    public void update(Observable o, Object arg) {
        System.out.println("The subject has been updated");
    }
}
