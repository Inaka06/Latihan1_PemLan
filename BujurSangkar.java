public class BujurSangkar extends BidangDuaDimensi {
    private double sisi;
    private double luas;

    public BujurSangkar(String nama, int sisi){
        super(nama);
        this.sisi = sisi;
    }

    @Override
    public void luas(){
        this.luas = sisi * sisi;
        System.out.println("Luas bujur sangkar : " + luas);
    }
}
