package com.example.reyclerviewtugas;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class detali extends AppCompatActivity {
    TextView namaJurusanf;
    ImageView fotof;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detali);

        namaJurusanf = findViewById(R.id.namaDt);
        fotof = findViewById(R.id.fotof);

        Intent intent = getIntent();
        String namaJurusan = intent.getStringExtra("namaJurusan");
        Integer sigma = intent.getIntExtra("sigma",0);

        namaJurusanf.setText(namaJurusan);
        fotof.setImageResource(sigma);
    }
}