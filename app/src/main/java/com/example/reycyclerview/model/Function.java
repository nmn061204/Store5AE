package com.example.reycyclerview.model;
import java.io.Serializable;

public class Function implements  Serializable{
     private int ivHinh;
    private String txtTenFunction;

    public Function(int ivHinh, String txtTenFunction) {
        this.ivHinh = ivHinh;
        this.txtTenFunction = txtTenFunction;
    }

    public int getIvHinh() {
        return ivHinh;
    }

    public void setIvHinh(int ivHinh) {
        this.ivHinh = ivHinh;
    }

    public String getTxtTenFunction() {
        return txtTenFunction;
    }

    public void setTxtTenFunction(String txtTenFunction) {
        this.txtTenFunction = txtTenFunction;
    }

    public Function() {

    }
    }


