package com.company.Uppgift10;

public class C extends Decorator {

    public C(NamePrinter np) {
        super(np);
    }

    @Override
    public void printName(){
        System.out.println("C");
        super.printName();
    }
}
