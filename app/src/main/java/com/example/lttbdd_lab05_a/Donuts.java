package com.example.lttbdd_lab05_a;

import java.text.DecimalFormat;
public class Donuts {
    private  int id;
    private String name;
    private String status;
    private double price;
    private int imagesDonut;

    public Donuts(int id, String name, String status, double price, int imagesDonut) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.price = price;
        this.imagesDonut = imagesDonut;
    }

    public Donuts(int id, String name, String status, double price) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getImagesDonut() {
        return imagesDonut;
    }

    public void setImagesDonut(int imagesDonut) {
        this.imagesDonut = imagesDonut;
    }
    public String getFormatPrice() {
        DecimalFormat df = new DecimalFormat("$ #,###.00");
        return df.format(this.getPrice());
    }
}
