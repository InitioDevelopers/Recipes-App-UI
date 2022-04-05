package com.example.recipesapp.Model;

public class TrandingNowDataModel {
    int id;
    String itemName;
    int imageItem;
    String kcal;
    String time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getImageItem() {
        return imageItem;
    }

    public void setImageItem(int imageItem) {
        this.imageItem = imageItem;
    }

    public String getKcal() {
        return kcal;
    }

    public void setKcal(String kcal) {
        this.kcal = kcal;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}