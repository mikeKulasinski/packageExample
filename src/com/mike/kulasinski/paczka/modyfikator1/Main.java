package com.mike.kulasinski.paczka.modyfikator1;

import com.mike.kulasinski.paczka.modyfikator1.sub.PublicClassSub;

public class Main {

    public static void main(String[] args) {
        widocznoscKlass();

        PublicClass publicClass = new PublicClass();
        publicClass.publicWartosc = 100; // OK
        publicClass.protectedWartosc = 300; // OK
        publicClass.defaultWartosc = 400; // OK
        //publicClass.privateWartosc = 500; // ERROR bo prywatny dostep

        DefaultClass defaultClass = new DefaultClass();
        defaultClass.publicWartosc = 100; // OK
        defaultClass.protectedWartosc = 300; // OK
        defaultClass.defaultWartosc = 400; // OK
        //defaultClass.privateWartosc = 500; // ERROR bo prywatny dostep

        PublicClassSub publicClassSub = new PublicClassSub();
        publicClassSub.publicWartosc = 100; // OK
        //publicClassSub.protectedWartosc = 300; // ERROR bo protected, poza pakietem
        //publicClassSub.defaultWartosc = 400; // ERROR bo pakcage protected (default)
        //publicClassSub.privateWartosc = 500; // ERROR bo prywatny dostep
    }

    private static void widocznoscKlass() {
        PublicClass publicClass = new PublicClass(); // OK
        DefaultClass defaultClass = new DefaultClass(); // OK
        PublicClassSub publicClassSub = new PublicClassSub(); // OK
        //DefaultClassSub defaultClassSub = new DefaultClassSub(); // ERROR bo package protected (default)
    }
}
