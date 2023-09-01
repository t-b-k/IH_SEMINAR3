package task4;

public class Point2D {
    private int i;
    private int j;

    public Point2D(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    @Override
    public String toString() {
        return String.format("[%d,%d] ", i, j);
    }
}
