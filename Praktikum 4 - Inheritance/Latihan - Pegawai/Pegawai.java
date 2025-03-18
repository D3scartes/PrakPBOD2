import java.time.LocalDate; //ngambil tanggal
import java.time.Period; //Buat ambil masa jabatan
import java.time.format.DateTimeFormatter; //nyesuain format tanggal

public class Pegawai {
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    public Pegawai() {
        this.nip = "";
        this.nama = "";
        this.tanggalLahir = null;
        this.tmt = null;
        this.gajiPokok = 0.0;
    }

    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public String getNip(){
        return nip;
    }
    public void setNip(String nip){
        this.nip = nip;
    }

    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }
    public void setTanggalLahir(LocalDate tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    public LocalDate getTmt() {
        return tmt;
    }
    public void setTmt(LocalDate tmt) {
        this.tmt = tmt;
    }

    public double getGajiPokok(){
        return gajiPokok;
    }
    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }
    public String getMasaKerja() {
        Period period = Period.between(tmt, LocalDate.now()); //ambil selisih periode tanggal mulai sama tanggal sekarang
        return period.getYears() + " tahun " + period.getMonths() + " bulan"; //ambil tahun sama bulannya aj
    }

    //fungsi tambahan buat format tanggal, ga yg penting banget, nyesuain soal
    public String formatTanggal(LocalDate tanggal) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        return tanggal.format(formatter);
    }

    public void printInfo() {
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + formatTanggal(tanggalLahir));
        System.out.println("TMT: " + formatTanggal(tmt));
        System.out.println("Gaji Pokok: Rp " + String.format("%,.2f", gajiPokok));
    }
}
