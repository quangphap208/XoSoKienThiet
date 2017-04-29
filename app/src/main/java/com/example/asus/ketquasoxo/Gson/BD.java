package com.example.asus.ketquasoxo.Gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ASUS on 4/24/2017.
 */

public class BD {

    @SerializedName("14-04")
    @Expose
    private com.example.asus.ketquasoxo.Gson._1404 _1404;
    @SerializedName("21-04")
    @Expose
    private com.example.asus.ketquasoxo.Gson._2104 _2104;

    public com.example.asus.ketquasoxo.Gson._1404 get1404() {
        return _1404;
    }

    public void set1404(com.example.asus.ketquasoxo.Gson._1404 _1404) {
        this._1404 = _1404;
    }

    public com.example.asus.ketquasoxo.Gson._2104 get2104() {
        return _2104;
    }

    public void set2104(com.example.asus.ketquasoxo.Gson._2104 _2104) {
        this._2104 = _2104;
    }

}
