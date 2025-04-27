import java.util.ArrayList;


public class Main {
    public static void main(String[] args){
        Anabul kucing = new Kucing("Siti");
        Anabul anjing = new Anjing("Blek");
        Anabul burung = new Burung("Skay");
        ArrayList<Anabul> hewan = new ArrayList<>();
        hewan.add(kucing);
        hewan.add(anjing);
        hewan.add(burung);

        for (Anabul i : hewan){
            System.out.println("Nama : " + i.getNama());
            i.Gerak();
            i.Bersuara();
            System.out.println();

        }
    }
}
