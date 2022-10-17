package chapterFour;

public class Tank {
    private boolean isFull;

    public Tank() {
        this.isFull = false;
    }

    public void setIsFull(boolean isFull) {
        this.isFull = isFull;
    }

    public boolean getIsFull() {
        return isFull;
    }

    public void emptyTheTank() {
        isFull = false;
    }

    protected void finalize() {
        if(isFull) {
            System.out.println("Tank is full!");
        } else {
            System.out.println("Tank is cleaned up!");
        }
    }
}

class TestTank {
    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.setIsFull(true);
        System.out.println("Check tank first!");
        tank.finalize();
        tank.emptyTheTank();
        System.out.println("Check tank second!");
        tank.finalize();
    }
}