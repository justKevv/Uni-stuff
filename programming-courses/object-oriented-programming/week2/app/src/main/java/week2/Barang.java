package week2;

public class Barang {
    public String namaBrg;
    public String jenisBrg;
    public int stok;

    public void tampilBarang() {
        System.out.println("Nama Barang \t\t: " + namaBrg);
        System.out.println("Jenis Barang \t\t: " + jenisBrg);
        System.out.println("Stok \t\t\t: " + stok);
    }

    public int tambahStok(int brgMasuk) {
        int stokBaru = stok + brgMasuk;
        return stokBaru;
    }
}
