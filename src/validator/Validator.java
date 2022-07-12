package src.validator;

import src.enums.Direction;
import src.limit.Limit;

public class Validator {
    public static boolean validatePosition(String position, Limit limit) {

        int x = 0;

        int y = 0;

        Direction direction = Direction.N;

        String[] positionArray = position.split(" ");
        String xStr = positionArray[0];
        String yStr = positionArray[1];
        String directionStr = positionArray[2];

        try {
            x = Integer.parseInt(xStr);
            y = Integer.parseInt(yStr);
            direction = Direction.valueOf(directionStr);
        } catch (Exception e) {
            return false;
        }
        if(limit.limit(x, y)) {
            return false;
        }
        return true;
    }
}
