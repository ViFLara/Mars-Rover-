package src.limit;

public class Limit {
    private int limitX;
    private int limitY;

    public Limit(int limitX, int limitY) {
        this.limitX = limitX;
        this.limitY = limitY;
    }
    public boolean limit(int x, int y) {
        return validGt(x, limitX) ||
                validGt(y, limitY) ||
                validLt(x, 0) ||
                validLt(y, 0);
    }
    private boolean validGt(int value, int valueT) {
        return value > valueT;
    }

    private boolean validLt(int value, int valueT) {
        return value < valueT;
    }
}
