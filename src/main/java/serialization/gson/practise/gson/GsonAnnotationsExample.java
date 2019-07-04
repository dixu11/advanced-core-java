package serialization.gson.practise.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonAnnotationsExample {
    public static void main(String[] args) {
        String mojeDane = "jakis tekst";
        int liczba = 5;



        GsonBuilder gsonBuild = new GsonBuilder();
        gsonBuild.excludeFieldsWithoutExposeAnnotation();
        Gson gson = gsonBuild.create();
        Car car = new Car("audi", "suv");

        // serializacja
        String carJson = gson.toJson(car);
        System.out.println("Serialization: ");
        System.out.println(carJson);

        //deserializacja
        Car car1 = gson.fromJson(carJson,Car.class);
        System.out.println("Deserialization: ");
        System.out.println(car1);

    }
}
