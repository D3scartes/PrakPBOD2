/* Nama file : Mtitik.java
Deskripsi : Main driver titik
Pembuat : Phoa Yohanes Theo Arvarrel
NIM : 24060123130069
Tanggal : 19 Februari, 2025
 */

public class Mtitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        System.out.println("Titiknya ada : " + Titik.getCounterTitik());

        Titik T2 = new Titik(2,4);
        System.out.println("Sekarang ada : " + Titik.getCounterTitik());

        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(5,5);
        T1.printTitik();

        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.setAbsis(-3);
        T2.setOrdinat(-4);
        System.out.println("Kuadran : " + T2.getKuadran());
        System.out.println("Jarak ke pusat : " + T2.getJarakPusat());
        System.out.println("Titik : " + T2.getJarak(T1));
        T2.printTitik();
        T2.refleksiX();
        T2.refleksiY();
        T2.printTitik();
        Titik T3 = T2.getRefleksiX();
        T3.printTitik();
    }
}
