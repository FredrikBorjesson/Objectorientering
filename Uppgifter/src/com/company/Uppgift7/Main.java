package com.company.Uppgift7;

public class Main {

    public static void main(String[] args) {

        try {
            Class.forName("com.company.Uppgift7.Rectangle");
            Class.forName("com.company.Uppgift7.Circle");
        } catch (ClassNotFoundException e){
            throw new RuntimeException("Did not work", e);
        }
        DrawableFactory myDrawableFactory = DrawableFactory.getInstance();
        myDrawableFactory.createInstance("Rectangle").draw();
        myDrawableFactory.createInstance("Circle").draw();

    }
}
