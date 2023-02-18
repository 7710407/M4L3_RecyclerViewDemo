package com.example.m4l3_recyclerviewdemo;

public class NumberModel {
    String numberName;
    String numberSign;
    String numberLetter;
    int image;

    public NumberModel(String numberName, String numberSign, String numberLetter, int image) {
        this.numberName = numberName;
        this.numberSign = numberSign;
        this.numberLetter = numberLetter;
        this.image = image;
    }

    public String getNumberName() {
        return numberName;
    }

    public String getNumberSign() {
        return numberSign;
    }

    public String getNumberLetter() {
        return numberLetter;
    }

    public int getImage() {
        return image;
    }
}
