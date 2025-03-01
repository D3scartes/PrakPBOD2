import java.util.ArrayList;

public class Mahasiswa {
    /*************Atribut*************/

    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /*************Method*************/

    public Mahasiswa(){
        nim = "";
        nama = "";
        prodi = "";
        this.listMatKul = new ArrayList<>();
    }

    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();

    }

    public void addMatKul(MataKuliah newMatKul){
        listMatKul.add(newMatKul);
    }


    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public String getNim(){
        return nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public int getJumlahMatKul(){
        return listMatKul.size();
    }

    public void getDosenWali(){
        System.out.println("Dosen Wali : " + dosenWali.getNama());
        System.out.println("NIP Dosen Wali : " + dosenWali.getNip());
        System.out.println("Prodi Dosen Wali : " + dosenWali.getProdi());
    }

    public void getKendaraan(){
        System.out.println("Kendaraan : " +  kendaraan.getJenis());
        System.out.println("Plat kendaraan : " + kendaraan.getNoPlat());
    }

    public int getJumlahSKS(){
        int i;
        int sum = 0;
        for(i=0;i<listMatKul.size();i++){
            sum += listMatKul.get(i).getSks();
        }
        return sum;
    }
    public void addMatkul(MataKuliah newMatKul){
        listMatKul.add(newMatKul);
    }

    public void setDosenWali(Dosen newDosen){
        this.dosenWali = newDosen;
    }

    public void setKendaraan(Kendaraan newKendaraan){
        this.kendaraan = newKendaraan;
    }
    public void printDetailMhs(){
        System.out.println("Nim : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi " + prodi);
        int i;
        for(i=0;i<listMatKul.size();i++){
            System.out.println(listMatKul.get(i).getNama());
        }
        System.out.println("Dosen Wali : " + dosenWali.getNama());
        System.out.println("NIP Dosen Wali : " + dosenWali.getNip());
        System.out.println("Prodi Dosen Wali : " + dosenWali.getProdi());
        System.out.println("Kendaraan : " +  kendaraan.getJenis());
        System.out.println("Plat kendaraan : " + kendaraan.getNoPlat());
    }

    public void printMhs(){
        System.out.println("Nim : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi " + prodi);
    }

}
