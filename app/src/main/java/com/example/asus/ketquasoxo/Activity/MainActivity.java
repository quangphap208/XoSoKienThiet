package com.example.asus.ketquasoxo.Activity;

import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.asus.ketquasoxo.PagerAdapter;
import com.example.asus.ketquasoxo.Ngay;
import com.example.asus.ketquasoxo.Tinh;
import com.example.asus.ketquasoxo.Fragment.XoSoFragment;
import com.example.asus.ketquasoxo.R;
import com.ogaclejapan.smarttablayout.SmartTabLayout;

import java.util.ArrayList;
import java.util.List;

import static com.example.asus.ketquasoxo.VariableStatic.KQXS;
import static com.example.asus.ketquasoxo.VariableStatic.KQXS;
import static com.example.asus.ketquasoxo.VariableStatic.root;

public class MainActivity extends AppCompatActivity {

    private ViewPager pager;
    private SmartTabLayout tabLayout;
    private PagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        addControls();
    }

    private void addControls() {
        getData();
        findId();
        addViewPager();
    }

    private void addViewPager() {
        List<XoSoFragment> list = new ArrayList<XoSoFragment>();
        String[] nameTab = new String[100];

        for (int i = 0; i < 8; i++) {
            list.add(new XoSoFragment(KQXS.get(i).getNgay()));
            nameTab[i] = KQXS.get(i).getTenTinh();
        }
        FragmentManager manager = getSupportFragmentManager();
        adapter = new PagerAdapter(manager, list, nameTab);
        pager.setAdapter(adapter);
        pager.setOffscreenPageLimit(1);
        tabLayout.setViewPager(pager);
    }

    private void findId() {
        pager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout = (SmartTabLayout) findViewById(R.id.tab_layout);
    }

    private void getData() {
        KQXS.add(getTinhHCM());
        KQXS.add(getTinhCT());
        KQXS.add(getTinhCM());
        KQXS.add(getTinhBTH());
        KQXS.add(getTinhBP());
        KQXS.add(getTinhBL());
        KQXS.add(getTinhBD());
        KQXS.add(getTinhAG());
    }

    private Tinh getTinhAG() {
        Tinh BTH = null;

        Ngay ngay18_04_BTH = new Ngay("20-04",
                root.getAG().get2004().get1(),
                root.getAG().get2004().get2(),
                root.getAG().get2004().get3(),
                root.getAG().get2004().get4(),
                root.getAG().get2004().get5(),
                root.getAG().get2004().get6(),
                root.getAG().get2004().get7(),
                root.getAG().get2004().get8(),
                root.getAG().get2004().getDB());


        ArrayList<Ngay> arlNgayHCM = new ArrayList<Ngay>();
        arlNgayHCM.add(ngay18_04_BTH);
        BTH = new Tinh("AG", arlNgayHCM);
        return BTH;
    }

    private Tinh getTinhBD() {
        Tinh CM = null;

        Ngay ngay17_04_CM = new Ngay("14-04",
                root.getBD().get1404().get1(),
                root.getBD().get1404().get1(),
                root.getBD().get1404().get1(),
                root.getBD().get1404().get1(),
                root.getBD().get1404().get1(),
                root.getBD().get1404().get1(),
                root.getBD().get1404().get1(),
                root.getBD().get1404().get1(),
                root.getBD().get1404().getDB());

        Ngay ngay24_04_CM = new Ngay("21-04",
                root.getBD().get2104().get1(),
                root.getBD().get2104().get2(),
                root.getBD().get2104().get3(),
                root.getBD().get2104().get4(),
                root.getBD().get2104().get5(),
                root.getBD().get2104().get6(),
                root.getBD().get2104().get7(),
                root.getBD().get2104().get8(),
                root.getBD().get2104().getDB());


        ArrayList<Ngay> arlNgayHCM = new ArrayList<Ngay>();
        arlNgayHCM.add(ngay17_04_CM);
        arlNgayHCM.add(ngay24_04_CM);
        CM = new Tinh("BD", arlNgayHCM);
        return CM;
    }

    private Tinh getTinhBL() {
        Tinh BTH = null;

        Ngay ngay18_04_BTH = new Ngay("18-04",
                root.getBL().get1804().get1(),
                root.getBL().get1804().get2(),
                root.getBL().get1804().get3(),
                root.getBL().get1804().get4(),
                root.getBL().get1804().get5(),
                root.getBL().get1804().get6(),
                root.getBL().get1804().get7(),
                root.getBL().get1804().get8(),
                root.getBL().get1804().getDB());


        ArrayList<Ngay> arlNgayHCM = new ArrayList<Ngay>();
        arlNgayHCM.add(ngay18_04_BTH);
        BTH = new Tinh("BL", arlNgayHCM);
        return BTH;
    }

    private Tinh getTinhBP() {
        Tinh CM = null;

        Ngay ngay15_04_BP = new Ngay("15-04",
                root.getBP().get1504().get1(),
                root.getBP().get1504().get2(),
                root.getBP().get1504().get3(),
                root.getBP().get1504().get4(),
                root.getBP().get1504().get5(),
                root.getBP().get1504().get6(),
                root.getBP().get1504().get7(),
                root.getBP().get1504().get8(),
                root.getBP().get1504().getDB());

        Ngay ngay22_04_BP = new Ngay("22-04",
                root.getBP().get2204().get1(),
                root.getBP().get2204().get2(),
                root.getBP().get2204().get3(),
                root.getBP().get2204().get4(),
                root.getBP().get2204().get5(),
                root.getBP().get2204().get6(),
                root.getBP().get2204().get7(),
                root.getBP().get2204().get8(),
                root.getBP().get2204().getDB());


        ArrayList<Ngay> arlNgayHCM = new ArrayList<Ngay>();
        arlNgayHCM.add(ngay15_04_BP);
        arlNgayHCM.add(ngay22_04_BP);
        CM = new Tinh("BP", arlNgayHCM);
        return CM;
    }

    private Tinh getTinhBTH() {
        Tinh BTH = null;

        Ngay ngay20_04_BTH = new Ngay("20-04",
                root.getBTH().get2004().get1(),
                root.getBTH().get2004().get2(),
                root.getBTH().get2004().get3(),
                root.getBTH().get2004().get4(),
                root.getBTH().get2004().get5(),
                root.getBTH().get2004().get6(),
                root.getBTH().get2004().get7(),
                root.getBTH().get2004().get8(),
                root.getBTH().get2004().getDB());


        ArrayList<Ngay> arlNgayHCM = new ArrayList<Ngay>();
        arlNgayHCM.add(ngay20_04_BTH);
        BTH = new Tinh("BTH", arlNgayHCM);
        return BTH;
    }

    private Tinh getTinhHCM() {
        Tinh HCM = null;

        Ngay ngay17_04_HCM = new Ngay("17-04",
                root.getHCM().get1704().get1(),
                root.getHCM().get1704().get2(),
                root.getHCM().get1704().get3(),
                root.getHCM().get1704().get4(),
                root.getHCM().get1704().get5(),
                root.getHCM().get1704().get6(),
                root.getHCM().get1704().get7(),
                root.getHCM().get1704().get8(),
                root.getHCM().get1704().getDB());

        Ngay ngay22_04_HCM = new Ngay("22-04",
                root.getHCM().get2204().get1(),
                root.getHCM().get2204().get2(),
                root.getHCM().get2204().get3(),
                root.getHCM().get2204().get4(),
                root.getHCM().get2204().get5(),
                root.getHCM().get2204().get6(),
                root.getHCM().get2204().get7(),
                root.getHCM().get2204().get8(),
                root.getHCM().get2204().getDB());

        Ngay ngay24_04_HCM = new Ngay("24-04",
                root.getHCM().get2404().get1(),
                root.getHCM().get2404().get2(),
                root.getHCM().get2404().get3(),
                root.getHCM().get2404().get4(),
                root.getHCM().get2404().get5(),
                root.getHCM().get2404().get6(),
                root.getHCM().get2404().get7(),
                root.getHCM().get2404().get8(),
                root.getHCM().get2404().getDB());

        ArrayList<Ngay> arlNgayHCM = new ArrayList<Ngay>();
        arlNgayHCM.add(ngay17_04_HCM);
        arlNgayHCM.add(ngay22_04_HCM);
        arlNgayHCM.add(ngay24_04_HCM);

        HCM = new Tinh("HCM", arlNgayHCM);
        return HCM;
    }

    private Tinh getTinhCT() {
        Tinh CT = null;

        Ngay ngay19_04_CT = new Ngay("19-04",
                root.getCT().get1904().get1(),
                root.getCT().get1904().get2(),
                root.getCT().get1904().get3(),
                root.getCT().get1904().get4(),
                root.getCT().get1904().get5(),
                root.getCT().get1904().get6(),
                root.getCT().get1904().get7(),
                root.getCT().get1904().get8(),
                root.getCT().get1904().getDB());


        ArrayList<Ngay> arlNgayHCM = new ArrayList<Ngay>();
        arlNgayHCM.add(ngay19_04_CT);
        CT = new Tinh("CT", arlNgayHCM);
        return CT;
    }

    private Tinh getTinhCM() {
        Tinh CM = null;

        Ngay ngay17_04_CM = new Ngay("17-04",
                root.getCM().get1704().get1(),
                root.getCM().get1704().get2(),
                root.getCM().get1704().get3(),
                root.getCM().get1704().get4(),
                root.getCM().get1704().get5(),
                root.getCM().get1704().get6(),
                root.getCM().get1704().get7(),
                root.getCM().get1704().get8(),
                root.getCM().get1704().getDB());

        Ngay ngay24_04_CM = new Ngay("24-04",
                root.getCM().get2404().get1(),
                root.getCM().get2404().get2(),
                root.getCM().get2404().get3(),
                root.getCM().get2404().get4(),
                root.getCM().get2404().get5(),
                root.getCM().get2404().get6(),
                root.getCM().get2404().get7(),
                root.getCM().get2404().get8(),
                root.getCM().get2404().getDB());


        ArrayList<Ngay> arlNgayHCM = new ArrayList<Ngay>();
        arlNgayHCM.add(ngay17_04_CM);
        arlNgayHCM.add(ngay24_04_CM);
        CM = new Tinh("CM", arlNgayHCM);
        return CM;
    }


}
