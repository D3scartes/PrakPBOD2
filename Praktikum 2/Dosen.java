import java.awt.color.ProfileDataException;

public class Dosen {

    /*************Atribut*************/
    private String nip;
    private String nama;
    private String prodi;

    /*************Method*************/

    public Dosen(){
        nip = "";
        nama = "";
        prodi = "";
    }

    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNip(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

}
