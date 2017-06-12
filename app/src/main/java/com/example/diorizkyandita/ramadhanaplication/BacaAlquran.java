package com.example.diorizkyandita.ramadhanaplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BacaAlquran extends AppCompatActivity {
    ListView lvItem;
    String[] listNama = new String[]{
            "Surat Al-faatiha", "Surat Al-Baqarah"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baca_alquran);

        getSupportActionBar().setTitle("Surah-Surah Alquran");
        getSupportActionBar().setSubtitle("Silahkan Dibaca");

        lvItem= (ListView)findViewById(R.id.list_View);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(BacaAlquran.this, android.R.layout.simple_list_item_1, android.R.id.text1, listNama);

        lvItem.setAdapter(adapter);

        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "Memilih " + listNama[position], Toast.LENGTH_SHORT).show();
                switch (position) {
                    case 0:
                        Intent newActivity = new Intent(BacaAlquran.this, Alfatiha.class);
                        startActivity(newActivity);
                        break;
                    case 1:
                        Intent newActivity1 = new Intent(BacaAlquran.this, Albaqara.class);
                        startActivity(newActivity1);
                        break;
                    default:
                }};
            });
    }
}