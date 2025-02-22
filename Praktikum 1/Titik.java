/* Nama file : Titik.java
Deskripsi : Body titik
Pembuat : Phoa Yohanes Theo Arvarrel
NIM : 24060123130069
Tanggal : 19 Februari, 2025
 */

public class Titik {
    //Atribut

    double absis;
    double ordinat;
    static int counterTitik = 0;

    //Konstruktor
    Titik(){
        this.ordinat = 0;
        this.absis = 0;
        counterTitik++;
    }
    Titik (double absis, double ordinat){
        this.ordinat = ordinat;
        this.absis = absis;
        counterTitik++;
    }

    //mengembalikan counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    void setAbsis(double x){
        absis = x;
    }

    void setOrdinat(double y){
        ordinat = y;
    }

    void geser(double x, double y){
        this.absis = this.absis + x;
        this.ordinat = this.ordinat + y;
    }

    void printTitik(){
        System.out.println("(" + absis + "," + ordinat + ")");
    }

    int getKuadran(){
        //Kamus Lokal
        int i = 0;

        //Algo
        if(this.absis>0 && this.ordinat>0 ) {
            i = 1;
        } else if (this.absis<0 && this.ordinat>0) {
            i = 2;
        } else if (this.absis<0 && this.ordinat<0) {
            i = 3;
        } else if (this.absis>0 && this.ordinat<0) {
            i = 4;
        } else {
            i = 0;
        }
        return i;
    }

    double getJarakPusat(){
        return Math.sqrt(Math.pow(this.absis,2) + Math.pow(this.ordinat,2));
    }

    double getJarak(Titik T){
        return Math.abs(Math.sqrt(Math.pow(this.absis-T.getAbsis(),2) + Math.pow(this.ordinat-T.getOrdinat(),2)));
    }

    void refleksiX(){
        ordinat *= -1;
    }

    void refleksiY(){
        absis *= -1;
    }

    Titik getRefleksiX(){
        return new Titik(this.absis*-1,this.ordinat);
    }

    Titik getRefleksiY(){
        return new Titik(this.absis,this.ordinat*-1);
    }

    @Override
    public String toString() {
        return "(" + absis + "," + ordinat + ")";
    }
}

