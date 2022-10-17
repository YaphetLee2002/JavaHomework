package chapterSeven;

public class Circle extends Graph {

    private int radius;
    private double square;
    
    public double getSquare() {
        return square;
    }
    
    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    @Override
    public void calculateSquare() {
        this.square = radius * radius * Math.PI;
    }
}
