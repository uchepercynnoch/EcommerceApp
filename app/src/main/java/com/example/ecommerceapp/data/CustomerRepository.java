package com.example.ecommerceapp.data;

import android.app.Application;
import androidx.lifecycle.LiveData;
import com.example.ecommerceapp.daos.CustomerDAO;
import com.example.ecommerceapp.data.entities.Customer;
import com.example.ecommerceapp.data.model.CustomerModel;

import java.util.List;

public class CustomerRepository {
    private final CustomerDAO customerDAO;

    public CustomerRepository(Application application) {
        AppDatabase appDatabase = AppDatabase.getInstance(application);
        this.customerDAO = appDatabase.customerDAO();
    }

    public void createCustomer(CustomerModel customerModel) {
        this.customerDAO.CREATE_CUSTOMER(customerModel);
    }

    public void updateCustomer(CustomerModel customerModel) {
        this.customerDAO.UPDATE_CUSTOMER(customerModel);
    }

    public LiveData<Customer> getCustomer(int customerId) {
        return this.customerDAO.GET_CUSTOMER_BY_ID(customerId);
    }

    public LiveData<List<Customer>> getCustomers() {
        return this.customerDAO.GET_CUSTOMERS();
    }
}
