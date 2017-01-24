package com.shomd.ashu.yumlane;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/**
 * Created by ashu on 1/24/2017.
 */

public class Databasehelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;


    public  static final  String DATABASE_NAME = "contacts.db";
    public  static final  String TABLE_NAME = "contacts";
    public  static final  String COLUMN_ID = "id";
    public  static final  String COLUMN_NAME = "name";
    public  static final  String COLUMN_PHONE = "phone";
    public  static final  String COLUMN_PRODUCT    = "product";
    public static final  String TABLE_CREATE = "create table contacts(id integer primary key not null, " +
            "name text not null,  product text not null, phone text not null );";
    SQLiteDatabase db;


    public Databasehelper(Context context)
    {
        super(context, DATABASE_NAME , null , DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        this.db = db;

    }

    public void insertcontact(contact c) {

        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        String query = "select * from contacts";
        Cursor cursor = db.rawQuery(query, null);

        int count = cursor.getCount();
        values.put(COLUMN_ID, count );
        values.put(COLUMN_NAME, c.getName());
        values.put(COLUMN_PHONE, c.getPhone());
        values.put(COLUMN_PRODUCT, c.getproduct());
        db.insert(TABLE_NAME, null, values);
        db.close();



    }

    {}

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS"+TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);
    }
}