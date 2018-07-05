package com.example.nawaporn.notify_2;

import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            final Button button = findViewById(R.id.btn1);

            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Code here executes on main thread after user presses button
                    button.setBackgroundColor(Color.RED);

                    final String USER_TOKEN = "VTAoq4QZnXSWmmZn5SBMt4n1vQiddjFSoVsqufKjb0y"; //Token Gen by line Notify
                    LineNotify ln = new LineNotify(USER_TOKEN);
                    try{
                        ln.notifyMe("Hello World");
                    }catch(IOException ex){
                        System.err.println(ex);

                    }
                }
                });
        }
    }

