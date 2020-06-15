package com.prometheus.generics;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class RawType { // neni uvedene generikum za stare verzie javy, ktora to nepouzivala
    GenericBox <String> stringBox; //normalne zadefinovany genericky box
    GenericBox rawBox; // raw box

/*
- Vzdy sa treba vyhnut rawtypu a vzdy zadefinovat hore generikum a o aky typ ide,
- takto napisany kod spadne, ale pri pisani nevypisuje chybu
 */

    public static void main(String[] args) {
        List names = new ArrayList();
        names.add("John");
        names.add("maaaa");
        names.add(Boolean.FALSE);


        for (Object o : names){
            String name = (String) o;
            System.out.println(name);
        }
    }




}
