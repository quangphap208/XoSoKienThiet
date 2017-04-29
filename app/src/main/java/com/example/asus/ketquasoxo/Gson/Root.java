package com.example.asus.ketquasoxo.Gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ASUS on 4/24/2017.
 */

public class Root {

    @SerializedName("AG")
    @Expose
    private AG aG;
    @SerializedName("BD")
    @Expose
    private BD bD;
    @SerializedName("BL")
    @Expose
    private BL bL;
    @SerializedName("BP")
    @Expose
    private BP bP;
    @SerializedName("BTH")
    @Expose
    private BTH bTH;
    @SerializedName("CM")
    @Expose
    private CM cM;
    @SerializedName("CT")
    @Expose
    private CT cT;
    @SerializedName("HCM")
    @Expose
    private HCM hCM;

    public AG getAG() {
        return aG;
    }

    public void setAG(AG aG) {
        this.aG = aG;
    }

    public BD getBD() {
        return bD;
    }

    public void setBD(BD bD) {
        this.bD = bD;
    }

    public BL getBL() {
        return bL;
    }

    public void setBL(BL bL) {
        this.bL = bL;
    }

    public BP getBP() {
        return bP;
    }

    public void setBP(BP bP) {
        this.bP = bP;
    }

    public BTH getBTH() {
        return bTH;
    }

    public void setBTH(BTH bTH) {
        this.bTH = bTH;
    }

    public CM getCM() {
        return cM;
    }

    public void setCM(CM cM) {
        this.cM = cM;
    }

    public CT getCT() {
        return cT;
    }

    public void setCT(CT cT) {
        this.cT = cT;
    }

    public HCM getHCM() {
        return hCM;
    }

    public void setHCM(HCM hCM) {
        this.hCM = hCM;
    }

}