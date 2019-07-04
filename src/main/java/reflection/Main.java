package reflection;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) {
        //1. W jaki sposób sprawdzić czy pobrany Class jest tablicą?
        int[] tablica = {1, 2, 3};
        Class klasaTablicy = tablica.getClass();
        if (klasaTablicy.isArray()) {
            System.out.println("Ta klasa to tablica");
        } else {
            System.out.println("Nie tablica");
        }

       /* 2. Jak za pomocą obiektu klasy Method wywołać metodę
        sprawdzanego obiektu?*/
        Person person = new Person();
        Class personClass = person.getClass();
        try {
          Method metoda = personClass.getDeclaredMethod("kopnijPilke");
            metoda.invoke(person);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
//3. Jak za pomocą mechanizmów refleksji utworzyć nowy obiekt
        //wybranej klasy?
        Class personClass2 = Person.class;
        Person person2;
        try {
            Constructor<Person> constructor = personClass2.getConstructor();
            person2 = constructor.newInstance();
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }

//        4. Jak z wykorzystaniem mechanizmów refleksji utworzyć
//        nową tablicę?
        int[] liczby = (int[]) Array.newInstance(int.class, 5);


        /*Method[] metodyObiektu = personClass.getDeclaredMethods();
        for (Method method : metodyObiektu) {
            try {
                method.invoke(person);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }*/

        // 7. dostęp do prywatnego pola:
        Person person3 = new Person();
        try {
            Field field = person3.getClass().getDeclaredField("imie"); //NoSuchFieldException
            field.setAccessible(true);
            String myFieldContent = (String) field.get(person3); //IllegalAccessException
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        Person person4=new Person();
        try {
          Method method = person4.getClass().getDeclaredMethod("sayWord", null);
            method.setAccessible(true);
           method.invoke(person4);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }



    }
}
