package com.prometheus;

/*
- vyhoda generickeho programovania je ze sa vieme vyhnut classCastException
- V tomto priklade hodi chybu prave v tom classcastexception lebo toto nieje genericke programovanie
- padne to preto lebo string nemoze byt pretypovany na integer
 */

public class Box {
    private Object object;



    public static void main(String[] args) {
        Box integerBox = new Box();
        integerBox.addObject("2"); //integer zabaleny v stringu

        Integer integer = (Integer) integerBox.getObject(); //java.lang.ClassCastException
        System.out.println(integer);

    }



    public void addObject (Object object){
        this.object = object;
    }

    public Object getObject() {
        return object;
    }


}
