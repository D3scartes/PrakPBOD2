/* Nama file : MManusia.java
Deskripsi : Main driver manusia
Pembuat : Phoa Yohanes Theo Arvarrel
NIM : 24060123130069
Tanggal : 24 Maret, 2025
 */

import java.time.LocalDate;

public class MManusia {
    public static void main(String[] args) {
        // Membuat objek PNS
        PNS p1 = new PNS("Satriyo", LocalDate.of(2006, 4, 10), "Jl. Seroja", 15000000, "198302032006041002");
        PNS p2 = new PNS("Panji", LocalDate.of(2010, 4, 1), 10000000, "198004212010041002");
        p2.setAlamat("Jl. Panorama 111 Tembalang");
        // Membuat objek Pengusaha
        Pengusaha pe1 = new Pengusaha("Adhy", LocalDate.of(2000, 1, 1), "Jl. Air", 55000000, "000-556-773-212-000-5");

        // Membuat objek Petani
        Petani pt1 = new Petani("Nugraha", LocalDate.of(1977, 1, 9), "Jl. Bunga 9 Tembalang", 5000000, "Wonogiri");

        // Menampilkan jumlah objek yang telah dibuat
        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());

        // Menampilkan pajak yang harus dibayar setiap objek
        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());

        // Menampilkan masa kerja setiap objek
        System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja() + " tahun");
        System.out.println("Masa Kerja p2 = " + p2.hitungMasaKerja() + " tahun");
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja() + " tahun");
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja() + " tahun");

        // Menampilkan informasi detail setiap objek
        p1.cetakInfo();
        p2.cetakInfo();
        pe1.cetakInfo();
        pt1.cetakInfo();
    }
}
