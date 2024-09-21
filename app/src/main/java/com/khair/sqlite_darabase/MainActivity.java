package com.khair.sqlite_darabase;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edName,edMobile;
    AppCompatButton button_sand,button_show;
    TextView tvDisplay;
    DatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_sand=findViewById(R.id.button_sand);
        button_show=findViewById(R.id.button_show);
        edName=findViewById(R.id.edName);
        edMobile=findViewById(R.id.edMobile);
        tvDisplay=findViewById(R.id.textView);
        dbHelper=new DatabaseHelper(this);

        button_sand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                dbHelper.insertData(edName.getText().toString(),edMobile.getText().toString());

            }
        });

        button_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });






    }
}