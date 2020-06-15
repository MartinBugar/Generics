package com.prometheus.generics;
/*
- Obmedzenie typovych parametrov - bounded type parameters
 */

import com.prometheus.objects.NejakyPes;
import com.prometheus.objects.Pes;

public class BoundedType <P extends Pes> { // P mi nahradza len typy ktore extenduju triedu Pes (Pes alebo NejakyPes)

    private P objectPsa; // cize toto moze byt typ Pes alebo NejakyPes

    public P getObjectPsa() {
        return objectPsa;
    }

    public void setObjectPsa(P objectPsa) {  // vstupit moze len typ triedy pes alebo nejakypes
        this.objectPsa = objectPsa;
    }

    public void boundedStekaj(){
        objectPsa.stekaj(); // potom ako si nasetujem tento objekt tuto cez setter tak to mozem takto zavolat metodu triedy pes stekaj
    }

    public static void main(String[] args) {
      //  BoundedType <Pes> pes = new BoundedType<>();
      //  BoundedType <NejakyPes> pes2 = new BoundedType<>();

        /*
        - ked si nasetujeme objekt psa do nasho objektu bounded type, tak mozem zavolat metodou
         */

        BoundedType <NejakyPes> NejakyPesBoundedType = new BoundedType<>(); // nova instancia bounded type, az pri zadefinovani si mozem urcit akeho typu to ma byt, kedze je to genericke ale
        // instancia tejto hlavnej triedy musi byt zachovana, a az potom sa napise predstavenie akeho typu je to generikum
        NejakyPesBoundedType.setObjectPsa(new NejakyPes());
        NejakyPesBoundedType.boundedStekaj();

        System.out.println();

        BoundedType <Pes> pesBoundedType = new BoundedType<>(); // nova instancia bounded type
        pesBoundedType.setObjectPsa(new Pes());
        pesBoundedType.boundedStekaj();

        Pes psicek = new Pes();
        psicek.stekaj();
    }
}
