public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double s){
        this.sisi = s;
    }

    public Persegi(){
        this.sisi = 0.0;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungLuas() {
        return getSisi()*getSisi();
    }


    public double hitungKeliling() {
        return 4*getSisi();
    }
}
