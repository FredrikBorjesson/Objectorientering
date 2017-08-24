package com.company.Uppgift7;

public class Rectangle implements Drawable {

    @Override
    public void draw(){
        System.out.println("Drawing rectangle...");
    }

    static {
        DrawableFactory myDrawableFactory = DrawableFactory.getInstance();
        myDrawableFactory.registerDrawable("Rectangle", Rectangle.class);
    }
}
