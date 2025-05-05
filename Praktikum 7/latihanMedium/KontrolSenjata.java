
package latihanMedium;


public class KontrolSenjata {
    private Senjata senjata;
    
    
    public KontrolSenjata(){
        senjata = null;
    }
    
    public KontrolSenjata(Senjata s){
        senjata = s;
    }
    public boolean isAdaPeluru(){
        return senjata.getPeluru()>0;
    }
    
    public void isiPeluru(int P){
        senjata.setPeluru(P);
        System.out.println("Peluru berhasil ditambah : " + P);
    }
    public void menembak(int jumlah) {

        System.out.println("Siap menembak " + jumlah + " kali");
        if (!isAdaPeluru()){
        System.out.println("Peluru Habis");
        }
        if (isAdaPeluru()){
            for (int i = 0; i < jumlah; i++) {
                if (0 < senjata.getPeluru()){
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(senjata.getPeluru()-1);
                    System.out.println("Peluru sisa : " + senjata.getPeluru());
                    //sengaja dibuat per iterasi peluru sisanya
                }
                else {
                    System.out.println("Gagal tembak, peluru habis");
                }
            }
        }
        
        System.out.println();
    }

    public void pasangBayonet() {
        senjata.setMenusuk(true);
        System.out.println("Bayonet telah dipasang.");
    }

    public void menusuk() {
        if (true==senjata.isMenusuk()) {
            System.out.println("Jleb!");
        } else {
            System.out.println("Tidak bisa menusuk, belum pasang bayonet.");
        }
    }
}
