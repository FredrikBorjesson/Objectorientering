package com.company.Uppgift7;

public class Circle implements Drawable{

    @Override
    public void draw(){
        System.out.println("Drawing circle...");
    }

    static {
        DrawableFactory myDrawableFactory = DrawableFactory.getInstance();
        myDrawableFactory.registerDrawable("Circle", Circle.class);
    }

}
