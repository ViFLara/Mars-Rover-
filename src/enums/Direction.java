package src.enums;

public enum Direction {
    N('N') {
        @Override
        public Direction right() {
            return Direction.E;
        }
        @Override
        public Direction left() { return Direction.W; }
    },

    E('E') {
        @Override
        public Direction right() {
            return Direction.S;
        }

        @Override
        public Direction left() { return Direction.N; }
    },

    W('W') {
        @Override
        public Direction right() {
            return Direction.N;
        }

        @Override
        public Direction left() { return Direction.S; }
    },

    S('S') {
        @Override
        public Direction right() {
            return Direction.W;
        }

        @Override
        public Direction left() { return Direction.E; }
    };

    private final char n;

    Direction(char n) {
        this.n = n;
    }

    public abstract Direction right() ;

    public abstract Direction left() ;

}
