package com.example.reyclerviewtugas;

public class ModelR {
    private String namaJurusan;
    private String jumlahSiswa;
    private Integer foto;

    public ModelR(String namaJurusan, String jumlahSiswa, Integer foto){
        this.namaJurusan = namaJurusan;
        this.jumlahSiswa = jumlahSiswa;
        this.foto = foto;
    }

    public String getNamaJurusan() {
        return namaJurusan;
    }
    public String getJumlahSiswa() {
        return jumlahSiswa;
    }
    public Integer getFoto(){
        return foto;
    }
}