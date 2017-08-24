package com.company.Uppgift8;

import java.util.Collections;
import java.util.Comparator;

public class NameComperator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String name1 = (String) o1;
        String name2 = (String) o2;
        if(name1.startsWith("The ")){
            name1 = name1.substring(4);
        }
        if(name2.startsWith("The ")){
            name2 = name2.substring(4);
        }
        return name1.toLowerCase().compareTo(name2.toLowerCase());
    }
}
