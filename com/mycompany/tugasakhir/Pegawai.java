package com.mycompany.tugasakhir;

public class Pegawai {
    public String nama;
    public String idPegawai;
    public String Posisi;

  public Pegawai(String n, String i, String p){
    nama = n;
    idPegawai = i;
    Posisi = p;}

    public String getNama(){
        return nama;
    }

    public String getPosisi() {
        return Posisi;
    }

    public String getidPegawai() {
        return idPegawai;
    }

    public String dataPegawai(){
        return ("==================================" + "\n" +
                            "Nama pegawai  : " + getNama()+ "\n" +
                            "Id Pegawai : " + getidPegawai() + "\n" +
                           "Posisi : " + getPosisi());
        }

  }
  
