package com.example.activityliifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;

public class Second_Activity extends AppCompatActivity {
   private GridView grid;
   private Button btnShare;
   private ArrayList<String> stateSecondActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        grid=(GridView)findViewById(R.id.grid);
        btnShare=(Button)findViewById(R.id.btnShare) ;
        Intent i=getIntent();
        stateSecondActivity= i.getStringArrayListExtra("list");
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.grid_view,stateSecondActivity);
        grid.setAdapter(adapter);
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Function","OnClick Call");
                Intent i=new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                String listString="";
                for (String s :stateSecondActivity)
                {
                    listString += s + "\t";
                }
                Log.i("Function","Staring ArrayList Converted in String");
                i.putExtra(Intent.EXTRA_TEXT,listString);
                startActivity(i);
                Log.i("Function","Start Activity");

            }
        });

    }
}