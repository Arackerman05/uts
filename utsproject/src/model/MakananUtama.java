package model;

// Inheritance: MakananUtama adalah turunan dari Makanan
public class MakananUtama extends Makanan {
    private boolean isPedas;

    // Constructor dengan super() untuk pewarisan
    public MakananUtama(String nama, double harga, boolean isPedas) {
        super(nama, harga); // Memanggil constructor parent class
        this.isPedas = isPedas;
    }

    public boolean isPedas() {
        return isPedas;
    }

    public void setPedas(boolean pedas) {
        isPedas = pedas;
    }

    // Override method dari parent
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Panggil method dari Makanan
        System.out.println("Pedas: " + (isPedas ? "Ya" : "Tidak"));
    }
}