package utils;

import model.Makanan;
import model.MakananSpesial;
import model.MakananUtama;

public class MenuDatabase {

    // Array berisi menu makanan (Object-Oriented + Array)
    public static Makanan[] getDaftarMenu() {
        Makanan[] menu = new Makanan[3]; // array berisi 3 makanan

        menu[0] = new Makanan("Nasi Goreng", 15000);
        menu[1] = new MakananUtama("Ayam Geprek", 18000, true);
        menu[2] = new MakananSpesial("Sate Ayam", 25000, false, "Es Teh Manis");

        return menu;
    }
}