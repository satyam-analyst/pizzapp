package com.example.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button login, signup;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String Username = "7905652632";
        final String Password = "1234";


        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
        signup = (Button) findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, signup.class);
                startActivity(intent);

            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equalsIgnoreCase(Username)
                        && (password.getText().toString().equalsIgnoreCase(Password))) {
                    Intent intent = new Intent(MainActivity.this, Dashboard.class);
                    startActivity(intent);


                } else {
                    Toast.makeText(MainActivity.this, "please enter correct Mobile no. or password", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}