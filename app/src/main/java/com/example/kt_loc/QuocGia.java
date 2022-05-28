package com.example.kt_loc;

import java.util.ArrayList;

public class QuocGia {
    int hinh;
    String ten,so;

    public QuocGia(int hinh, String ten, String so) {
        this.hinh = hinh;
        this.ten = ten;
        this.so = so;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    ArrayList<QuocGia> quocGias = new ArrayList<>();
    public  static  ArrayList<QuocGia> dulieu(){


        int co[]={R.drawable.icons8_vietnam_96,R.drawable.icons8_usa_96__1_,R.drawable.icons8_russian_federation_96,R.drawable.icons8_japan_96,R.drawable.icons8_spain_96,R.drawable.icons8_portugal_96,R.drawable.icons8_france_96,R.drawable.icons8_germany_96,R.drawable.icons8_england_circular_96,R.drawable.icons8_flag_67};
        String tenco[]={"Việt Nam","Mỹ","Nga","Nhật Bản","Tây Ban Nha","Bồ Đào Nha","Pháp","Đức","Anh","Hà Lan"};
        String danso[]={"Population:100000000","Population:100000000","Population:100000000","Population:100000000","Population:100000000","Population:100000000","Population:100000000","Population:100000000","Population:100000000","Population:100000000"};
        ArrayList<QuocGia> x = new ArrayList<>();
        for(int i=0; i< tenco.length;i++){
            x.add(new QuocGia(co[i], tenco[i],danso[i] ));
        }
        return  x;

    }
}
