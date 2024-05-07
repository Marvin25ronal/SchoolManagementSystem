package com.example.demo;

public class Curse {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private String name;
    private String description;
    private String category;
    private String labels;
    private double price;
    private String imageUrl;

    public Curse(String name, String description, String category, String labels, double price, String imageUrl) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.labels = labels;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public Curse(){
        this.name = "";
        this.description = "";
        this.category = "";
        this.labels = "";
        this.price = 0;
        this.imageUrl = "";
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getLabels() {
        return labels;
    }

    public double getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
