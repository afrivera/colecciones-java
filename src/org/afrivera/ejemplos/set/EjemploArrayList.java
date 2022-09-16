package org.afrivera.ejemplos.set;

import org.afrivera.ejemplos.model.Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {

        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Kata", 6));
        sa.add(new Alumno("Lucy", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus", 2)); // si se compara por nota, solo recibe el primer valor que coincida con 2 en este caso Zeus

        // Collections.sort(sa, (a, b)-> a.getNota().compareTo(b.getNota()));
        //sa.sort(Comparator.comparing((Alumno a) ->a.getNota()).reversed()); // este si funcionó
        sa.sort(Comparator.comparing(Alumno::getNombre));
        System.out.println("sa = " + sa);


        System.out.println("usando expresiones lambda, iterando usando Stream forEach");
        sa.forEach(alumno -> System.out.println("alumno = " + alumno));
    }
}
