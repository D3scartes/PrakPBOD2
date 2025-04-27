public class Pegawai {
    private String nama;
    private static int gajiPokok = 5000000;

    Pegawai(){
        this.nama = "";
    }

    Pegawai(String n){
        this.nama = n;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public static int getGajiPokok() {
        return gajiPokok;
    }

    void tampilData(){
        System.out.println("Nama : " + getNama() + ", Gaji pokok : " + getGajiPokok());
    }
}
