package com.company.Uppgift7;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class DrawableFactory {

    private static final DrawableFactory myDrawableFactory = new DrawableFactory();

    public static DrawableFactory getInstance () {
        return myDrawableFactory;
    }

    private final Map<String, Class> classesByType = new HashMap<>();

    public void registerDrawable(String type, Class drawableClass) {
        classesByType.put(type, drawableClass);
    }

    public Drawable createInstance(String type) {
        Class drawableClass = classesByType.get(type);
        Constructor constructor;
        try {
            constructor = drawableClass.getDeclaredConstructor(new Class[] {});
            return (Drawable) constructor.newInstance(new Object[] {});
        } catch (Exception e) {
            throw new RuntimeException("Did not work in DrawableFactory", e);
        }
    }

}
