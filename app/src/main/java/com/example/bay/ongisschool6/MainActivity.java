package com.example.bay.ongisschool6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> listPeople=new ArrayList<>();
    private String[] namePeople={"Irvan", "Andi","Dicka","Budi","Shania", "Michelle","Ve","Dani","Fani","Bella","Cindy","Ayana","Syahab"};

    private ListView listView;
    private NamaAdapter namaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.lst_view);

        for (int i=0;i<namePeople.length;i++){
            listPeople.add(namePeople[i]);
        }

        namaAdapter=new NamaAdapter(this, android.R.layout.simple_list_item_1,listPeople);
        listView.setAdapter(namaAdapter);
    }
}
