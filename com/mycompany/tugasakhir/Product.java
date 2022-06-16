package com.mycompany.tugasakhir;

public abstract class Product {
    String nama;
    double price;
    String id;
    int stok;
    int jumlahBeli = 0;
    
    Product(String n, double p, String i, int s){
        nama = n;
        price = p;
        id = i;
        stok = s;
    }
    
    abstract void jual(int jumlah);
    abstract void tambahStok(int jumlah);
    abstract double getPrice();
    abstract int getJumlahBeli();
    
}