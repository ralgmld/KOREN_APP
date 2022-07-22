package com.example.app_join;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
public class LoginActivity extends AppCompatActivity {
    private EditText join_id, join_password;
    private Button login_button, join_button,btn_change;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        join_id = findViewById(R.id.join_id);
        join_password = findViewById( R.id.join_password );
        join_button=findViewById(R.id.join_button);
        login_button=findViewById(R.id.login_button);
        btn_change = findViewById(R.id.join_button);
        btn_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),JoinActivity.class);
                startActivity(intent);
            }
        });
    }
}
