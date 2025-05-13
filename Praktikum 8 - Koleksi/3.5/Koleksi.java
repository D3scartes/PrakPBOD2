public class Koleksi<T> {
    private int nbelm;
    private T[] wadah;

    public Koleksi(int k) {
        this.wadah = (T[]) new Object[k];
        this.nbelm = 0;
    }

    public T getIsi(int i) {
        if (i >= 0 && i < nbelm) {
            return wadah[i];
        } else {
            throw new IndexOutOfBoundsException("Index tidak valid");
        }
    }

    public void setIsi(int i, T e) {
        if (i >= 0 && i < nbelm) {
            wadah[i] = e;
        } else {
            throw new IndexOutOfBoundsException("Index tidak valid");
        }
    }

    public int getSize() {
        return nbelm;
    }

    public void setSize(int s) {
        if (s >= 0 && s <= wadah.length) {
            nbelm = s;
        } else {
            throw new IllegalArgumentException("Ukuran tidak valid");
        }
    }

    public void add(T e) {
        if (nbelm < wadah.length) {
            wadah[nbelm] = e;
            nbelm++;
        } else {
            System.out.println("Koleksi penuh. Tidak dapat menambahkan elemen.");
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < nbelm) {
            for (int i = index; i < nbelm - 1; i++) {
                wadah[i] = wadah[i + 1];
            }
            wadah[nbelm - 1] = null;
            nbelm--;
        } else {
            throw new IndexOutOfBoundsException("Index tidak valid");
        }
    }

    public void showAll() {
        System.out.println("Daftar anabul :");
        for (int i = 0; i < nbelm; i++) {
            T elemen = wadah[i];
            Anabul a = (Anabul) elemen;
            System.out.println("Nama: " + a.getNama());
            System.out.print("Suara: ");
            a.Bersuara();
            System.out.print("Gerak: ");
            a.Gerak();
            System.out.println();

        }
    }
}
