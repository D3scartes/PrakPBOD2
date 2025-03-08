/*
File        : Asersi.java
Deskripsi   : Program untuk menunjukkan asersi
Nama NIM    : Phoa Yohanes Theo Arvarrel & 24060123130069
Tanggal     : 6 Maret 2025
 */

public class Asersi {
    public static void main(String[] args) {
        int x = 0;
        if (x > 0) {
            System.out.println("x bilangan positif");
        } else {
            assert (x < 0) : "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}

