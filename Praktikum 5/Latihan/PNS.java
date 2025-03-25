/* Nama file : PNS.java
Deskripsi : Program PNS
Pembuat : Phoa Yohanes Theo Arvarrel
NIM : 24060123130069
Tanggal : 24 Maret, 2025
 */

import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia implements Pajak{
    private String nip;
    private static int counterPNS = 0;

    PNS(){
        super();
        this.nip = "";
        counterPNS++;
    }

    PNS(String n, LocalDate t, String a, double p, String nip){
        super(n,t,a,p);
        this.nip = nip;
        counterPNS++;
    }

    PNS(String n, LocalDate t, double p, String nip){
        super(n,t,p);
        this.nip = nip;
        counterPNS++;
    } //Konstruktor tambahan, karena di soal latihan, mainnya ada Objek PNS yang instaniasinya gapake alamat, jadi yang ini alamat di set nil

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public String getAlamat() {
        return super.getAlamat();
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan();
    }

    @Override
    public LocalDate getTglMulaiKerja() {
        return super.getTglMulaiKerja();
    }

    @Override
    public void setAlamat(String alamat) {
        super.setAlamat(alamat);
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama);
    }

    @Override
    public void setPendapatan(double pendapatan) {
        super.setPendapatan(pendapatan);
    }

    @Override
    public void setTglMulaiKerja(LocalDate tglMulaiKerja) {
        super.setTglMulaiKerja(tglMulaiKerja);
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    public static void setCounterPNS(int counterPNS) {
        PNS.counterPNS = counterPNS;
    }

    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(getTglMulaiKerja(), LocalDate.now()) + 9;
    }

    @Override
    public double hitungPajak(){
        return 0.1*getPendapatan();
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak: " + hitungPajak());
    }
}
