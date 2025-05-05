package latihanMedium;

public class Senjata {
    private String bunyi;
    private boolean menusuk;
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.menusuk = false;
    }

    public Senjata() {
        this.bunyi = "";
        this.menusuk = false;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public String getBunyi() {
        return bunyi;
    }
    
    public int getPeluru(){
        return peluru;
    }    

    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }
    
    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
    
    public boolean isMenusuk() {
        return menusuk;
    }

    
}

