package serialization.gson.practise.reading;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Tomek", 12);

        Gson gson = new Gson();
        String mojGsonObiektu = gson.toJson(person);
        System.out.println(mojGsonObiektu);

        Person personOdtworzony = gson.fromJson(mojGsonObiektu, Person.class);
        System.out.println(personOdtworzony);

        try {
            FileWriter fileWriter = new FileWriter("mojPerson.json");
            fileWriter.write(mojGsonObiektu);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try(FileWriter fileWriter2 = new FileWriter("text.txt")){
            fileWriter2.write("wlazł kotek\nna płotek\ni pierdut spadł\t...");
        } catch (IOException e) {
            e.printStackTrace();
        }

        String zeskanowany = "";
        try {
            Scanner scanner = new Scanner(new File("mojPerson.json"));
            zeskanowany = scanner.nextLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Person odczytamy = gson.fromJson(zeskanowany, Person.class);
        System.out.println(odczytamy.toString());

    }
}
