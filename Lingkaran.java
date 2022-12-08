/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbopertemuan11;

/**
 *
 * @author DWI ADITYA BUDI
 */
public class Lingkaran {
    protected final double PHI = 3.14;

    public void luas(BangunDatar lingkaran, double r){
        lingkaran.luas();
        double luasLingkaran = PHI * r * r;
        System.out.println("Luas Lingkaran              : " + luasLingkaran);
    }

    public void keliling(BangunDatar lingkaran, double r){
        lingkaran.keliling();
        double kelilingLingkaran = 2 * (PHI * r);
        System.out.println("Keliling Lingkaran          : " + kelilingLingkaran);
    }
}
