package com.example.android.myapplication2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


//Initializing the variables
    private Button login;
    private TextView email;
    private TextView password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        login = findViewById(R.id.button);
        email = findViewById(R.id.editText2);
        password = findViewById(R.id.editText);
        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //Ensuring that the input is filled properly and showing the result as successfull

                if (email.getText().length()>0 && password.getText().length()>0) {

                    Toast toast = Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_LONG);
                    toast.show();

                }

                //Error message saying to the user to fill the input blank

                else {

                    Toast toast2 = Toast.makeText(MainActivity.this, "Please Enter Valid Input", Toast.LENGTH_LONG);
                    toast2.show();
                }
            }
        });


    }


    //Switching to the registration screen upon clicking the registration button
    public void switchScreen(View view) {
        startActivity(new Intent(MainActivity.this, Main2Activity.class));
    }
}
