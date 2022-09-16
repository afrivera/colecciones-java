package org.afrivera.ejemplos.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {
        // tiene desventaja al ser ordenados
        // mantiene el orden alfabetico

        // reordenar de forma asc o desc
        Set<String> ts = new TreeSet<>((a, b) -> b.compareTo(a));

        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cuatro");
        ts.add("cinco");

        System.out.println(ts);

        // se ordenan de forma autoamtica
        // los objetos deben ser comparables
        Set<Integer> numeros = new TreeSet<>(Comparator.reverseOrder());
        numeros.add(1);
        numeros.add(4);
        numeros.add(3);
        numeros.add(9);
        numeros.add(7);

        System.out.println(numeros);

    }
}
