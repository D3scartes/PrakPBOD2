/* Nama file : Lingkaran.java
Deskripsi : Program Lingkaran
Pembuat : Phoa Yohanes Theo Arvarrel
NIM : 24060123130069
Tanggal : 13 Maret, 2025
 */
public class Lingkaran extends BangunDatar {

    private double jari;
    public Lingkaran() {
        setJmlSisi(0);
    }

    public Lingkaran(double diameter, String warna, String border){
        super(0,warna,border);
        this.jari = diameter / 2;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI * jari * jari;
    }

    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari :" + jari);
    }

}