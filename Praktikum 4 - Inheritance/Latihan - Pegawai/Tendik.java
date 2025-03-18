import java.time.LocalDate;
import java.time.Period; //Buat ambil masa jabatan sama tunjangan


class Tendik extends Pegawai {
    private String bidang;
    private static final int BUP = 55;

    public Tendik() {
        super();
        this.bidang = "";
    }

    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public String getBidang() { return bidang; }
    public void setBidang(String bidang) { this.bidang = bidang; }

    public LocalDate getBupDate() {
        return getTanggalLahir().plusYears(BUP).withDayOfMonth(1).plusMonths(1);
    }

    public double getTunjangan() {
        Period period = Period.between(getTmt(), LocalDate.now());
        return 0.01 * period.getYears() * getGajiPokok();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan: Tendik");
        System.out.println("Bidang: " + bidang);
        System.out.println("Masa Kerja: " + getMasaKerja());
        System.out.println("BUP: " + formatTanggal(getBupDate()));
        System.out.println("Tunjangan: Rp " + String.format("%,.2f", getTunjangan()));
    }
}

