package com.shomd.ashu.yumlane;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/**
 * Created by ashu on 1/24/2017.
 */

public class contact {

    String etName,etPhone,etProduct;

    public void setName(String name)
    {
        this.etName = name;
    }

    public String getName() {
        return this.etName;

    }


    public void setPhone(String phone)
    {
        this.etPhone = phone;
    }

    public String getPhone() {
        return this.etPhone;

    }
    public void setProduct(String product) {
        this.etProduct = product;
    }
    public String getproduct() {
        return this.etProduct;


    }





}
