package com.safeinvest.safetrax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainActivity extends AppCompatActivity {
      Button login,rbtn;
      EditText uname,pass,ename;
      Connection connect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=(Button) findViewById(R.id.login);
        rbtn=(Button) findViewById(R.id.rbtn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,dashboard.class);
                startActivity(intent);
            }
        });
        rbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectionHelper connectionHelper=new ConnectionHelper();
                connect=connectionHelper.connectionclass();
                if(connect!=null){
                    Toast.makeText(getApplicationContext(),"conected",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Not Connected",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}