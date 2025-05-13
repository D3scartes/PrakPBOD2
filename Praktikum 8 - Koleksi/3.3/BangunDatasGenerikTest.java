public class BangunDatasGenerikTest {
    public static void main(String[] args){
        //Lingkaran
        Lingkaran l = new Lingkaran(7);
        BangunDatarGenerik<Lingkaran> bdg = new BangunDatarGenerik<>();
        bdg.setBangunDatar(l);
        System.out.println("Keliling lingkaran : " + bdg.hitungKeliling());
        System.out.println("tipe generic : " + bdg.getBangunDatar().getClass().getName());
        System.out.println();

        //Persegi
        Persegi p = new Persegi(5);
        BangunDatarGenerik<Persegi> PGenerik = new BangunDatarGenerik<>();
        PGenerik.setBangunDatar(p);
        System.out.println("Luas persegi : " + PGenerik.hitungLuas());
        System.out.println("tipe generic : " + PGenerik.getBangunDatar().getClass().getName());
        System.out.println();

        //Persegi Panjang
        PersegiPanjang pp = new PersegiPanjang(8,4);
        BangunDatarGenerik<PersegiPanjang> PPGenerik = new BangunDatarGenerik<>();
        PPGenerik.setBangunDatar(pp);
        System.out.println("Keliling persegi panjang : " + PPGenerik.hitungKeliling());
        System.out.println("tipe generic : " + PPGenerik.getBangunDatar().getClass().getName());
        System.out.println();

        //Segitiga
        Segitiga s = new Segitiga(2,3);
        BangunDatarGenerik<Segitiga> SGenerik = new BangunDatarGenerik<>();
        SGenerik.setBangunDatar(s);
        System.out.println("Luas segitga : " + SGenerik.hitungLuas());
        System.out.println("tipe generic : " + SGenerik.getBangunDatar().getClass().getName());
    }
}
