class App {
    public static void main(String[] args) {
        BujurSangkar persegi = new BujurSangkar("persegi 1", 20);
        persegi.info();
        persegi.luas();

        Lingkaran lingkaran = new Lingkaran("lingkaran 1", 7);
        lingkaran.info();
        lingkaran.luas();
    }
}
