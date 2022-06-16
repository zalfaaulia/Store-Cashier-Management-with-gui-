package com.mycompany.tugasakhir;

public class KeripikWaduh extends Product implements Pedas{
    int hotLevel;
    public KeripikWaduh (String n, double p, String i, int s, int h){
      super(n,p,i,s);
      this.hotLevel = h;
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

    @Override
    public int hotLevel(){
      return this.hotLevel;
    }
}