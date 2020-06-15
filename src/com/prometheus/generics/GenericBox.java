package com.prometheus.generics;

/*
- pri generikach pouzivame velke pismena
KONVENCIE :
-  E -> element
-  K -> Key
-  N -> Number
-  T -> Type
-  V -> Value
 */

import com.prometheus.Box;

public class GenericBox <P>{ // generikum P, pri zadefinovani instancie tejto triedy musim vzdy vybrat typ namiesto tohto generika
    private P object; //objekt generickeho typu p



    public static void main(String[] args) {
        GenericBox <String> stringGenericBox = new GenericBox<>(); // musime tam pridat typ namiesto toho P(generika)
        stringGenericBox.addObject("martin");
        String s = stringGenericBox.getObject();
        System.out.println(s);

        GenericBox <Integer> integerGenericBox = new GenericBox<>();
        integerGenericBox.addObject(4);
        Integer integer = integerGenericBox.getObject();
        System.out.println(integer);

        GenericBox genericBox = new GenericBox(); // pojde to aj takto, ale toto je raw generikum, toto nie je dobre pozuivat
        genericBox.addObject("jajaj");
        System.out.println(genericBox.getObject());



    }



    public void addObject (P object){
        this.object = object;
    }

    public P getObject() {
        return object;
    }
}
