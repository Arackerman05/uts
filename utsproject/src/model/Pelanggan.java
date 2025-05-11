package model;

// Class Pelanggan dengan encapsulation (semua field private)
public class Pelanggan {
    private String nama;
    private String noHp;

    public Pelanggan(String nama, String noHp) {
        this.nama = nama;
        this.noHp = noHp;
    }

    // Getter dan Setter (Encapsulation)
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Pelanggan: " + nama);
        System.out.println("No. HP: " + noHp);
    }
}