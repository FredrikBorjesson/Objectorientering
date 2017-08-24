package com.company.Uppgift9;

public class Subject extends Observable{

    private int n = 0;
    public void modify() {
        n++;
        notifyObserver(this);
    }
    public int getN() {
        return n;
    }
    public static void main(String[] args) {
        Subject subject = new Subject();
        for (int i = 0; i < 3; i++) {
            subject.modify();
        }
    }
}
