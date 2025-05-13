public class Lingkaran extends BangunDatar{
    private double jari;

    public Lingkaran(double jari){
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }

    public double hitungLuas() {
        return 3.14*jari*jari;
    }

    public double hitungKeliling(){
        return 2*jari*3.14;
    }
}
