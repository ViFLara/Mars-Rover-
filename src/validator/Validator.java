package src.validator;

import src.enums.Direction;
import src.limit.Limit;

public class Validator {
    public static boolean validatePosition(String position, Limit limit) {
        int x;
        int y;
        try {
            String[] positionArray = position.split(" ");
            String xStr = positionArray[0];
            String yStr = positionArray[1];
            String directionStr = positionArray[2];
            x = Integer.parseInt(xStr);
            y = Integer.parseInt(yStr);
            Direction.valueOf(directionStr);
        } catch (Exception e) {
            return false;
        }
        return !validateLimit(x, y, limit);
    }
    private static boolean validateLimit(int x, int y, Limit limit) {
        return limit.limit(x, y);
    }
}
