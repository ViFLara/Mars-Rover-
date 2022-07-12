package src.rover;

import src.instructions.Instructions;
import src.position.Position;

public class Rover {
    private Instructions instructions;
    private Position position;

    public Rover(Instructions instructions, Position position) {
        this.instructions = instructions;
        this.position = position;
    }
    public Position getPosition() {
        return position;
    }

    public void roverInstructions(String instructions) {
        instructions.chars().mapToObj(c -> (char) c).forEach(this::roverInstructions);
    }
    private void roverInstructions(Character instruction) {
        if (instruction.equals('L')) instructions.turnLeft();
        else if (instruction.equals('R')) instructions.turnRight();
        else if (instruction.equals('M')) instructions.moveForward();
    }
}