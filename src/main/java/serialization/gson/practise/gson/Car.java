package serialization.gson.practise.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Car {
    @Expose
    @SerializedName("carName")
    public String name;

    @Expose(serialize = false, deserialize = false)
    public String type;

    public Car() {
    }

    public Car(String audi, String suv) {
    }
}
