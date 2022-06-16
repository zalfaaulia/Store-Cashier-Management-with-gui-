package com.mycompany.tugasakhir;

public class KeripikGapapa extends Product {
    public KeripikGapapa (String n, double p, String i, int s){
        super(n,p,i,s);
    }

    public String getNama() {
        return nama;
    }

    public double getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    public void getStok() {
        System.out.println("Stok tersisa : " + stok);
    }
    
    @Override
    public int getJumlahBeli(){
        return jumlahBeli;
    }
    
    @Override
    public void jual(int jumlah){
        if (stok == 0){
            System.out.println("Maaf barang ini sudah habis");
        } else if (stok < jumlah){
            System.out.println("Maaf stok hanya terdapat "+stok+"."+" Lanjutkan membeli?");
        } else if (stok >= jumlah){
            stok -= jumlah;
            jumlahBeli += jumlah;
        }
    }
    
    @Override
    void tambahStok(int jumlah){
        stok += jumlah;
    }
}