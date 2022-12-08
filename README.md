# Tugas PBO Pertemuan 11
# Relasi Class
Software yang saya gunakan adalah Apache NetBeans sebagai IDE Java, saya melakukan new projek pada software tersebut dan tercipta Main.java.
pertama saya mencoba untuk menjelaskan singkat tentang diagram class, terutama untuk membangun program berorientasi objek atau OOP. Dalam program ini saya membuat rumus dasar bangun datar yaitu terdiri dari Persegi, Persegi Panjang, Segitiga, Lingkaran. Dan Relasi Class yang saya gunakan ada 4 yaitu Depedensi, Asosiasi, Agregasi, Komposisi.

● Diagram Class

Saya juga mencoba untuk membuat diagram class sederhana dengan software online di internet. Walaupun masih belum sempurna namun saya mulai memahami sedikit dari konsep-konsep di atas. Di sini saya mencoba membuat program Bangun Datar sederhana menggunakan bahasa pemrograman Java.

![image](https://user-images.githubusercontent.com/115923969/206574525-a8c05c08-bab7-4c34-9655-d57e3b696eeb.png)

● Depedensi

adalah Hubungan dependensi diartikan sebagai hubungan antara dua buah class, di mana satu class memiliki ketergantungan dengan class lainnya tetapi class lainnya tidak/mungkin memiliki ketergantungan terhadap class pertama tadi. Jadi apa pun perubahan yang terjadi pada class pertama dapat mempengaruhi fungsi class yang memiliki ketergantungan pada class tersebut. Hubungan dependensi terjadi apabila, sebuah fungsi pada class A membutuhkan class B sebagai parameter, fungsi pada class A memiliki nilai kembalian berupa class B, dan class A menggunakan class B tetapi class B bukan merupakan sebuah atribut.

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

● Asosiasi

adalah Asosiasi dapat diartikan sebagai hubungan antara dua class yang bersifat statis. Biasanya asosiasi menjelaskan class yang memiliki atribut tambahan seperti class lain. Di sini mungkin ada kemiripan antara Asosiasi dan Depedensi, mudahnya Asosiasi di dalamnya memiliki atribut berupa sebuah class, sedangkan Depedensi itu sebuah class yang memiliki sebuah fungsi di dalamnya dengan parameter class lain.

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

● Agregasi 

adalah bentuk hubungan yang lebih khusus dari Assosiasi dimana sebuah object memiliki lifecycle nya sendiri tapi dengan kepemilikan dan class child tidak dapat memiliki class parentnya.

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

● Komposisi 

adalah Komposisi sama dengan relasi Agregasi, tapi lebih spesfic lagi yaitu lifecycle object bergantung pada object ownernya. Aturan yang berlaku untuk hubungan ini adalah ketika kelas yang “memiliki” class lainnya dihancurkan maka class yang “dimiliki” oleh kelas tersebut akan hancur juga atau tidak dapat digunakan.

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

Kemudian saya menyatukan semua Class ke dalam Main.java sehingga keseluruhan code javanya akan menjadi seperti berikut.

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

Kemudian saya Run dan hasilnya sebagai berikut

![image](https://user-images.githubusercontent.com/115923969/206576530-61bb138f-0dd1-4460-9343-92dddcaf37e1.png)

