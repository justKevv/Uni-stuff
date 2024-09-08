package week2;

public class TestMahasiswa {
    public static void main(String[] args) {
        // First Mahasiswa object
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nim = 101;
        mahasiswa1.nama = "Lestari";
        mahasiswa1.alamat = "Jl. Vinolia No 1A";
        mahasiswa1.kelas = "1A";
        mahasiswa1.tampilBiodata();

        // Second Mahasiswa object
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nim = 102;
        mahasiswa2.nama = "Budi";
        mahasiswa2.alamat = "Jl. Mangga No 5B";
        mahasiswa2.kelas = "2B";
        mahasiswa2.tampilBiodata();

        // Third Mahasiswa object
        Mahasiswa mahasiswa3 = new Mahasiswa();
        mahasiswa3.nim = 103;
        mahasiswa3.nama = "Siti";
        mahasiswa3.alamat = "Jl. Anggrek No 3C";
        mahasiswa3.kelas = "3C";
        mahasiswa3.tampilBiodata();
    }
}
