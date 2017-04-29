package com.example.asus.ketquasoxo.Gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ASUS on 4/24/2017.
 */

public class BP {

    @SerializedName("15-04")
    @Expose
    private com.example.asus.ketquasoxo.Gson._1504 _1504;
    @SerializedName("22-04")
    @Expose
    private com.example.asus.ketquasoxo.Gson._2204 _2204;

    public com.example.asus.ketquasoxo.Gson._1504 get1504() {
        return _1504;
    }

    public void set1504(com.example.asus.ketquasoxo.Gson._1504 _1504) {
        this._1504 = _1504;
    }

    public com.example.asus.ketquasoxo.Gson._2204 get2204() {
        return _2204;
    }

    public void set2204(com.example.asus.ketquasoxo.Gson._2204 _2204) {
        this._2204 = _2204;
    }

}
