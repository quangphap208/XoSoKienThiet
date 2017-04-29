package com.example.asus.ketquasoxo;

import com.example.asus.ketquasoxo.Ngay;

import java.util.ArrayList;

/**
 * Created by ASUS on 4/25/2017.
 */

public class Tinh {
    private String tenTinh;
    private ArrayList<Ngay> ngay;

    public Tinh(String tenTinh, ArrayList<Ngay> ngay) {
        this.tenTinh = tenTinh;
        this.ngay = ngay;
    }

    public String getTenTinh() {
        return tenTinh;
    }

    public void setTenTinh(String tenTinh) {
        this.tenTinh = tenTinh;
    }

    public ArrayList<Ngay> getNgay() {
        return ngay;
    }

    public void setNgay(ArrayList<Ngay> ngay) {
        this.ngay = ngay;
    }
}
