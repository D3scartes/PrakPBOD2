import java.time.LocalDate;
import java.time.Period; //Buat ambil masa jabatan

//subclass dosen buat jadi superclass dosen tetap sama dosen tamu
public class Dosen extends Pegawai{
    private String fakultas;
    public Dosen() {
        super();
        this.fakultas = "";
    }

    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas() { return fakultas; }
    public void setFakultas(String fakultas) { this.fakultas = fakultas; }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas: " + fakultas);
    }
}
