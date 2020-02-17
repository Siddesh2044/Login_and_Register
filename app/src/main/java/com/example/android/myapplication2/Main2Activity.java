package com.example.android.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.Button;

//Creating class for registration screen

public class Main2Activity extends AppCompatActivity {
    private TextView l;
    private TextView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private Button submit;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        m = findViewById(R.id.editText8);
        n = findViewById(R.id.editText9);
        n = findViewById(R.id.editText10);
        o = findViewById(R.id.editText11);
        p = findViewById(R.id.editText12);
        submit = findViewById(R.id.button3);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Ensuring that the input is not empty

                if (l.getText().length()<1 && m.getText().length()<1 && n.getText().length()<1 && o.getText().length()<1 && p.getText().length()<1) {

                    Toast toast3 = Toast.makeText(Main2Activity.this, "Please Enter Valid Input", Toast.LENGTH_LONG);
                    toast3.show();

                }


                //If the content is correct returning back to the main screen
        else {
    startActivity(new Intent(Main2Activity.this, MainActivity.class));

                }

            }
        });

    }

}
