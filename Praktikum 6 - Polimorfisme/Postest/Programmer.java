public class Programmer extends Pegawai{
    private int bonus = 450000;

    Programmer(String n){
        super(n);
    }

    @Override
    void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}
