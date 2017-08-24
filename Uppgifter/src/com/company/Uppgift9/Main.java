package com.company.Uppgift9;

public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.addObserver(new Dependent());
        subject.modify();
        System.out.println(subject.getN());

    }

}
