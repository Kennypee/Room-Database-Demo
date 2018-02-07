package com.example.ekene.roomtest;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by EKENE on 2/7/2018.
 */

// Access the Data in the Room database
    @Dao
public interface UserDao {

    // Insert items into the database
    @Insert
    void InsrtAll(User... users);

    //Get items from database
    @Query("SELECT * FROM user")
    List<User> getAllUsers();

}
