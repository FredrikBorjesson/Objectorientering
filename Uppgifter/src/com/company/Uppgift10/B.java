package com.company.Uppgift10;

public class B extends Decorator {

    public B(NamePrinter np) {
        super(np);
    }

    @Override
    public void printName(){
        System.out.println("B");
        super.printName();
    }
}
