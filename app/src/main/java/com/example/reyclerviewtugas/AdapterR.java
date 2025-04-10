package com.example.reyclerviewtugas;

import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class AdapterR extends RecyclerView.Adapter<AdapterR.ListViewHolder>{
    ArrayList<ModelR> listModelR;
    private final OnItemClickListener listener;


    public interface OnItemClickListener {
        void onItemClick(ModelR modelR);
    }


    public AdapterR(ArrayList<ModelR> listModelR , OnItemClickListener listener){
        this.listModelR = listModelR;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerviewlayout, parent, false);
        return new ListViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Log.d("RecyclerView", "Binding position: " + position);
        ModelR modelR = this.listModelR.get(position);
        holder.namaJ.setText(modelR.getNamaJurusan());
        holder.jumlah.setText(modelR.getJumlahSiswa());
        holder.foto.setImageResource(modelR.getFoto());
        holder.itemView.setOnClickListener(v -> listener.onItemClick(modelR));
    }

    @Override
    public int getItemCount() {
        Log.d("RecyclerView", "Item Count: " + this.listModelR.size());
        return this.listModelR.size();
    }

    public static class ListViewHolder extends RecyclerView.ViewHolder {

        TextView namaJ;
        TextView jumlah;
        ImageView foto;

        public ListViewHolder(View view) {
            super(view);
            namaJ = (TextView) view.findViewById(R.id.nama);
            jumlah = (TextView) view.findViewById(R.id.jumlahSiswa);
            foto = (ImageView) view.findViewById(R.id.foto);

        }
    }

}
