/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspbopertemuan11;

/**
 *
 * @author DWI ADITYA BUDI
 */
public class Persegi {
    public BangunDatar persegi;

    public void luas(float sisi){
        persegi.luas();
        float luasPersegi = sisi * sisi;
        System.out.println("Luas Persegi                : " + luasPersegi);
    }

    public void keliling(float sisi){
        persegi.keliling();
        float kelilingPersegi = sisi * 4;
        System.out.println("Keliling Persegi            : " + kelilingPersegi);
    }
}
