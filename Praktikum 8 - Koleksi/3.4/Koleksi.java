public class Koleksi<T> {
    private int nbelm;
    private T[] wadah;

    public Koleksi(int kapasitas) {
        this.wadah = (T[]) new Object[kapasitas];
        this.nbelm = 0;
    }

    public T getIsi(int index) {
        if (index >= 0 && index < nbelm) {
            return wadah[index];
        } else {
            throw new IndexOutOfBoundsException("Index tidak valid");
        }
    }

    public void setIsi(int index, T elemenBaru) {
        if (index >= 0 && index < nbelm) {
            wadah[index] = elemenBaru;
        } else {
            throw new IndexOutOfBoundsException("Index tidak valid");
        }
    }

    public int getSize() {
        return nbelm;
    }

    public void setSize(int ukuranBaru) {
        if (ukuranBaru >= 0 && ukuranBaru <= wadah.length) {
            nbelm = ukuranBaru;
        } else {
            throw new IllegalArgumentException("Ukuran tidak valid");
        }
    }

    public void add(T elemen) {
        if (nbelm < wadah.length) {
            wadah[nbelm] = elemen;
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
        System.out.print("Isi koleksi: ");
        for (int i = 0; i < nbelm; i++) {
            System.out.print(wadah[i] + " ");
        }
        System.out.println();
    }
}
