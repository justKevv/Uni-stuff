package week3;

public class Blocks {
    public int width, length, height;

    public Blocks(int p, int l, int t) {
        length = p;
        width = l;
        height = t;
    }

    public int countVolume() {
        return width * height * length;
    }
}
