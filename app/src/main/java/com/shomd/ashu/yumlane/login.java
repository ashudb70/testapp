package com.shomd.ashu.yumlane;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import  android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class login extends AppCompatActivity {
    EditText user, pass;
    Button login;

    Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = (EditText) findViewById(R.id.edname);
        pass = (EditText) findViewById(R.id.edpass);
        login = (Button) findViewById(R.id.login);


        login.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                String username = user.getText().toString();
                String password = pass.getText().toString();



                String StoredPassword = "yumlane";
                if (password.equals(StoredPassword)) {

                    Toast.makeText(getApplicationContext(), StoredPassword + "Login Successfully", Toast.LENGTH_LONG).show();

                    Intent i = new Intent(login.this, MainActivity.class);
                    startActivity(i);

                } else {
                    Toast.makeText(getApplicationContext(), "Username/Password incorrect", Toast.LENGTH_LONG).show();
                    user.setText("");
                    pass.setText("");
                }


            }
        });




    }
}