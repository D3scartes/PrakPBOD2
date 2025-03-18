import java.time.LocalDate;
import java.time.Period; //Buat ambil masa jabatan sama tunjangan


class DosenTetap extends Dosen {
    private String nidn;
    private static final int BUP = 65;

    public DosenTetap() {
        super();
        this.nidn = "";
    }

    public DosenTetap(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String nidn, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public String getNidn() { return nidn; }
    public void setNidn(String nidn) { this.nidn = nidn; }


    public LocalDate getBupDate() {
        return getTanggalLahir().plusYears(BUP).withDayOfMonth(1).plusMonths(1);
    }
    //tanggal bup = tangal lahir + 65 tahun + 1 bulan, operasi pake bantuan library. Ambil tanggal lahir, tambahin tahun bup pake .plusYears(BUP) terus set ke tanggal 1 pake .withdayofMonth(1), tambahain 1 bulan pake .plusMonts(1)

    public double getTunjangan() {
        Period period = Period.between(getTmt(), LocalDate.now());
        return 0.02 * period.getYears() * getGajiPokok();
    } //tunjangan dosen tetap 2% * masa kerja dari gaji pokok

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan: Dosen Tetap");
        System.out.println("NIDN: " + nidn);
        System.out.println("Masa Kerja: " + getMasaKerja());
        System.out.println("BUP: " + formatTanggal(getBupDate()));
        System.out.println("Tunjangan: Rp " + String.format("%,.2f", getTunjangan()));
    }
}
