public class BangunDatarGenerik <T extends BangunDatar>{
    private T bangunDatar;

    public void setBangunDatar(T bangunDatar) {
        this.bangunDatar = bangunDatar;
    }

    public T getBangunDatar() {
        return bangunDatar;
    }

    public double hitungKeliling(){
        return getBangunDatar().hitungKeliling();
    }

    public double hitungLuas() {
        return getBangunDatar().hitungLuas();
    }
}
