package week6;

public class Dosen extends Pegawai {

    private int jumlahSKS;
    private static final int TARIF_SKS = 50000;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);

    }
    public void setSKS(int SKS) {
        this.jumlahSKS = SKS;
    }

    @Override
    public int getGaji() {
        return this.jumlahSKS * TARIF_SKS;
    }
}
