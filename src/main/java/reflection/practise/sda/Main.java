package reflection.practise.sda;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/* Zadanie:
Rozszerz annotacje Label oraz Writable o parametr order
dostosuj metody setup fields display fields tak żeby wczytywanie odbywało się według tego parametru
*/
public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Student object = new Student();
        object.setImie("John").setNazwisko("Doe").setRokStudiow(5).setSrednia(4.0);
        setupFields(object);
        displayFields(object);

    }

    private static void setupFields(Object object) throws InvocationTargetException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        for (Method setter : object.getClass().getMethods()) {
            // mogę się przeiterować po metodach w jakiejś klasie

            if (setter.isAnnotationPresent(Writable.class)) {
                //mogę sprawdzić czy przyj jakiejś metodzie jest jakaś konkretna adnotacja
                // dostaję się przez Adnotacja.class

                Writable writable = setter.getAnnotation(Writable.class);
                //zapisuje adnotacje pod zmienna

                System.out.println(writable.value());
                //wyswietlam wartosc value adnotacji (to co w nawiasie dalem)

                Class<?> type = setter.getParameterTypes()[0];
                //sprawdzam przez zmienna metody jakiego typu jest jej pierwszy parametr
                //zapisuje ten parametr w specjalnej zmiennej typu Class<?> (majacej niezdefiniowany parametr)

                if (type == String.class) {
                    //jeśli parametr zgagza się z nazwą klasy String to wchodzimy tutaj

                    String value = scanner.nextLine();
                    //pobieram od uzytkownika stringa
                    setter.invoke(object, value);
                    //wywoluje znaleziona metode z klasy Student dajac jej konkretny obiekt i pierwszy argument
                } else if (type == double.class) {
                    //analogicznie jesli typem okazal sie double
                    double value = scanner.nextDouble();
                    scanner.nextLine();
                    setter.invoke(object, value);
                } else if (type == int.class) {
                    //analogicznie jesli typem okazal sie int
                    int value = scanner.nextInt();
                    scanner.nextLine();
                    setter.invoke(object, value);
                } else if (type == Promotor.class) {
                    Promotor promotor = new Promotor();
                    setupFields(promotor);
                    setter.invoke(object,promotor);
                }
            }
        }

    }

    private static void displayFields(Object object) throws InvocationTargetException, IllegalAccessException {
//        object.getClass().getFields()
        for (Method getter : Student.class.getMethods()) {
            if (getter.isAnnotationPresent(Label.class)) {
                Label label = getter.getAnnotation(Label.class);
                Class<?> type = getter.getReturnType();
                if (type == int.class || type == double.class || type == String.class) {
                    String value = getter.invoke(object).toString();
                    System.out.println(label.value() + " - " + value);
                }else {
                    System.out.println(" === " + label.value() + " ===");
                displayFields(getter.invoke(object));
                    System.out.println(" === ===");
                }
            }
        }


       /* for (Method getter : Student.class.getDeclaredMethods()) {
            String getterName = getter.getName();
            if (getter.getName().startsWith("get")) {
                String value = getter.invoke(object).toString();
                System.out.println(getterName.substring(3) + " - " + value);
            }
        }*/


    }
}
