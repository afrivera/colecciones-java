package org.afrivera.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {

        // coleccion no ordenada
        Set<String> hs = new HashSet<>();
        hs.add("uno"); // retorna un boolean
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        System.out.println(hs);
        // los set no se pueden ordenar mediante el metodo sort

        // no permite elementos repetidos
        boolean b =  hs.add("cuatro");
        System.out.println("Permite elementos duplicados = " + b);


    }
}
