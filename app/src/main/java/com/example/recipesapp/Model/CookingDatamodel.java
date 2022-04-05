package com.example.recipesapp.Model;

public class CookingDatamodel {
    int id;
    String Number;
    String data;
    String name;
    int image01;
    int image02;


    public int getImage01() {
        return image01;
    }

    public void setImage01(int image01) {
        this.image01 = image01;
    }

    public int getImage02() {
        return image02;
    }

    public void setImage02(int image02) {
        this.image02 = image02;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
