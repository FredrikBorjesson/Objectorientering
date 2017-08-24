package com.company.Uppgift3;

public class Uppgift3 {

    private boolean newEntry;
    private String operator;

    public void onAdd() {
        dryMethod("+");
    }
    public void onSubtract() {
        dryMethod("-");
    }
    public void onMultiply() {
        dryMethod("*");
    }
    public void onDivide() {
        dryMethod("/");
    }

    private void dryMethod(String operator){
        updateDisplay();
        newEntry = true;
        // Do something with operator
    }

    private void updateDisplay(){

    }
}
