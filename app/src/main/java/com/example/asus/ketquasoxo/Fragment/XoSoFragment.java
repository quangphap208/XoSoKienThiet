package com.example.asus.ketquasoxo.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.asus.ketquasoxo.RecylerViewAdapter;
import com.example.asus.ketquasoxo.Ngay;
import com.example.asus.ketquasoxo.R;

import java.util.ArrayList;

/**
 * Created by ASUS on 4/25/2017.
 */

public class XoSoFragment extends Fragment {
    ArrayList<Ngay> arlNgay;
    RecyclerView rv;
    RecylerViewAdapter adapter;
    @SuppressLint("ValidFragment")
    public XoSoFragment(ArrayList<Ngay> arlNgay) {
        this.arlNgay = arlNgay;
    }

    public XoSoFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LinearLayout mLinearLayout = (LinearLayout) inflater.inflate(R.layout.xoso_fragment, container, false);
        addControls(mLinearLayout);
       // addEvents();
        return mLinearLayout;
    }
    private void addControls(LinearLayout mLinearLayout) {
        findId(mLinearLayout);
        addDataToRyclerView();

    }

    private void addDataToRyclerView() {
        adapter = new RecylerViewAdapter(arlNgay, getContext());
        rv.setAdapter(adapter);
        GridLayoutManager linearLayoutManager = new GridLayoutManager(getContext(),2);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(linearLayoutManager);
    }

    private void findId(LinearLayout mLinearLayout) {
        rv = (RecyclerView) mLinearLayout.findViewById(R.id.rvList);
    }
}
