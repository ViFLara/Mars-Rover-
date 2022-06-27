package enums;

public enum Direction {

    N('N'),
    E('E'),
    W('W'),
    S('S');

    private final char n;

    Direction(char n) {
        this.n = n;
    }
}
