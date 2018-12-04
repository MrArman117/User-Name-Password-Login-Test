package com.example.student.usernamepasslogintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

EditText user, pass;
    TextView userName, password, result;

    String userdefine = "ABCD";
    String passdefine = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.userId);
        userName = findViewById(R.id.userViewId);
        pass = findViewById(R.id.passId);
        password = findViewById(R.id.passViewId);
        result = findViewById(R.id.resultId);
    }

    public void login(View view) {
        String u = user.getText().toString();
        String p = pass.getText().toString();

        if(u.equals(userdefine)&&p.equals(passdefine))
        {
            result.setText("Successful");
        }
        else{
            result.setText("Failed");
        }
    }
}
