/* Nama file : MPersegi.java
Deskripsi : Main program persegi
Pembuat : Phoa Yohanes Theo Arvarrel
NIM : 24060123130069
Tanggal : 13 Maret, 2025
 */
public class MPersegi {
    public static void main(String[] args) {
        Persegi P1 = new Persegi();
        Persegi P2 = new Persegi(3,"biru","hitam");
        P1.setBorder("Hitam");
        P1.setWarna("Putih");
        P1.setSisi(7);
        System.out.println("Panjang sisi P2 adalah : " + P2.getSisi());
        System.out.println("Warna P2 adalah : " + P2.getWarna());
        System.out.println("Border P2 adalah : " + P2.getBorder());
        System.out.println("Luas P1 : " + P1.getLuas());
        System.out.println("Keliling P1 : " + P1.getKeliling());
        System.out.println("Diagonal P1 : " + P1.getDiagonal());

        P1.printInfo();
    }
}
