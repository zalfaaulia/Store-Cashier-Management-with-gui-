package com.mycompany.tugasakhir;

import java.util.ArrayList;

public class Mart{
  public ArrayList<Product> product = new ArrayList<>();
  private int totalBelanja;

  public void addProduct(Product produk){
    this.product.add(produk);
  }
  
  public int getTotalBelanja(){
    for (Product i : product){
        totalBelanja += i.getPrice() * i.jumlahBeli; 
  }
    return totalBelanja;}

  public void satSetSatSet(){
    System.out.println("=====TOKO ROTI ASTAGHFIRULLAH=====");
    System.out.println("Daftar Belanja :");
    for (Product i : product){
        System.out.println(i.id + " " + i.getClass().getSimpleName() 
                + " " + i.getPrice() + " x " + i.jumlahBeli + " = " + i.getPrice()*i.jumlahBeli);}
    System.out.println("Total yang harus dibayar : " + "Rp."+ getTotalBelanja());
  }
}