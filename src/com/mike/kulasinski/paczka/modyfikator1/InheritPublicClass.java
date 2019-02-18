package com.mike.kulasinski.paczka.modyfikator1;

/**
 * Ten sam pakiet i dziedziczenie
 */
public class InheritPublicClass extends PublicClass {

    public InheritPublicClass() {
        publicWartosc = 100;
        protectedWartosc = 200;
        defaultWartosc = 300;
        //privateWartosc =400; // ERROR prywatne
    }
}
