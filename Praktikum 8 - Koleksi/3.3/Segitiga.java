public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;

    public Segitiga(double a, double t){
        this.alas = a;
        this.tinggi = t;
    }

    public Segitiga(){
        this.alas = 0.0;
        this.tinggi = 0.0;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double hitungLuas() {
        return (getAlas()*getTinggi())/2;
    }

    public double hitungKeliling() { //Asumsi segitiga sama sisi
        return getAlas()*3;
    }
}
