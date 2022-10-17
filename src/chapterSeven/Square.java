package chapterSeven;

public class Square extends Graph{
    private double length;
    private double width;
    private double square;

    public double getSquare() {
        return square;
    }

    public void setLengthAndWidth(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateSquare() {
        this.square = length * width;
    }
}