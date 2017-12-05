package service.coolweather.gson;

/**
 * Created by meibin on 2017/12/5.
 */

public class AQI {

    public AQIcity icity;

    private class AQIcity {
        public String aqi;
        public String pm25;
    }
}
