package com.example.activityliifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;

public class Second_Activity extends AppCompatActivity {
    GridView grid;
    Button btnShare;
    ArrayList<String> stateScondActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        grid=(GridView)findViewById(R.id.grid);
        btnShare=(Button)findViewById(R.id.btnShare) ;
        Intent i=getIntent();
        stateScondActivity= i.getStringArrayListExtra("list");
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,stateScondActivity);
        grid.setAdapter(adapter);
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putStringArrayListExtra(Intent.EXTRA_TEXT,stateScondActivity);
                startActivity(i);

            }
        });

    }
}