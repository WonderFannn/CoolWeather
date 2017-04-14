package com.personal.wangfan.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by wangfan on 2017/4/14.
 */

public class Provence extends DataSupport {
    private int id;
    private String provenceName;
    private int provenceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvenceName() {
        return provenceName;
    }

    public void setProvenceName(String provenceName) {
        this.provenceName = provenceName;
    }

    public int getProvenceCode() {
        return provenceCode;
    }

    public void setProvenceCode(int provenceCode) {
        this.provenceCode = provenceCode;
    }
}
