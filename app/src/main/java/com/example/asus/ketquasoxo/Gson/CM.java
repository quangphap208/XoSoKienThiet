package com.example.asus.ketquasoxo.Gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ASUS on 4/24/2017.
 */

public class CM {

    @SerializedName("17-04")
    @Expose
    private com.example.asus.ketquasoxo.Gson._1704 _1704;
    @SerializedName("24-04")
    @Expose
    private com.example.asus.ketquasoxo.Gson._2404 _2404;

    public com.example.asus.ketquasoxo.Gson._1704 get1704() {
        return _1704;
    }

    public void set1704(com.example.asus.ketquasoxo.Gson._1704 _1704) {
        this._1704 = _1704;
    }

    public com.example.asus.ketquasoxo.Gson._2404 get2404() {
        return _2404;
    }

    public void set2404(com.example.asus.ketquasoxo.Gson._2404 _2404) {
        this._2404 = _2404;
    }

}
