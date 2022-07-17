package src.limit;

public class Limit {
    private int limitX;
    private int limitY;

    public Limit(int limitX, int limitY) {
        this.limitX = limitX;
        this.limitY = limitY;
    }
    public boolean limit(int x, int y) {
        return x > limitX || y > limitY || x < 0 || y < 0;
    }
}
