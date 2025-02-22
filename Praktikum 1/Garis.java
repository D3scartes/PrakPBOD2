/* Nama file : Garis.java
Deskripsi : Body Garis
Pembuat : Phoa Yohanes Theo Arvarrel
NIM : 24060123130069
Tanggal : 21 Februari, 2025
 */
public class Garis {
    Titik A, B;
    static int counterGaris = 0;

    Garis(){
        A = new Titik(0,0);
        B = new Titik(1,1);
        counterGaris++;
    }

    Garis(Titik A, Titik B){
        this.A = A;
        this.B = B;
        counterGaris++;
    }

    static int getCounterGaris(){
        return counterGaris;
    }

     void printGaris(){
        System.out.println("Garis ini terdiri dari ");
        System.out.print("Titik Awal : ");
        A.printTitik();
        System.out.print("Titik Akhir : ");
        B.printTitik();
    }

    void setA(Titik A){
        this.A = A;
    }

    void setB(Titik B){
        this.B = B;
    }

    Titik getA(){
        return A;
    }

    Titik  getB(){
        return B;
    }

    double getPanjang(){
        return Math.abs(Math.sqrt(Math.pow(A.getAbsis()-B.getAbsis(),2)+Math.pow(A.getOrdinat()-B.getOrdinat(),2)));
    }

    double getGradien(){
        return (B.getOrdinat()-A.getOrdinat())/(B.getAbsis()-A.getAbsis());
    }


    boolean  isSejajar(Garis G){
        return this.getGradien()==G.getGradien();
    }

    boolean isTegakLurus(Garis G){
        return this.getGradien()*G.getGradien()==-1;
    }

    String getPersamaanGaris() {
        double m = getGradien();
        double c = A.getOrdinat() - m * A.getAbsis();
        return "y = " + m + "x + " + c;
    }

    Titik getTitikTengah() {
        double midX = (A.getAbsis() + B.getAbsis()) / 2;
        double midY = (A.getOrdinat() + B.getOrdinat()) / 2;

        return new Titik(midX, midY);
    }
}