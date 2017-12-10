package service.coolweather.db;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by max on 2017/12/8.
 */

public class BingYingPic {
    @SerializedName("images")
    public List<BaseBingPic> images;

    public class BaseBingPic {

        @SerializedName("url")
        public String bingUrl;

    }
}
