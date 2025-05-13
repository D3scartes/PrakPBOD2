import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Koleksi<Anabul> KoleksiAnabul = new Koleksi<>(10);

        String[] namaAnabul = {"wawa", "wowo", "wiwi", "wewe", "wuwu", "baba", "bibi", "bubu", "bebe", "bobo"};

        Random rand = new Random();

        // 10 objek Anabul acak
        for (int i = 0; i < 10; i++) {
            int jenis = rand.nextInt(3); // 0: Kucing, 1: Anjing, 2: Burung
            String nama = namaAnabul[i];

            if (jenis == 0) {
                KoleksiAnabul.add(new Kucing(nama));
            } else if (jenis == 1) {
                KoleksiAnabul.add(new Anjing(nama));
            } else {
                KoleksiAnabul.add(new Burung(nama));
            }
        }

        KoleksiAnabul.showAll();
    }
}
