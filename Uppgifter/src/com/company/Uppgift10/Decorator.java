package com.company.Uppgift10;

public class Decorator implements NamePrinter {

    private NamePrinter np;

    public Decorator(NamePrinter np){
        this.np = np;
    }

    @Override
    public void printName() {
        np.printName();
    }


}
