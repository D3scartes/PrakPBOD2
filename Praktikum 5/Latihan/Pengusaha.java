/* Nama file : Pengusaha.java
Deskripsi : Program Pengusaha
Pembuat : Phoa Yohanes Theo Arvarrel
NIM : 24060123130069
Tanggal : 24 Maret, 2025
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pengusaha extends Manusia implements Pajak{
    private String npwp;
    private static int counterPengusaha=0;

    Pengusaha(){
        super();
        this.npwp = "";
        counterPengusaha++;
    }

    Pengusaha(String n, LocalDate t, String a, double p, String npwp){
        super(n,t,a,p);
        this.npwp = npwp;
        counterPengusaha++;
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

    public void setNpwp(String n) {
        this.npwp = n;
    }

    public String getNpwp() {
        return npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    public static void setCounterPengusaha(int counterPengusaha) {
        Pengusaha.counterPengusaha = counterPengusaha;
    }

    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(getTglMulaiKerja(), LocalDate.now()) + 6;
    }

    @Override
    public double hitungPajak(){
        return 0.15*getPendapatan();
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak: " + hitungPajak());
    }
}
