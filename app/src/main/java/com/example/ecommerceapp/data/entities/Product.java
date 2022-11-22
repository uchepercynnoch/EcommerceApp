package com.example.ecommerceapp.data.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "products")
public class Product {
    @PrimaryKey
    private int productId;

    @ColumnInfo(name = "phone_make")
    private String phoneMake;

    @ColumnInfo(name = "phone_model")
    private String phoneModel;

    @ColumnInfo(name = "phone_color")
    private String phoneColor;

    @ColumnInfo(name = "storage_capacity")
    private String storageCapacity;

    @ColumnInfo(name = "price")
    private Double price;


}
