package com.example.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class signup extends AppCompatActivity {
    Button signup;
    Spinner spin;
    String data[]={"a","b","c","d"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        spin=(Spinner)findViewById(R.id.spin);
        ArrayAdapter adapter=new ArrayAdapter(signup.this,R.layout.list,data);
        spin.setAdapter(adapter);
    }
}
