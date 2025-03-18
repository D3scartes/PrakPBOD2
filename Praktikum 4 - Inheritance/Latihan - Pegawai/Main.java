import java.time.LocalDate;
import java.time.Period; //Buat ambil masa jabatan sama tunjangan

//semua yang tipenya localdate buat tanggal pake format input LocalDate.of(tahun,bulan,hari ke-k)
class Main {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap("9545647548", "Andi", LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1), 500000.0, "78647324", "Fakultas Sains dan Matematika");
        DosenTamu dosenTamu = new DosenTamu("9876543210", "Budi", LocalDate.of(1985, 8, 15), LocalDate.of(2018, 3, 10), 4500000, "12345678", "Fakultas Teknik", LocalDate.of(2026, 6, 1));
        Tendik tendik = new Tendik("5678901234", "Siti", LocalDate.of(1980, 12, 10), LocalDate.of(2010, 7, 20), 4000000, "Akademik");

        System.out.println("===== Informasi Dosen Tetap =====");
        dosenTetap.printInfo();

        System.out.println("\n===== Informasi Dosen Tamu =====");
        dosenTamu.printInfo();

        System.out.println("\n===== Informasi Tendik =====");
        tendik.printInfo();
    }
}
