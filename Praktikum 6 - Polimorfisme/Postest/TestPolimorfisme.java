import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai =  new Programmer("Mira");
        Pegawai pegawai2 = new Manager ("Joko");
        Manager pegawai3 = new Manager("Argo");
        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai);
        emps.add(pegawai2);
        emps.add(pegawai3);
        for (Pegawai emp: emps) {
                emp.tampilData();
            }
    }
}

//2. Polimorfisme disini dimanfaatkan untuk menyimpan tipe objek Programmer dan Manager di 1 array list bertipe Pegawai. Kita bisa memanggil method sesuai dengan tipe objeknya walaupun referensinya adalah tipe parentnya. Programmer dan Manager bisa disimpan di array list Pegawai

//3. Jika ingin menambahkan pegawai4 dan pegawai5 tanpa polimorfisme maka kita tidak bisa menyimpan programmer dan manager di 1 array list Pegawai. Kita juga harus memakai kondisi if else untuk melakukan pengecekan ke semua pegawai, karena tipe objeknya tidak direferensikan terhadap Pegawai. Tidak efisien, dan sulit dikembangkan jika menambah jenis pegawai lain.