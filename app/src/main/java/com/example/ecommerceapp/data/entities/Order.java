package com.example.ecommerceapp.data.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "orders")
public class Order {
    @PrimaryKey
    private int orderId;

    @ColumnInfo(name = "cust_id")
    private int custId;

    @ColumnInfo(name = "product_id")
    private int productId;

    @ColumnInfo(name = "order_date")
    private Date orderDate;

    @ColumnInfo(name = "status")
    private String status;

}
