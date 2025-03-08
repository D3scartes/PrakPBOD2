/*
File        : Asersi2.java
Deskripsi   : Program untuk demo asersi, menolak input jari jari yang bernilai 0
Nama NIM    : Phoa Yohanes Theo Arvarrel & 24060123130069
Tanggal     : 6 Maret 2025
 */
public class Asersi2 {
    public static void main(String[] args){
        double jariJari=7;
        assert(jariJari>0):"jari jari tidak boleh nol!";
        Lingkaran L = new Lingkaran(jariJari);
        double kelilingLingkaran = L.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}
class Lingkaran{
    private double jariJari;
    public Lingkaran (double jariJari){
        this.jariJari =  jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}
//Yang kurang tepat pada program ini adalah class lingkaran seharusnya tidak menjadi satu dengan Asersi2. Walaupun bisa dijalankan dengan baik, tetapi tidak sesuai dengan konsep yang dipelajari, seharusnya class lingkaran berdiri sendiri.


