package com.example.ecommerceapp.data.model;

public class ProductModel {
    private int productId;
    private String phoneMake;
    private String phoneModel;
    private String phoneColor;
    private String storageCapacity;
    private Double price;

    public ProductModel() {
    }

    public ProductModel(int productId, String phoneMake, String phoneModel, String phoneColor, String storageCapacity, Double price) {
        this.productId = productId;
        this.phoneMake = phoneMake;
        this.phoneModel = phoneModel;
        this.phoneColor = phoneColor;
        this.storageCapacity = storageCapacity;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getPhoneMake() {
        return phoneMake;
    }

    public void setPhoneMake(String phoneMake) {
        this.phoneMake = phoneMake;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public String getPhoneColor() {
        return phoneColor;
    }

    public void setPhoneColor(String phoneColor) {
        this.phoneColor = phoneColor;
    }

    public String getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(String storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
