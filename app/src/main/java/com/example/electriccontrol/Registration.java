package com.example.electriccontrol;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Registration extends AppCompatActivity {

    TextView Error;
    EditText Username;
    EditText Firstname;
    EditText Lastname;
    EditText Password;
    EditText Repeat_Password;
    EditText E_mail;
    Button SignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_register);

        Username = (EditText) findViewById(R.id.editLoginUser);
        Password = (EditText) findViewById(R.id.editLoginPass);
        Firstname = (EditText) findViewById(R.id.)
        SignUp = (Button) findViewById(R.id.Loginbtn);
        Registration = (Button) findViewById(R.id.registerbtn);
        Registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegistrationActivity();
            }

        });
    }

}
