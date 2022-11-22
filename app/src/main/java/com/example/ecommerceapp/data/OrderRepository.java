package com.example.ecommerceapp.data;

import android.app.Application;
import androidx.lifecycle.LiveData;
import com.example.ecommerceapp.daos.OrderDAO;
import com.example.ecommerceapp.data.entities.Order;
import com.example.ecommerceapp.data.model.OrderModel;

import java.util.List;

public class OrderRepository {
    private final OrderDAO orderDAO;

    public OrderRepository(Application application) {
        AppDatabase appDatabase = AppDatabase.getInstance(application);
        this.orderDAO = appDatabase.orderDAO();
    }

    public void createOrder(OrderModel orderModel) {
        this.orderDAO.CREATE_ORDER(orderModel);
    }

    public void updateOrder(OrderModel orderModel) {
        this.orderDAO.UPDATE_ORDER(orderModel);
    }

    public LiveData<Order> getOrder(int orderId) {
        return this.orderDAO.GET_ORDER_BY_ID(orderId);
    }

    public LiveData<List<Order>> getOrders() {
        return this.orderDAO.GET_ORDERS();
    }
}
