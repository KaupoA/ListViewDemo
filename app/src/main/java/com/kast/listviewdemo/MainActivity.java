package com.kast.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);

        ArrayList<String> familyMembers = new ArrayList<String>();

        familyMembers.add("Birgit", "Kaupo", "Merika", "Kuno");
     //   familyMembers.add("Kaupo");
     //   familyMembers.add("Merika");
     //   familyMembers.add("Kuno");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>();

    }
}
