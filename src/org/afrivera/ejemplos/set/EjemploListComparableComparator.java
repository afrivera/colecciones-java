package org.afrivera.ejemplos.set;

import org.afrivera.ejemplos.model.Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EjemploListComparableComparator {
    public static void main(String[] args) {

        List<Alumno> al = new ArrayList<>();
        System.out.println(al + " size: " + al.size());
        System.out.println("está vacia: " + al.isEmpty());
        al.add(new Alumno("Pato", 5));
        al.add(new Alumno("Kata", 6));
        al.add(new Alumno("Lucy", 4));
        al.add(2, new Alumno("Jano", 7)); // si se pone el indice para agregar corre el resto despues de la pos
        al.set(3, new Alumno("Andres", 3)); // en set modifica o reemplaza ese index

        // metodos importantes
        System.out.println(al + " size: " + al.size());
        System.out.println("está vacia: " + al.isEmpty());

        // eliminar
        // al.remove(new Alumno("Jano", 7)); // el objeto debe de ser identico a como esté implementado el equal
        al.remove(2); // también se puede borrar a través del indice
        System.out.println(al + " size: " + al.size());

        // contain
        boolean b = al.contains(new Alumno("Jano", 7));// debe ser los mismos datos
        System.out.println("La lista contiene a Jano? " + b); // true o false depende si no se elimina

        // convertir una lista a arrayList
        Object a[] = al.toArray();
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[i] = " + a[i]);
        }

    }
}
