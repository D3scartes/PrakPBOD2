/*
File        : AngkaSialException.java
Deskripsi   : Eksepsi buatan sendiri, menolak masukkan angka 13
Nama NIM    : Phoa Yohanes Theo Arvarrel & 24060123130069
Tanggal     : 6 Maret 2025
 */
public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial!");
    }
}


