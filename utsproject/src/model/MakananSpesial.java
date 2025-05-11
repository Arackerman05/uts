package model;

// Inheritance bertingkat: MakananSpesial -> MakananUtama -> Makanan
public class MakananSpesial extends MakananUtama {
    private String bonus;

    public MakananSpesial(String nama, double harga, boolean isPedas, String bonus) {
        // Memanggil constructor dari parent (MakananUtama)
        super(nama, harga, isPedas);
        this.bonus = bonus;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    // Override method tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Panggil info dari parent
        System.out.println("Bonus: " + bonus);
    }
}