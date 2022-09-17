package org.afrivera.ejemplos.map;

import java.util.*;

public class EjemploTreeMap {
    public static void main(String[] args) {

        // el treeMap no admite elementos nulos
        // Map<String, Object> persona = new TreeMap<>((a,b)->b.compareTo(a)); // el compare para ordenar desc
        // Map<String, Object> persona = new TreeMap<>(Comparator.reverseOrder()); // otra forma de ordenar desc
        Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length).reversed()); // ordenar por el largo del string
        System.out.println("Contiene elementos: " + !persona.isEmpty());
        persona.put("nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("apellidoPaterno", "Roe"); // lo mismo del anterior, solo deja una llave y es la primera
        persona.put("email", "John.doe@correo.com");
        persona.put("edad", "30");

        // creando un map
        Map<String, String> direccion = new TreeMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One Street");
        direccion.put("numero", "120");

        persona.put("direccion", direccion); // así se pueden anidar hashmap

        // ordena de manera natural a través de la llave
        System.out.println("persona = " + persona);

    }
}
