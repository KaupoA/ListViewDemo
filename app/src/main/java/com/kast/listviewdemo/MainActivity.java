package com.kast.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView friendsList = (ListView)findViewById(R.id.friendsList);

        final ArrayList<String> myFriends = new ArrayList<>();

        myFriends.add("Mikk");
        myFriends.add("Aleks");
        myFriends.add("Laura");
        myFriends.add("Siim");
        myFriends.add("Knut");
        myFriends.add("Nils");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFriends);

        friendsList.setAdapter(arrayAdapter);

        friendsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this, "Hello, " + myFriends.get(position) + "!", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
