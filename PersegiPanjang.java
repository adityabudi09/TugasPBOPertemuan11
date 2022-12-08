/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbopertemuan11;

/**
 *
 * @author DWI ADITYA BUDI
 */
public class PersegiPanjang {
    public BangunDatar persegiPanjang;

    public PersegiPanjang(String judul){
        persegiPanjang = new BangunDatar();
        persegiPanjang.judul = "Persegi Panjang";
    }

    public void luas(float panjang, float lebar){
        persegiPanjang.luas();
        float luasPersegi = panjang * lebar;
        System.out.println("Luas Persegi Panjang        : " + luasPersegi);
    }

    public void keliling(float panjang, float lebar){
        persegiPanjang.keliling();
        float kelilingPersegiPanjang = 2 * (panjang + lebar);
        System.out.println("Keliling Persegi Panjang    : " + kelilingPersegiPanjang);
    }
}
