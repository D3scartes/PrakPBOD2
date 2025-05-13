public class PersegiPanjang extends BangunDatar{
    private double panjang;
    private double lebar;

    public PersegiPanjang(double p, double l){
        this.panjang = p;
        this.lebar = l;
    }

    public PersegiPanjang(){
        this.panjang = 0.0;
        this.lebar = 0.0;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double hitungLuas() {
        return getLebar()*getPanjang();
    }

    public double hitungKeliling() {
        return 2*(getPanjang()+getLebar());
    }
}
