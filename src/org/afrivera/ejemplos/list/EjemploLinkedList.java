package org.afrivera.ejemplos.list;

import org.afrivera.ejemplos.model.Alumno;

import java.util.LinkedList;
import java.util.ListIterator;

public class EjemploLinkedList {
    public static void main(String[] args) {

        LinkedList<Alumno> enlazada = new LinkedList<>();
        System.out.println(enlazada + " size: " + enlazada.size());
        System.out.println("está vacia: " + enlazada.isEmpty());
        enlazada.add(new Alumno("Pato", 5));
        enlazada.add(new Alumno("Kata", 6));
        enlazada.add(new Alumno("Lucy", 4));
        enlazada.add(new Alumno("Jano", 7)); // si se pone el indice para agregar corre el resto despues de la pos
        enlazada.add(new Alumno("Andres", 3)); // en set modifica o reemplaza ese index

        System.out.println(enlazada + " size: " + enlazada.size());
        enlazada.addFirst(new Alumno("Zeus", 5));
        enlazada.addLast(new Alumno("Atenea", 6));
        System.out.println(enlazada + " size: " + enlazada.size());

        // la diferencia entre get y peek es que get lanza la excepcion si está vacio y el otro devuelve null
        System.out.println("Obenter primero y ultimo: " + enlazada.getFirst() + " " + enlazada.getLast());
        System.out.println("Obenter primero y ultimo: " + enlazada.peekFirst() + " " + enlazada.peekLast());
        System.out.println("Obtener indice 2: " + enlazada.get(2));

        Alumno zeus = enlazada.removeFirst(); // lanza excepción y con pollFirst envia null;
        Alumno atenea = enlazada.removeLast();
        System.out.println("zeus = " + zeus);
        System.out.println("atenea = " + atenea);
        System.out.println(enlazada + " size: " + enlazada.size());
//        enlazada.remove() // se elimina por objeto o por index, si se deja solo elimina el primero

        Alumno a = new Alumno("Estaban", 5);
        enlazada.addLast(a);
        System.out.println("Indice de Esteban = " + enlazada.indexOf(a));

        enlazada.remove(enlazada.size() - 1);
        System.out.println(enlazada + " size: " + enlazada.size());

        // para modificar con set
        enlazada.set(1, new Alumno("Lalo", 5));
        System.out.println(enlazada + " size: " + enlazada.size());

        // List Iterator
        ListIterator<Alumno> li = enlazada.listIterator();
        while(li.hasNext()){
            Alumno al = li.next();
            System.out.println(al);
        }
        System.out.println("=".repeat(40));
        while (li.hasPrevious()){
            Alumno al = li.previous();
            System.out.println("al = " + al);
        }

    }
}
