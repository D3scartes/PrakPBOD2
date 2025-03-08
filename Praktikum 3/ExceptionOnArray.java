/*
File        : ExceptionOnArray.java
Deskripsi   : Program penggunaan eksepsi menggunakan class library java
Nama NIM    : Phoa Yohanes Theo Arvarrel & 24060123130069
Tanggal     : 6 Maret 2025
 */
public class ExceptionOnArray{
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer [4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }finally {
            System.out.println("clean up code...");
        }
    }
}
