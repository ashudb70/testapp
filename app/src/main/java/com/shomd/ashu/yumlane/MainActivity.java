package com.shomd.ashu.yumlane;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    Databasehelper helper = new Databasehelper(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         final EditText name = (EditText) findViewById(R.id.etName);
     final  EditText phone = (EditText) findViewById(R.id.etPhone);
       final EditText product = (EditText) findViewById(R.id.etProduct);
        final Button btSubmit = (Button) findViewById(R.id.btSubmit);



        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                final String namestr = name.getText().toString();
                final String phonestr = phone.getText().toString();
                final String productstr = product.getText().toString();



                contact c = new contact();
                c.setName(namestr);
                c.setProduct(productstr);
                c.setPhone(phonestr);

                helper.insertcontact(c);

                Intent mIntent = new Intent(MainActivity.this, User_Activity.class);
                mIntent.putExtra("phone", phonestr);
                mIntent.putExtra("name", namestr);
                mIntent.putExtra("product", productstr);


                MainActivity.this.startActivity(mIntent);


            }
        });


    }
}





