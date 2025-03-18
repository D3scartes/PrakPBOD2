/* Nama file : BangunDatar.java
Deskripsi : Program Bangun Datar
Pembuat : Phoa Yohanes Theo Arvarrel
NIM : 24060123130069
Tanggal : 13 Maret, 2025
 */
public class BangunDatar {

    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    public BangunDatar(){
        counterBangunDatar++;
    }

    public BangunDatar(int i, String warna, String border) {
        this.jmlSisi = i;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah bangun datar : " + counterBangunDatar);
    }
    public int getJmlSisi(){
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    public String getBorder(){
        return border;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }
    public void setBorder(String border){
        this.border = border;
    }

    public void printInfo(){
        System.out.println("Jumlah sisi : " + jmlSisi);
        System.out.println("Warna : " + warna);
        System.out.println("Border : " + border);
    }
}
