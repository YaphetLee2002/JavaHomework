package chapterFiveSix;

public class SquareCalculate {
    private double square;
    public void calculateSquare(int x, int y) {
        this.square = x * y;
    }
    public void calculateSquare(int r) {
        this.square = r * r * Math.PI;
    }
    public double getSquare() {
        return square;
    }
}
