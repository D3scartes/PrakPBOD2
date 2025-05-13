public class Main {
    public static void main(String[] args) {
        Koleksi<Character> koleksiChar = new Koleksi<>(10);

        koleksiChar.add('A');
        koleksiChar.add('B');
        koleksiChar.add('C');
        koleksiChar.add('D');
        koleksiChar.add('E');
        koleksiChar.add('F');
        koleksiChar.add('G');
        koleksiChar.add('H');
        koleksiChar.add('I');
        koleksiChar.add('J');

        koleksiChar.showAll();

        koleksiChar.setIsi(1, 'Z');
        koleksiChar.showAll();

        koleksiChar.delete(0);
        koleksiChar.showAll();

        System.out.println("Elemen indeks 0: " + koleksiChar.getIsi(0));
        System.out.println("Jumlah elemen: " + koleksiChar.getSize());
    }
}
