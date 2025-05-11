package model;

// Class yang mewakili transaksi pesanan
public class Pesanan {
    private Pelanggan pelanggan;
    private Makanan makanan;

    public Pesanan(Pelanggan pelanggan, Makanan makanan) {
        this.pelanggan = pelanggan;
        this.makanan = makanan;
    }

    public void tampilkanDetailPesanan() {
        System.out.println("=== Detail Pesanan ===");
        pelanggan.tampilkanInfo();       // Menampilkan info pelanggan
        System.out.println("---");
        makanan.tampilkanInfo();         // Polymorphism: bisa MakananUtama/MakananSpesial
    }
}