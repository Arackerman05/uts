package model;
// Class induk (Parent Class
public class Makanan {
    // Encapsulation: atribut private
    private String nama;
    private double harga;
    // Constructor
    public Makanan(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    // Getter dan Setter (Encapsulation)
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    // Method untuk menampilkan informasi makanan
    public void tampilkanInfo() {
        System.out.println("Nama Makanan: " + nama);
        System.out.println("Harga: Rp " + harga);
    }
}