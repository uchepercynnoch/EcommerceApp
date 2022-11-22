package com.example.ecommerceapp.daos;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.example.ecommerceapp.data.model.ProductModel;
import com.example.ecommerceapp.data.entities.Product;

import java.util.List;

@Dao
public interface ProductDAO {

    @Insert
    void CREATE_PRODUCT(ProductModel productModel);

    @Update
    void UPDATE_PRODUCT(ProductModel productModel);

    @Query("SELECT * FROM products WHERE productId IN (:productId)")
    LiveData<Product> GET_PRODUCT_BY_ID(int productId);


    @Query("SELECT * FROM products")
    LiveData<List<Product>> GET_PRODUCTS();
}
