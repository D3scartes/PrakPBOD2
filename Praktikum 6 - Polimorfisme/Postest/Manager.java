public class Manager extends Pegawai {
    private int tunjangan = 700000;

    Manager(String n){
        super(n);
    }

    @Override
    void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}
