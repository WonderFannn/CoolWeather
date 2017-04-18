package com.personal.wangfan.coolweather.util;

import android.text.TextUtils;

import com.personal.wangfan.coolweather.db.City;
import com.personal.wangfan.coolweather.db.County;
import com.personal.wangfan.coolweather.db.Provence;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Administrator on 2017/4/18 0018.
 */

public class Utility {

    public static boolean handleProvenceResponse (String response){
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray allProvence = new JSONArray(response);
                for (int i = 0; i < allProvence.length(); i++){
                    JSONObject provenceObject = allProvence.getJSONObject(i);
                    Provence provence = new Provence();
                    provence.setProvenceCode(provenceObject.getInt("id"));
                    provence.setProvenceName(provenceObject.getString("name"));
                    provence.save();
                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean handleCityResponse (String response, int provenceId){
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray allCity = new JSONArray(response);
                for (int i = 0; i < allCity.length(); i++){
                    JSONObject cityObject = allCity.getJSONObject(i);
                    City city = new City();
                    city.setCityCode(cityObject.getInt("id"));
                    city.setCityName(cityObject.getString("name"));
                    city.setProvenceId(provenceId);
                    city.save();
                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }

    public static boolean handleCountyResponse (String response, int cityId){
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray allCountry = new JSONArray(response);
                for (int i = 0; i < allCountry.length(); i++){
                    JSONObject countyObject = allCountry.getJSONObject(i);
                    County county = new County();
                    county.setWeatherId(countyObject.getString("weather_id"));
                    county.setCountyName(countyObject.getString("name"));
                    county.setCityId(cityId);
                    county.save();
                }
                return true;
            }catch (JSONException e){
                e.printStackTrace();
            }
        }
        return false;
    }
}
