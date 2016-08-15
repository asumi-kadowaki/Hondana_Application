package com.example.asumi.hondana_application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class InformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);



        String[] array = {"会員登録について", "交換について", "梱包について", "発送について", "ブクについて", "退会について", "その他"};
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.list_information, array);
        ListView listView2 = (ListView)findViewById(R.id.listView2);
        listView2.setAdapter(arrayAdapter);





    }
}
