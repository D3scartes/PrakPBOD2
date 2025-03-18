/* Nama file : MLingkaran.java
Deskripsi : Main program lingkaran
Pembuat : Phoa Yohanes Theo Arvarrel
NIM : 24060123130069
Tanggal : 13 Maret, 2025
 */
public class MLingkaran {
    public static void main (String[] args){
        Lingkaran L1 = new Lingkaran();
        Lingkaran L2 = new Lingkaran(14,"merah","hitam");

        L1.setJari(7);
        L1.setWarna("Pink");
        L1.setBorder("Hitam");

        System.out.println("Luas L2 : " + L2.getLuas());
        System.out.println("Keliling L1 : " + L2.getKeliling());
        L1.printInfo();
    }
}
