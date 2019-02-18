package com.mike.kulasinski.paczka.modyfikator1;

import com.mike.kulasinski.paczka.modyfikator1.sub.PublicClassSub;

public class InheritPublicSubClass extends PublicClassSub {
    public InheritPublicSubClass() {
        publicWartosc = 100;
        protectedWartosc = 200;
        //defaultWartosc=300; // ERROR default, jestemy w innym pakiecie
        //privateWartosc =400; // ERROR prywatne
    }
}
