package week2;


public class BarangAssignment {
    String kode;
    String namaBarang;
    int hargaDasar;
    float diskon;

    int hitungHargaJual() {
        return (int) (hargaDasar * (diskon * hargaDasar));
    }

    void tampilBarang() {
        System.out.println("Kode \t: " + kode);
        System.out.println("Barang \t: " + namaBarang);
        System.out.println("Harga Dasar \t: " + hargaDasar);
        System.out.println("Diskon \t: " + diskon);
        System.out.println("Harga Jual \t: " + hitungHargaJual());
    }
}
