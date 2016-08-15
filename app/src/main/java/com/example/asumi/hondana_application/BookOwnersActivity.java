package com.example.asumi.hondana_application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BookOwnersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_owners);



        String[] array = {"持っている人", "本の状態", "備考", "必要なブク"};
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.part_book_owner_list, array);
        ListView listView3 = (ListView)findViewById(R.id.listView3);
        listView3.setAdapter(arrayAdapter);





    }
}
