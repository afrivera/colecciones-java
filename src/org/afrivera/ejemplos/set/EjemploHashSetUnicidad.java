package org.afrivera.ejemplos.set;

import org.afrivera.ejemplos.model.Alumno;

import java.util.*;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {

        // todos los objetos que agregan a treeSet deben implementar comparable o sale error de comparable
        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Kata", 6));
        sa.add(new Alumno("Lucy", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus", 2)); // si se compara por nota, solo recibe el primer valor que coincida con 2 en este caso Zeus

        System.out.println("sa = " + sa);

        // loop con forEach
        System.out.println("Iterando usando un foreach");
        for(Alumno a: sa){
            System.out.println("a = " + a.getNombre());
        }

        System.out.println("Iterando usando un while e iterator");
        Iterator<Alumno> it = sa.iterator();
        while(it.hasNext()){
            Alumno a = it.next();
            System.out.println("a = " + a.getNombre());
        }

        System.out.println("usando expresiones lambda, iterando usando Stream forEach");
        sa.forEach(alumno -> System.out.println("alumno = " + alumno.getNombre()));

        System.out.println("utilizando un for clasico, solo para list, arrayList");
        for (int i = 0; i < sa.size(); i++) {
            Alumno a = sa.get(i);
            System.out.println("sa ->" + a.getNombre());

        }
    }
}
