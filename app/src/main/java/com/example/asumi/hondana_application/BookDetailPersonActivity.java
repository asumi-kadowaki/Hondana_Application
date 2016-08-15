package com.example.asumi.hondana_application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BookDetailPersonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detail_person);


        String[] array = {"持っている人", "本の状態", "備考", "必要なブク"};
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.list_book_detail_person, array);
        ListView listView1 = (ListView)findViewById(R.id.listView1);
        listView1.setAdapter(arrayAdapter);






    }
}
