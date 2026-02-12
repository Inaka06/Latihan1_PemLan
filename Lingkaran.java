public class Lingkaran extends BidangDuaDimensi {
    private double jari_jari;
    private double luas;

    public Lingkaran(String nama, int jari_jari){
        super(nama);
        this.jari_jari = jari_jari;
    }

    @Override
    public void luas(){
        this.luas = Math.PI * jari_jari * jari_jari;
        System.out.println("Luas lingkaran : " + luas);
    }
}
