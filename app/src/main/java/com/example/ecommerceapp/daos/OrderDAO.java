package com.example.ecommerceapp.daos;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.example.ecommerceapp.data.model.OrderModel;
import com.example.ecommerceapp.data.entities.Order;

import java.util.List;

@Dao
public interface OrderDAO {

    @Insert
    void CREATE_ORDER(OrderModel orderModel);

    @Update
    void UPDATE_ORDER(OrderModel orderModel);

    @Query("SELECT * FROM orders WHERE orderId IN (:orderId)")
    LiveData<Order> GET_ORDER_BY_ID(int orderId);


    @Query("SELECT * FROM orders")
    LiveData<List<Order>> GET_ORDERS();
}
