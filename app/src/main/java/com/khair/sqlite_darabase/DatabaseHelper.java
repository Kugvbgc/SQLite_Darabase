package com.khair.sqlite_darabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

public static final String DB_Name="my_database";
    public static final int DB_Version=1;

    public DatabaseHelper(@Nullable Context context) {
        super(context, DB_Name, null, DB_Version);
    }




    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table my_table(id INTEGER primary key autoincrement,name TEXT,mobile TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("drop table if exists my_table");


    }
   //========================================================================

   public void insertData(String name ,String mobile){
        SQLiteDatabase db=this.getWritableDatabase();
       ContentValues values=new ContentValues();
       values.put("name",name);
       values.put("mobile",mobile);

       db.insert("my_table",null,values);




   }


  ///=========================================================================
}
