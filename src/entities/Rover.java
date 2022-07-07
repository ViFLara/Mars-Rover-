package src.entities;

import src.enums.Direction;

public class Rover {
    private Integer limitX;
    private Integer limitY;
    Integer x = 0;
    Integer y = 0;

    Direction facing = Direction.N;
    public Rover() {}

    public Integer getLimitX() {
        return limitX;
    }

    public Integer getLimitY() {
        return limitY;
    }

    public void setPosition(Integer x, Integer y, Direction facing) {
        this.x = x;
        this.y = y;
        this.facing = facing;
    }
    public void setLimit(Integer limitX, Integer limitY) {
        this.limitX = limitX;
        this.limitY = limitY;
    }
    public void printPosition() {

        System.out.println(x  + " "  + y  + " " +  facing);
    }
    public void process(String commands) {
        for (int idx = 0; idx < commands.length(); idx++ ) {
            process(commands.charAt(idx));
        }
    }
    private void process(Character command) {
        if (command.equals('L')) turnLeft();
        else if (command.equals('R')) turnRight();
        else if (command.equals('M')) move();
        else throw new IllegalArgumentException("Type the correct letter");

    }
    private void move() {
        if (facing == Direction.N) y++ ;
        else if (facing == Direction.E) x++ ;
        else if (facing == Direction.S) y--;
        else if (facing == Direction.W) x--;

    }
    private void turnLeft() {
        if (facing == Direction.N) facing = Direction.W;
        else if (facing == Direction.W) facing = Direction.S;
        else if (facing == Direction.S) facing = Direction.E;
        else facing = Direction.N;
    }
    private void turnRight() {
        if (facing == Direction.N) facing = Direction.E;
        else if (facing == Direction.E) facing = Direction.S;
        else if (facing == Direction.S) facing = Direction.W;
        else facing = Direction.N;
    }
}