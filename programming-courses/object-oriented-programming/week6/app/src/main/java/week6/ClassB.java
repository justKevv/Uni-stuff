package week6;

public class ClassB extends ClassA {
    private int z;

    public void getNilaiZ() {
        System.out.println("Nilai z = " + z);
    }

    void getJumlah() {
        System.out.println("Jumlah "+(x+y+z));
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getZ() {
        return z;
    }
}
