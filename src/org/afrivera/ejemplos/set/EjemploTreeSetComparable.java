package org.afrivera.ejemplos.set;

import org.afrivera.ejemplos.model.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {

        // todos los objetos que agregan a treeSet deben implementar comparable o sale error de comparable
        Set<Alumno> sa = new TreeSet<>((a, b)->b.getNombre().compareTo(a.getNombre()));
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Kata", 6));
        sa.add(new Alumno("Lucy", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus", 2));

        System.out.println("sa = " + sa);
    }
}
