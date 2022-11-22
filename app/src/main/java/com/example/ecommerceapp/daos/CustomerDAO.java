package com.example.ecommerceapp.daos;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.example.ecommerceapp.data.model.CustomerModel;
import com.example.ecommerceapp.data.entities.Customer;

import java.util.List;
import java.util.Optional;

@Dao
public interface CustomerDAO {

    @Insert
    void CREATE_CUSTOMER(CustomerModel customerModel);

    @Update
    void UPDATE_CUSTOMER(CustomerModel customerModel);

    @Query("SELECT * FROM customers WHERE custId IN (:customerId)")
    LiveData<Customer> GET_CUSTOMER_BY_ID(int customerId);


    @Query("SELECT * FROM customers")
    LiveData<List<Customer>> GET_CUSTOMERS();
}
