import java.time.LocalDate;
import java.time.Period; //Buat ambil masa jabatan sama tunjangan


class DosenTamu extends Dosen {
    private String nidk;
    private LocalDate kontrakBerakhir;

    public DosenTamu() {
        super();
        this.nidk = "";
        this.kontrakBerakhir = null;
    }

    public DosenTamu(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String nidk, String fakultas, LocalDate kontrakBerakhir) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.kontrakBerakhir = kontrakBerakhir;
    }

    public String getNidk() { return nidk; }
    public void setNidk(String nidk) { this.nidk = nidk; }

    public LocalDate getKontrakBerakhir() { return kontrakBerakhir; }
    public void setKontrakBerakhir(LocalDate kontrakBerakhir) { this.kontrakBerakhir = kontrakBerakhir; }

    public double getTunjangan() {
        Period period = Period.between(getTmt(), LocalDate.now());
        return 0.025 * period.getYears() * getGajiPokok();
    }
    //ambil tahun selisih, kali 2.5%, kaliin gaji pokok

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan: Dosen Tamu");
        System.out.println("NIDK: " + nidk);
        System.out.println("Kontrak Berakhir: " + formatTanggal(kontrakBerakhir));
        System.out.println("Tunjangan: Rp " + String.format("%,.2f", getTunjangan()));
    }
}

