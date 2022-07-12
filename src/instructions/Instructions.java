package src.instructions;
import src.enums.Direction;
import src.position.Position;

public class Instructions {
    private Position position;
    private Direction facing;
    public Instructions(Position position, Direction facing) {
        this.position = position;
        this.facing = facing;
    }
    public void moveForward() {
        if (facing == Direction.N) position.updatePosition("Y",1);
        else if (facing == Direction.E) position.updatePosition("X",1);
        else if (facing == Direction.S) position.updatePosition("Y",-1);
        else if (facing == Direction.W) position.updatePosition("X",-1);
    }
    public void turnLeft() {facing = this.facing.left();}

    public void turnRight() {
        facing = this.facing.right();
    }
}
