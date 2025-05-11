import java.util.Scanner;

import model.Makanan;
import model.Pelanggan;
import model.Pesanan;
import utils.MenuDatabase;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di Aplikasi Pemesanan Makanan!");
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();

        System.out.print("Masukkan no HP Anda: ");
        String noHp = input.nextLine();

        Pelanggan pelanggan = new Pelanggan(nama, noHp);

        // Menampilkan daftar menu
        Makanan[] menu = MenuDatabase.getDaftarMenu();
        System.out.println("\nDaftar Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.print((i + 1) + ". ");
            menu[i].tampilkanInfo();
            System.out.println();
        }

        System.out.print("Pilih nomor menu (1-" + menu.length + "): ");
        int pilihan = input.nextInt();

        if (pilihan >= 1 && pilihan <= menu.length) {
            Makanan makananDipilih = menu[pilihan - 1];
            Pesanan pesanan = new Pesanan(pelanggan, makananDipilih);

            System.out.println();
            pesanan.tampilkanDetailPesanan();
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}