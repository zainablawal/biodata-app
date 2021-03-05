package com.example.myemployeebiodataapplication.DataModel;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(
        entities = User.class,
        version = 1,
        exportSchema = false
)
public abstract class UserDatabase extends RoomDatabase {
    private static UserDatabase userDatabase = null;

    public abstract UserDAO userDAO();

    public static synchronized UserDatabase getDatabaseInstance(Context context){
        if (userDatabase == null){
            userDatabase = Room.databaseBuilder(
                    context.getApplicationContext(),
                    UserDatabase.class,
                    "user19b2"
            )
                    .allowMainThreadQueries()
                    .build();
        }
        return userDatabase;
    }
}
