/* Nama file : Manusia.java
Deskripsi : Program abstrak Manusia
Pembuat : Phoa Yohanes Theo Arvarrel
NIM : 24060123130069
Tanggal : 24 Maret, 2025
 */

import java.time.LocalDate;
import java.util.Date;

public abstract class Manusia {
    private String nama;
    private LocalDate tglMulaiKerja;
    private String alamat;
    private double pendapatan;
    private static int counterMns = 0;

    Manusia(){
        this.nama = "";
        this.tglMulaiKerja = null;
        this.alamat = "";
        this.pendapatan= 0.0;
        counterMns++;
    }
    Manusia(String n, LocalDate d, String a, double p){
        this.nama = n;
        this.tglMulaiKerja = d;
        this.alamat = a;
        this.pendapatan= p;
        counterMns++;
    }

    Manusia(String n, LocalDate d, double p){
        this.nama = n;
        this.tglMulaiKerja = d;
        this.alamat = "";
        this.pendapatan= p;
        counterMns++;
    } //Konstruktor tambahan, karena di soal latihan, mainnya ada Objek PNS yang instaniasinya gapake alamat, jadi yang ini alamat di set nil

    public String getNama(){
        return this.nama;
    }

    public LocalDate getTglMulaiKerja() {
        return tglMulaiKerja;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public static void setCounterMns(int counterMns) {
        Manusia.counterMns = counterMns;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public void setTglMulaiKerja(LocalDate tglMulaiKerja) {
        this.tglMulaiKerja = tglMulaiKerja;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public abstract int hitungMasaKerja();

    public void cetakInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Tanggal mulai kerja : " + getTglMulaiKerja());
        System.out.println("Pendapatan: " + pendapatan);
    }
}
