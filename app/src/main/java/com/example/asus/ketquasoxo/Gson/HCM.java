package com.example.asus.ketquasoxo.Gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ASUS on 4/24/2017.
 */

public class HCM {

    @SerializedName("17-04")
    @Expose
    private _1704_ _1704;
    @SerializedName("22-04")
    @Expose
    private _2204_ _2204;
    @SerializedName("24-04")
    @Expose
    private _2404_ _2404;

    public _1704_ get1704() {
        return _1704;
    }

    public void set1704(_1704_ _1704) {
        this._1704 = _1704;
    }

    public _2204_ get2204() {
        return _2204;
    }

    public void set2204(_2204_ _2204) {
        this._2204 = _2204;
    }

    public _2404_ get2404() {
        return _2404;
    }

    public void set2404(_2404_ _2404) {
        this._2404 = _2404;
    }

}