package com.example.ecommerceapp.data;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.example.ecommerceapp.daos.CustomerDAO;
import com.example.ecommerceapp.daos.OrderDAO;
import com.example.ecommerceapp.daos.ProductDAO;
import com.example.ecommerceapp.data.entities.Customer;
import com.example.ecommerceapp.data.entities.Order;
import com.example.ecommerceapp.data.entities.Product;

@androidx.room.Database(entities = {Customer.class, Product.class, Order.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract CustomerDAO customerDAO();

    public abstract ProductDAO productDAO();

    public abstract OrderDAO orderDAO();


    // below line is to create instance
    // for our database class.
    private static AppDatabase instance;


    // on below line we are getting instance for our database.
    public static synchronized AppDatabase getInstance(Context context) {
        // below line is to check if
        // the instance is null or not.
        if (instance == null) {
            // if the instance is null we
            // are creating a new instance
            instance =
                    // for creating a instance for our database
                    // we are creating a database builder and passing
                    // our database class with our database name.
                    Room.databaseBuilder(context.getApplicationContext(),
                            AppDatabase.class, "app_database")
                            // below line is use to add fall back to
                            // destructive migration to our database.
                            .fallbackToDestructiveMigration()
                            // below line is to add callback
                            // to our database.
                            .addCallback(roomCallback)
                            // below line is to
                            // build our database.
                            .build();
        }
        // after creating an instance
        // we are returning our instance
        return instance;
    }

    // below line is to create a callback for our room database.
    private static final RoomDatabase.Callback roomCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            // this method is called when database is created
        }
    };


}
