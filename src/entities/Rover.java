package src.entities;

import src.enums.Direction;

public class Rover {
    private Integer limitX;
    private Integer limitY;
    Integer x = 0;
    Integer y = 0;

    Direction facing = Direction.N;
    public Rover() {}

    public void setPosition(Integer x, Integer y, Direction facing) {
        this.x = x;
        this.y = y;
        this.facing = facing;
    }
    public void setlimitPlan(Integer limitX, Integer limitY) {
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
      facing = this.facing.left();
    }
    private void turnRight() {
       facing = this.facing.right();
    }
}