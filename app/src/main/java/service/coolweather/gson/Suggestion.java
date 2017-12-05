package service.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by meibin on 2017/12/5.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    private class Comfort {
        @SerializedName("txt")
        public String info;
    }

    private class CarWash {
        @SerializedName("txt")
        public String info;
    }


    private class Sport {
        @SerializedName("txt")
        public String info;
    }
}
