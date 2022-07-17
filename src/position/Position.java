package src.position;

import src.enums.Direction;
import src.limit.Limit;

public class Position {
    private  int x;

    private  int y;

    private Direction facing;

    private Limit limit;

    public Position(int x, int y, Direction facing, Limit limit) {
        this.x = x;
        this.y = y;
        this.facing = facing;
        this.limit = limit;
    }

    public Direction getDirection() {
        return facing;
    }

    public Position updatePosition(String axis, int value){
        if(axis.equals("X")) validX(value);
        else{
            Position x1 = getPosition(value);
            if (x1 != null) return x1;
        }
        return this;
    }

    private void validX(int value) {
        if(!limit.limit(x + value,y)) {
            x = x + value;
        } }

    private Position getPosition(int value) {
        if(!limit.limit(x,y + value)){
            y = y + value;
            return this;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Position: [" +
                "x=" + x +
                ", y=" + y +
                ", facing=" + facing +
                ']';
    }
}
