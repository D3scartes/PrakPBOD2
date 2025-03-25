/* Nama file : Main.java
Deskripsi : Main driver BangunDatar
Pembuat : Phoa Yohanes Theo Arvarrel
NIM : 24060123130069
Tanggal : 24 Maret, 2025
 */

public class Main {
    public static void main(String[] args) {
        BangunDatar P1 = new Persegi(3,"biru","hitam");
        BangunDatar P2 = new Persegi(3,"red","putih");
        BangunDatar L1 = new Lingkaran(14,"merah","hitam");
        Lingkaran L2 = new Lingkaran(14,"merah","hitam");

        System.out.println("Apakah P1 dan P2 sama : " + P1.isEqualLuas(P2));
        System.out.println("Apakah P1 dan L1 memliki keliling yang sama : " + L1.isEqualKeliling(P2));
        L2.zoomIn();
    }
    //Interface hanya diimplementasikan di lingkaran dan persegi. Sehingga jika suatu objek di instaniasi menggunakan tipe bangundatar, penggunaan interface tidak bisa dilakukan, harus diimplementasikan di bangundatar juga.
}
