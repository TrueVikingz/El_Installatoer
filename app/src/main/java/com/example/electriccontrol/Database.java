package com.example.electriccontrol;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.ims.RegistrationManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class Database extends AppCompatActivity {

    TextView Error;
    EditText Username;
    EditText Password;
    Button Login;
    Button Registration;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_login);

        Username = (EditText) findViewById(R.id.username);
        Password = (EditText) findViewById(R.id.password);
        Login = (Button) findViewById(R.id.Loginbtn);
        Registration = (Button) findViewById(R.id.registerbtn);
        Registration.setOnClickListener(new View.OnClickListener {
            @Override
                    public void onClick(View v) {
                openRegistrationActivity();
            }
        });
    }

    Private Void openRegistrationActivity(){
        Intent registration = new Intent(Database.this, Registration.class);
        startActivity(registration);
    }

}
