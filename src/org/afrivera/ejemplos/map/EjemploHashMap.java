package org.afrivera.ejemplos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {
    public static void main(String[] args) {

        // no es de la interfaz collection
        Map<String, Object> persona = new HashMap<>();
        System.out.println("Contiene elementos: " + !persona.isEmpty());
        persona.put(null, "1234");
        persona.put(null, "12345"); // solo deja una llave con un nombre
        persona.put("nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("apellidoPaterno", "Roe"); // lo mismo del anterior, solo deja una llave y es la primera
        persona.put("email", "John.doe@correo.com");
        persona.put("edad", "30");

        // creando un map
        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One Street");
        direccion.put("numero", "120");

        persona.put("direccion", direccion); // así se pueden anidar hashmap

        System.out.println("persona = " + persona);

        // formas para obtener el valor
        // String nombre = persona.get("nombre");
        String nombre = (String) persona.get("nombre");
        System.out.println("nombre = " + nombre);

        String apellido = (String) persona.get("apellido");
        System.out.println("apellido = " + apellido);

        Map<String, String> dir = (Map<String, String>) persona.get("direccion");

        String pais = dir.get("pais");
        String ciudad = dir.get("ciudad");
        String barrio = dir.getOrDefault("barrio", "la Playa"); // get defaul es por si no encuentra la llave se retorne el valor definido
        System.out.println("El pais de John es: " + pais);
        System.out.println("la ciudad de John es: " + ciudad);
        System.out.println("El barrio de John es: " + barrio);
        // clear para borrar todos los elementos
        // persona.clear();

        // borrar con remove, retorna el valor
        // String valorApell = persona.remove("apellido");
        boolean b = persona.remove("apellidoPaterno", "Roe"); // cuando se pone key y value retorna un boolean
        System.out.println("valorApell = " + b);
        
        // contains retorna un boolean
        boolean b2 = persona.containsKey("apellido");
        System.out.println("b2 = " + b2);

        b2 = persona.containsValue("Doe"); // containns valuepara buscar por valor
        System.out.println("b2 = " + b2);

        // .values retorna la coleccion de los valores en su tipo, no es ordenado
        Collection<Object> valores = persona.values();
        for(Object v: valores){
            System.out.println(v);
        }

        // .keySet retorna un set de los string no ordenado
        Set<String> llaves = persona.keySet();
        for(String k: llaves){
            System.out.println("k = " + k);
        }

        // otra forma de iterar llave valor
        for(Map.Entry<String, Object> par: persona.entrySet()){
            System.out.println(par.getKey() + "=> " + par.getValue());
        }
        System.out.println("=".repeat(40));
        // keySet
        for(String llave: persona.keySet()){
            Object valor = persona.get(llave);
            if(valor instanceof Map){
                Map<String, String> dirMap = (Map<String, String>) valor;
                System.out.println("El pais de " + persona.get("nombre") + ": " +
                        dirMap.get("pais"));
                System.out.println("la ciudad es: " + dirMap.get("ciudad"));
            }else {
                System.out.println(llave + "=> =>" + valor);
            }
        }

        // java 8 foreach
        persona.forEach((llave, valor)->{
            System.out.println(llave+ "foreach => " + valor);
        });

//        total
        System.out.println("total " + persona.size());
        System.out.println("Contiene elementos: " + !persona.isEmpty());

        // reemplazar un valor
        persona.replace("nombres", "Andrés"); // la llave debe existir o no realiza nada, retorna el valor cambiado
        persona.replace("nombres","John", "Andrés"); // otro metodo, retorna un boolean
        System.out.println("persona = " + persona);
    }
}
