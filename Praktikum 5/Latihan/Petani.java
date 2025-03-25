/* Nama file : Petani.java
Deskripsi : Program Petani
Pembuat : Phoa Yohanes Theo Arvarrel
NIM : 24060123130069
Tanggal : 24 Maret, 2025
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia implements Pajak{

    private String asal_kota;
    private static int counterPetani=0;

    Petani(){
        super();
        this.asal_kota = "";
        counterPetani++;
    }

    Petani(String n, LocalDate t, String a, double p, String asal){
        super(n,t,a,p);
        this.asal_kota = asal;
        counterPetani++;
    }

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public String getAlamat() {
        return super.getAlamat();
    }

    @Override
    public LocalDate getTglMulaiKerja() {
        return super.getTglMulaiKerja();
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan();
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    public String getAsal_kota() {
        return asal_kota;
    }

    @Override
    public void setPendapatan(double pendapatan) {
        super.setPendapatan(pendapatan);
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        super.setAlamat(alamat);
    }

    @Override
    public void setTglMulaiKerja(LocalDate tglMulaiKerja) {
        super.setTglMulaiKerja(tglMulaiKerja);
    }

    public void setAsal_kota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    public static void setCounterPetani(int counterPetani) {
        Petani.counterPetani = counterPetani;
    }

    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(getTglMulaiKerja(), LocalDate.now()) + 0;
    }

    @Override
    public double hitungPajak(){
        return 0;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak: " + hitungPajak());
    }
}


