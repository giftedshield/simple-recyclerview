package com.example.reyclerviewtugas;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterR.OnItemClickListener{

    RecyclerView listJurusan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        listJurusan = (RecyclerView) findViewById(R.id.recyclermain);
        listJurusan.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<ModelR> data = new ArrayList<>();
        data.add(new ModelR("PPLG", "100 siswa",R.drawable.pplg));
        data.add(new ModelR("DKV", "200 siswa",R.drawable.dkv));
        data.add(new ModelR("Anim 2d", "300 siswa",R.drawable.duadimensi));
        data.add(new ModelR("Anim 3d", "350 siswa",R.drawable.tigadimesni));

        AdapterR adapterR = new AdapterR(data, this);
        listJurusan.setAdapter(adapterR);
    }

    @Override
    public void onItemClick(ModelR modelR) {
        Toast.makeText(this, modelR.getNamaJurusan() + " , " + modelR.getJumlahSiswa(), Toast.LENGTH_SHORT).show();
        Intent in  = new Intent(MainActivity.this, detali.class);
        in.putExtra("namaJurusan",modelR.getNamaJurusan());
        in.putExtra("sigma",modelR.getFoto());
        startActivity(in);
    }
}