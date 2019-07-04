package serialization.gson.practise.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class People {
    @Expose
    @SerializedName("name")
    private String fullName;
    @Expose
    private String height;
    @SerializedName("mass")
    @Expose
    private String weight;
    @SerializedName("hair_color")
    @Expose
    private String hairColor;
    @SerializedName("skin_color")
    @Expose
    private String skinColor;
    @SerializedName("eye_color")
    @Expose
    private String eyeColor;
    @SerializedName("birth_year")
    @Expose
    private String dataOfBirth;
    @Expose
    private String additionalInfo;
    @Expose
    private int timeStamp;
    //TODO
    
}
