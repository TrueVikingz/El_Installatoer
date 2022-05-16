package com.example.electriccontrol;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "users.db";
    public static final String TABLE_NAME = "registation";

    private static final String COL_1 = "ID";
    private static final String COL_2 = "username";
    private static final String COL_3 = "firstname";
    private static final String COL_4 = "lastname";
    private static final String COL_5 = "password";
    private static final String COL_6 = "e_mail";

    public DatabaseHelper (Context context){
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(" CREATE TABLE registration (ID INTERGER PRIMARY KEY AUTOINCREMENT, username TEXT, firstname TEXT, lastname TEXT, password TEXT, e_mail TEXT)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS " + TABLE_NAME);

    }

    public boolean checkUser( String username, String password){
        String[] colums = {COL_1};
        SQLiteDatabase db = getReadableDatabase();
        String selection = COL_2 + "=?" + "and" + COL_5 + "=?";
        String[] selectionArg = {username, password};
        Cursor cursor = db.query(TABLE_NAME, colums, selection,selectionArg, null,null, null);
        int count = cursor.getCount();
        cursor.close();
        db.close();

        if (count>0)
            return true;
        else
            return false;
    }

    public long addUser(String username, String firstname, String lastname, String password, String e_mail) {
        SQLiteDatabase db =this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("username", username);
        contentValues.put("firstname", firstname);
        contentValues.put("lastname", lastname);
        contentValues.put("password", password);
        contentValues.put("e_mail", e_mail);
        long res=db.insert("registration", null, contentValues);
        db.close();
        return res;
    }

}