package com.example.activityliifecycle;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity {
      TextView tvActivityState;
      ListView listOfActivityState;
      ArrayList<String> state=new ArrayList<String>();
      ArrayAdapter<String> arrayAdapter;
      Button activityChnageBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvActivityState=(TextView)findViewById(R.id.tvActivityState);
        listOfActivityState=(ListView)findViewById(R.id.listViewOfActivity);
        arrayAdapter= new ArrayAdapter<String>(this, R.layout.simple_list_layout1, state);
        activityChnageBtn=(Button)findViewById(R.id.activicyChangeBtn);
        String temp="OnCreateState";
        Calendar calendar=Calendar.getInstance();
        SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
        String time=sdf.format(calendar.getTime());
        String timeState=time+temp;
        state.add(timeState);
        tvActivityState.setText(timeState);
        listOfActivityState.setAdapter(arrayAdapter);
        activityChnageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

      }
    public  void openActivity2()
    {
        Intent i=new Intent(MainActivity.this,Second_Activity.class);
        i.putExtra("list",state);
        startActivity(i);
    }


    @Override
    protected void onStart() {
        super.onStart();
        String temp="OnStartState";
        Calendar calendar=Calendar.getInstance();
        SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
        String time=sdf.format(calendar.getTime());
        String timeState=time+temp;
        activityChnageBtn=(Button)findViewById(R.id.activicyChangeBtn);
        state.add(timeState);
        tvActivityState.setText(timeState);
        listOfActivityState.setAdapter(arrayAdapter);

    }

    @Override
    protected void onResume() {
        super.onResume();
        String temp="OnResumeState";
        Calendar calendar=Calendar.getInstance();
        SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
        String time=sdf.format(calendar.getTime());
        String timeState=time+temp;
        state.add(timeState);
        tvActivityState.setText(timeState);
        listOfActivityState.setAdapter(arrayAdapter);

    }

    @Override
    protected void onPause() {
        super.onPause();
        String temp="OnPauseState";
        Calendar calendar=Calendar.getInstance();
        SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
        String time=sdf.format(calendar.getTime());
        String timeState=time+temp;
        state.add(timeState);
        tvActivityState.setText(timeState);
        listOfActivityState.setAdapter(arrayAdapter);

    }

    @Override
    protected void onStop() {
        super.onStop();
        String temp="OnStopState";
        Calendar calendar=Calendar.getInstance();
        SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
        String time=sdf.format(calendar.getTime());
        String timeState=time+temp;
        state.add(timeState);
        tvActivityState.setText(timeState);
        listOfActivityState.setAdapter(arrayAdapter);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        String temp="OnDesteoyState";
        Calendar calendar=Calendar.getInstance();
        SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
        String time=sdf.format(calendar.getTime());
        String timeState=time+temp;
        state.add(timeState);
        tvActivityState.setText(timeState);
        listOfActivityState.setAdapter(arrayAdapter);

    }

}