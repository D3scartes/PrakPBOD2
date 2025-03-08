/*
File        : AngkaSial.java
Deskripsi   : Program penggunaan exception buatan sendiri pengenalan klausa 'throw' dan 'throws'
Nama NIM    : Phoa Yohanes Theo Arvarrel & 24060123130069
Tanggal     : 6 Maret 2025
 */
public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13)   {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati hati memasukkan angka!!!");
        }
    }
}
//Ketika eksepsi terjadi, maka baris 12 pada file ini tidak akan dieksekusi. Eksekusi akan langsung terhenti dan tidak melanjutkan instruksi selanjutnya
//Ketika eksepsi terjadi, program akan masuk ke blok catch, sehingga baris 21 akan dieksekusi, lalu mengeluarkan output pesan dari catch yang ada