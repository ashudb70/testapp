package com.shomd.ashu.yumlane;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


public class User_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_);
        String product = getIntent().getStringExtra("product");

        String name = getIntent().getStringExtra("name");


        TextView tv = (TextView)findViewById(R.id.tvname);
        tv.setText(name);
        TextView mv = (TextView)findViewById(R.id.tvproduct);
        mv.setText(product);

        Button exit = (Button)findViewById(R.id.BtExit);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });



    }
}
