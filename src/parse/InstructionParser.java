package src.parse;

import src.enums.Direction;
import src.instructions.Instructions;
import src.limit.Limit;
import src.position.Position;
import src.rover.Rover;

public class InstructionParser {
    public static Limit parseLimit(String limit) {
        String[] limits = limit.split(" ");
        return new Limit(Integer.parseInt(limits[0]), Integer.parseInt(limits[1]));
    }

    public static Position parsePosition(String positionString, Limit limit) {
        String[] positionArray = positionString.split(" ");
            int x = Integer.parseInt(positionArray[0]);
            int y = Integer.parseInt(positionArray[1]);
            Direction direction = Direction.valueOf(positionArray[2]);
            return new Position(x, y, direction, limit);
    }

    public static Instructions parseInstruction(Position position) {
        return new Instructions(position, position.getDirection());
    }

    public static Rover parseRover(Instructions instructions, Position position) {
        return new Rover(instructions, position);
    }
}

