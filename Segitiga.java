/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbopertemuan11;

/**
 *
 * @author DWI ADITYA BUDI
 */
public class Segitiga {
    public BangunDatar segitiga;

    public Segitiga(BangunDatar b){
        segitiga = b;
    }

    public void luas(float alas, float tinggi){
        segitiga.luas();
        double luasSegitiga = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga               : " + luasSegitiga);
    }

    public void keliling(float sisi){
        segitiga.keliling();
        double kelilingSegitiga = sisi * 3;
        System.out.println("Keliling Segitiga           : " + kelilingSegitiga);
    }
}
