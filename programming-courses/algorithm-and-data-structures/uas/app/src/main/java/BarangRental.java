public class BarangRental {
    String noTNKB; // Nomor TNKB
    String namaKendaraan; // Nama kendaraan
    String jenisKendaraan; // Jenis kendaraan
    int tahun; // Tahun kendaraan
    int biayaSewa; // Biaya sewa

    /**
     * Constructor for BarangRental class.
     * @param noTNKB The nomor TNKB.
     * @param namaKendaraan The nama kendaraan.
     * @param jenisKendaraan The jenis kendaraan.
     * @param tahun The tahun kendaraan.
     * @param biayaSewa The biaya sewa.
     */
    public BarangRental(String noTNKB, String namaKendaraan, String jenisKendaraan, int tahun, int biayaSewa) {
        this.noTNKB = noTNKB;
        this.namaKendaraan = namaKendaraan;
        this.jenisKendaraan = jenisKendaraan;
        this.tahun = tahun;
        this.biayaSewa = biayaSewa;
    }

    /**
     * Getter for the nomor TNKB.
     * @return The nomor TNKB.
     */
    public String getNoTNKB() {
        return noTNKB;
    }

    /**
     * Getter for the nama kendaraan.
     * @return The nama kendaraan.
     */
    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    /**
     * Getter for the jenis kendaraan.
     * @return The jenis kendaraan.
     */
    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    /**
     * Getter for the tahun kendaraan.
     * @return The tahun kendaraan.
     */
    public int getTahun() {
        return tahun;
    }

    /**
     * Getter for the biaya sewa.
     * @return The biaya sewa.
     */
    public int getBiayaSewa() {
        return biayaSewa;
    }
}