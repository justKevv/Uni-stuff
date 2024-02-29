package week2;

public class BukuMain13 {
    public static void main(String[] args) {
        Buku13 buku = new Buku13();

        buku.judul = "Today Ends Tommorow Comes";
        buku.pengarang = "Denanda Pratiwi";
        buku.halaman = 198;
        buku.stok = 13;
        buku.harga = 71000;

        buku.tampilInformasi();
        buku.terjual(5);
        buku.gantiHarga(60000);
        buku.tampilInformasi();

        Buku13 buku2 = new Buku13("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        buku2.terjual(11);
        buku2.tampilInformasi();

        Buku13 bukuKevin = new Buku13("Do Androids Dream of Electric Sheep", "Hampton Fancher and David Peoples", 200, 8, 40000);
        bukuKevin.terjual(3);
        System.out.println(bukuKevin.hitungHargaTotal(3));
        System.out.println(bukuKevin.hitungDiskon(bukuKevin.hitungHargaTotal(3)));
        System.out.println(bukuKevin.hitungHargaBayar(bukuKevin.hitungHargaTotal(3), bukuKevin.hitungDiskon(bukuKevin.hitungHargaTotal(3))));
        bukuKevin.tampilInformasi();
    }
}
