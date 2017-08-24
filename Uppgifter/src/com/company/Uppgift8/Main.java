package com.company.Uppgift8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args){
        NameComperator n = new NameComperator();
        List<String> a = new ArrayList<>();
        a.add("The Killers");
        a.add("Radiohead");
        a.add("The strokes");
        a.add("Misfits");
        a.add("Eminem");
        a.add("blblblbl");
        a.add("dgfd");
        a.add("asggh");
        a.add("ASGGo");

        Collections.sort(a, n);
        System.out.println(a);

    }

}
