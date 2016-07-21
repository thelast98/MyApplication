package com.example.lt.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> myData=new ArrayList<>();
    private TextView txtOutPut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtOutPut= (TextView) findViewById(R.id.myTestView);
    }

    public void addDataClickHandler(View view){
        for (int i = 0; i < 1000; i++) {
            myData.add("value:"+i);
        }
        showDataSize();
    }

    public void  clearDataClickHandler(View view){
        myData.clear();
        showDataSize();
    }

    private void showDataSize(){
        txtOutPut.setText("Number of data items:"+myData.size());
    }
}
