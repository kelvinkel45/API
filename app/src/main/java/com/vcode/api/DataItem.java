package com.vcode.api;

import java.io.Serializable;

public class DataItem implements Serializable {
    String key, name, code;

    public DataItem(String key, String name, String code) {
        this.key = key;
        this.name = name;
        this.code = code;
    }


    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
}
