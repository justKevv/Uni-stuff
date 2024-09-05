public class TransaksiRental {
    int count = 1;
    int kodeTransaksi, lamaPinjam;
    String namaPeminjam;
    double totalBiaya;

    BarangRental br;

    public TransaksiRental(String namaPeminjam, int lamaPinjam, BarangRental br) {
        this.kodeTransaksi = count++;
        this.lamaPinjam = lamaPinjam;
        this.namaPeminjam = namaPeminjam;
        this.br = br;
        this.totalBiaya = calculateTotalBiaya();
    }

    private double calculateTotalBiaya() {
        double biaya = br.getBiayaSewa() * lamaPinjam;

        if (isMember(namaPeminjam)) {
            biaya -= 25000;
        }

        if (lamaPinjam >= 48 && lamaPinjam <= 78) {
            biaya *= 0.9;
        } else if (lamaPinjam > 78) {
            biaya *= 0.8;
        }

        return biaya;
    }

    private boolean isMember(String namaPeminjam) {
        return namaPeminjam.endsWith("i");
    }

    // Getter untuk mendapatkan kode transaksi
    public int getKodeTransaksi() {
        return kodeTransaksi;
    }

    // Getter untuk mendapatkan nama peminjam
    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    // Getter untuk mendapatkan lama pinjam
    public int getLamaPinjam() {
        return lamaPinjam;
    }

    // Getter untuk mendapatkan total biaya
    public double getTotalBiaya() {
        return totalBiaya;
    }

    // Getter untuk mendapatkan barang rental
    public BarangRental getBarangRental() {
        return br;
    }

    // Metode toString untuk representasi string dari objek TransaksiRental
    @Override
    public String toString() {
        return kodeTransaksi + " "+ br.getNoTNKB() + br.getNamaKendaraan() + " " + namaPeminjam + " " + lamaPinjam + " " + totalBiaya;
    }
}
