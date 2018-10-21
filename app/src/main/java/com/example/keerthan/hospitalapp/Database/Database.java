package com.example.keerthan.hospitalapp.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;

import com.example.keerthan.hospitalapp.Model.Hospital;

import java.util.ArrayList;
import java.util.List;

public class Database extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Hospitals.db";


    public Database(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public List<Hospital> getHospital() {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();
        String[] sqlSelect = {"Id", "phn_num", "hosp_name", "addres", "doc_name", "doc_qualification"};
        String tableName = "Hospital_list";

        qb.setTables(tableName);
        Cursor cursor = qb.query(db, sqlSelect, null, null, null, null, null);
        List<Hospital> result = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                Hospital hospital = new Hospital();
                hospital.setId(cursor.getInt(cursor.getColumnIndex("Id")));
                hospital.setHosp_name(cursor.getString(cursor.getColumnIndex("Hosp_name")));
                hospital.setAddres(cursor.getString(cursor.getColumnIndex("addres")));
                hospital.setDoc_name(cursor.getString(cursor.getColumnIndex("Doc_name")));
                hospital.setDoc_qualification(cursor.getString(cursor.getColumnIndex("Doc_qualification")));
                hospital.setPhn_num(cursor.getLong(cursor.getColumnIndex("Phn_num")));

                result.add(hospital);
            }
            while (cursor.moveToNext());
        }
        return result;
    }

    public List<String> getNames() {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();
        String[] sqlSelect = {"hosp_name"};
        String tableName = "Hospital_list";

        qb.setTables(tableName);
        Cursor cursor = qb.query(db, sqlSelect, null, null, null, null, null);
        List<String> result = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {

                result.add(cursor.getString(cursor.getColumnIndex("hosp_name")));
            }
            while (cursor.moveToNext());
        }
        return result;
    }
}
   /* public List<Hospital> getHOspitalbyName(String hosp_name)
    {
        SQLiteDatabase db=getReadableDatabase();
        SQLiteQueryBuilder qb=new SQLiteQueryBuilder();
        String[] sqlSelect= {"hosp_name"};
        String tableName="Hospital_list";

        qb.setTables(tableName);
        Cursor cursor=qb.query(db,sqlSelect,"hosp_name LIKE ? ",new String[]{"%"+hosp_name+"%"},null,null,null);
        List<String> result1=new ArrayList<>();
        if(cursor.moveToFirst())
        {
            do{

                result1.add(cursor.getString(cursor.getColumnIndex("hosp_name")));
            }
            while(cursor.moveToNext());
        }
       return result1;
     }
        }



  }*/
