package com.example.electriccontrol;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TextView Error;
    EditText Username;
    EditText Password;
    Button Login;
    Button Registration;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_login);

        Username = (EditText) findViewById(R.id.editLoginUser);
        Password = (EditText) findViewById(R.id.editLoginPass);
        Login = (Button) findViewById(R.id.Loginbtn);
        Registration = (Button) findViewById(R.id.registerbtn);
        Registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegistrationActivity();
            }

        });
    }

    private void openRegistrationActivity() {
        Intent registration = new Intent(MainActivity.this, Registration.class);
        startActivity(registration);
    }


    public void onBtnClick(View view){

    }
}