package Homework1;

import java.util.HashMap;
import java.util.Map;

public class Person{
    public static void main(String[] args) {
        HashMap<String, String> person = new HashMap<String, String>();

        person.put("Palaida", "Dmytro");
        person.put("Ivanov", "Ivan");
        person.put("Kick", "Roman");
        person.put("Pal", "Palov");
        person.put("Palaida", "Roman");
        person.put("Kru", "Dmytro");
        person.put("Orest", "Orest");
        person.put("Mazepa", "Svitlana");
        person.put("Palkin", "Misha");
        person.put("Palaida", "Oksana");

        for (Map.Entry<String, String> entry : person.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }
        // three persons have the same Last Name, as were not printed

        String name = person.remove("Orest");
        {
            System.out.println("Updated personMap: " + person);
        }

        }


    }
