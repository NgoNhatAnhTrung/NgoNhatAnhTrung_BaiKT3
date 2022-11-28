package com.example.pheptinh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvPheptinh;
    ArrayList<Pheptinh> arrayPheptinh;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        adapter=new Adapter(this, R.layout.dong_phep_tinh,arrayPheptinh);

        lvPheptinh.setAdapter(adapter);

        lvPheptinh.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, Detail.class);
                startActivity(intent);
            }
        });
    }

    private void AnhXa() {
        lvPheptinh=(ListView) findViewById(R.id.listview);
        arrayPheptinh=new ArrayList<>();

        arrayPheptinh.add(new Pheptinh("Cong", R.drawable.cong));
        arrayPheptinh.add(new Pheptinh("Tru",R.drawable.tru));
        arrayPheptinh.add(new Pheptinh("Nhan",R.drawable.nhan));
        arrayPheptinh.add(new Pheptinh("Chia",R.drawable.chia));
        arrayPheptinh.add(new Pheptinh("Log",R.drawable.logarit));

    }
}