package week6;

public class AssignmentMain {
    public static void main(String[] args) {
        DaftarGaji daftarGaji = new DaftarGaji(2);

        Dosen dosen1 = new Dosen("123", "Dr. Budi", "Jl. Jend. Sudirman");
        dosen1.setSKS(12);

        daftarGaji.addPegawai(dosen1);

        daftarGaji.cetakGaji();
    }
}
