package com.personal.wangfan.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by wangfan on 2017/4/14.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provenceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvenceId() {
        return provenceId;
    }

    public void setProvenceId(int provenceId) {
        this.provenceId = provenceId;
    }
}
