package com.example.ecommerceapp.data;

import android.app.Application;
import androidx.lifecycle.LiveData;
import com.example.ecommerceapp.daos.ProductDAO;
import com.example.ecommerceapp.data.entities.Product;
import com.example.ecommerceapp.data.model.ProductModel;

import java.util.List;

public class ProductRepository {
    private final ProductDAO productDAO;

    public ProductRepository(Application application) {
        AppDatabase appDatabase = AppDatabase.getInstance(application);
        this.productDAO = appDatabase.productDAO();
    }

    public void createProduct(ProductModel productModel) {
        this.productDAO.CREATE_PRODUCT(productModel);
    }

    public void updateProduct(ProductModel productModel) {
        this.productDAO.UPDATE_PRODUCT(productModel);
    }

    public LiveData<Product> getProduct(int productId) {
        return this.productDAO.GET_PRODUCT_BY_ID(productId);
    }

    public LiveData<List<Product>> getProducts() {
        return this.productDAO.GET_PRODUCTS();
    }
}
