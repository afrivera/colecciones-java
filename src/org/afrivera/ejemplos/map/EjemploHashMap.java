package org.afrivera.ejemplos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {
    public static void main(String[] args) {

        // no es de la interfaz collection
        Map<String, String> persona = new HashMap<>();
        System.out.println("Contiene elementos: " + !persona.isEmpty());
        persona.put(null, "1234");
        persona.put(null, "12345"); // solo deja una llave con un nombre
        persona.put("nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("apellidoPaterno", "Roe"); // lo mismo del anterior, solo deja una llave y es la primera
        persona.put("email", "John.doe@correo.com");
        persona.put("edad", "30");

        System.out.println("persona = " + persona);

        // formas para obtener el valor
        // String nombre = persona.get("nombre");
        String nombre = persona.get("nombre");
        System.out.println("nombre = " + nombre);

        String apellido = persona.get("apellido");
        System.out.println("apellido = " + apellido);

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
        Collection<String> valores = persona.values();
        for(String v: valores){
            System.out.println(v);
        }

        // .keySet retorna un set de los string no ordenado
        Set<String> llaves = persona.keySet();
        for(String k: llaves){
            System.out.println("k = " + k);
        }

        // otra forma de iterar llave valor
        for(Map.Entry<String, String> par: persona.entrySet()){
            System.out.println(par.getKey() + "=> " + par.getValue());
        }
        System.out.println("=".repeat(40));
        for(String llave: persona.keySet()){
            String valor = persona.get(llave);
            System.out.println(llave+ "=> =>" + valor);
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
