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

    public Position updatePosition(String axis, Integer value){
        if(axis.equals("X")){
            if(!limit.limit(x + value,y)) {
                x = x + value;
            }
        }
        else{
            if(!limit.limit(x,y + value)){
                y = y + value;
                return this;
            }
        }
        return this;
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
