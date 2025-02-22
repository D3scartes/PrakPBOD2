/* Nama file : MGaris.java
Deskripsi : Main driver Garis
Pembuat : Phoa Yohanes Theo Arvarrel
NIM : 24060123130069
Tanggal : 21 Februari, 2025
 */

public class MGaris {
    public static void main(String[] args){
        Titik T1 = new Titik(1, 2);
        Titik T2 = new Titik(3, 4);
        Titik T3 = new Titik(2,3);
        Titik T4 = new Titik(4,5);
        Titik T5 = new Titik(4,1);

        Garis G1 = new Garis();
        G1.printGaris();
        Garis G2 = new Garis(T1,T2);
        G2.printGaris();
        System.out.println("Titik A G2 : " + G2.getA());
        System.out.println("Panjang G2 : " + G2.getPanjang());
        System.out.println("Gradien G2 : " + G2.getGradien());
        Garis G3 = new Garis(T3,T4);
        System.out.println("Gradien G3 : " + G3.getGradien());
        System.out.println("isSejajar G2 dan G3 : " + G2.isSejajar(G3));
        Garis G4 = new Garis(T3,T5);
        System.out.println("isTegakLurus G2 dan G3 : " + G2.isTegakLurus(G4));
        System.out.println("Persamaan G4 : " + G4.getPersamaanGaris());
        System.out.println("Total garis : " + Garis.getCounterGaris());
        System.out.println("Titik tengah G3 : " + G3.getTitikTengah());
    }
}
