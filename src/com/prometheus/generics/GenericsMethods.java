package com.prometheus.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class GenericsMethods {
    /*
    - predstavenie typovych parametrov sa uvadza pred navratovou hodnotou metody
    - vstupny parameter do tejto nasej metody bude hashmap , ktory ma kluc long a objekt nejakeho typu
     */
    private static <T> ArrayList <T> preklopMapNaList (HashMap <Long, T> collection){ // hashmap ma kluc typu long a objekt typu T, to sa preklopy na ArrayList ktory ma ten isty datovy typ
        ArrayList <T> list = new ArrayList<>(); // vytvorim si novy list generickeho typu T

        for (Long key : collection.keySet()){  //key typu long prechadza cez zoznam klucov kolekcie ktora tam vstupuje
            list.add(collection.get(key));
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList <String> stringList = new ArrayList<>(); // vytvori novy prazdny arraylist typu string
        LinkedHashMap <Long, String> stringLinkedHashMap = new LinkedHashMap<>();
        stringList = preklopMapNaList(stringLinkedHashMap);

        ArrayList <Integer> integerList = new ArrayList<>();
        LinkedHashMap <Long, Integer> integerLinkedHashMap = new LinkedHashMap<>();
        integerList = preklopMapNaList(integerLinkedHashMap);

    }
}
