package com.example.sith8.logindemo;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String Table_Name= "user";
    private static final String Full_Name="FullName";
    private static final String Email="Email";
    private static final String Password="Password";
    private static final String Username="Username";


    public static final String DATABASE_NAME="test.db";
    public static final int DATABASE_VERSION=1;


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query= "create table "+Table_Name+"("+Full_Name+" text, "+Email+" text, "+Password+" text, "+Username+" text unique)";
        sqLiteDatabase.rawQuery(query,null);

    }

    public void insert_User(UserModel usermodel){
        SQLiteDatabase writableDatabase= this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put(Full_Name,usermodel.getFull_name());
        contentValues.put(Email,usermodel.getEmail());
        contentValues.put(Username,usermodel.getUser_name());
        contentValues.put(Password,usermodel.getPassword());
        writableDatabase.insert(DATABASE_NAME,null,contentValues);


    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
