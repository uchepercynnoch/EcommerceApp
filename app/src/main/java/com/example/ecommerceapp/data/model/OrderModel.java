package com.example.ecommerceapp.data.model;

import java.util.Date;

public class OrderModel {
    private int orderId;
    private int custId;
    private int productId;
    private Date orderDate;
    private String status;

    public OrderModel() {
    }

    public OrderModel(int orderId, int custId, int productId, Date orderDate, String status) {
        this.orderId = orderId;
        this.custId = custId;
        this.productId = productId;
        this.orderDate = orderDate;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
