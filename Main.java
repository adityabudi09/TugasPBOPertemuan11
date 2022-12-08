/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspbopertemuan11;

/**
 *
 * @author DWI ADITYA BUDI
 */
public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();
        bangunDatar.judul = "bangun ruang";

        // Dependensi
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.luas(bangunDatar, 7);
        lingkaran.keliling(bangunDatar, 7);

        System.out.println();

        // Asosiasi
        Persegi persegi = new Persegi();
        persegi.persegi = bangunDatar;
        persegi.luas(10);
        persegi.keliling(5);

        System.out.println();

        // Agregasi
        Segitiga segitiga = new Segitiga(bangunDatar);
        segitiga.luas(8,12);
        segitiga.keliling(9);

        System.out.println();

        // Komposisi
        PersegiPanjang persegiPanjang = new PersegiPanjang("Persegi Panjang");
        persegiPanjang.luas(10,5);
        persegiPanjang.keliling(10,5);
    }
}
