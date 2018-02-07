package com.example.ekene.roomtest;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by EKENE on 2/7/2018.
 */

@Database(entities = User.class, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract UserDao userDao();

}
