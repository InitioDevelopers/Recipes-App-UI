package com.example.recipesapp.Model;

public class BreakfirstDatamodel {
    int id;
    String itemName;
    String kcal;
    String time;
    String chefsName;
    int itemImage;

    public int getChefImagelogo() {
        return chefImagelogo;
    }

    public void setChefImagelogo(int chefImagelogo) {
        this.chefImagelogo = chefImagelogo;
    }

    int chefImagelogo;

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

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }

    public String getChefsName() {
        return chefsName;
    }

    public void setChefsName(String chefsName) {
        this.chefsName = chefsName;
    }
}
