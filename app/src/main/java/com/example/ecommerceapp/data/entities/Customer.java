package com.example.ecommerceapp.data.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "customers")
public class Customer {
    @PrimaryKey
    private int custId;

    @ColumnInfo(name = "username")
    private String username;

    @ColumnInfo(name = "password")
    private String password;

    @ColumnInfo(name = "first_name")
    private String firstname;

    @ColumnInfo(name = "first_name")
    private String lastname;

    @ColumnInfo(name = "first_name")
    private String address;

    @ColumnInfo(name = "city")
    private String city;

    @ColumnInfo(name = "postal_code")
    private String postalCode;

}
