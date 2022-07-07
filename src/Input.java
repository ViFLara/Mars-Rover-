package src;

import src.entities.Rover;
import src.enums.Direction;

import java.util.Objects;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Rover rover = new Rover();

        Scanner sc = new Scanner(System.in);

        System.out.println("Type the limit position: ");

        String limit = sc.nextLine();

        Integer limitX = Integer.valueOf(limit.split(" ")[0]);
        Integer limitY = Integer.valueOf(limit.split(" ")[1]);

        System.out.println("X: " + limitX +", Y: " + limitY);

        rover.setLimit(limitX, limitY);

        System.out.println("Type the position: ");

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            if(line.equals("")){
                break;
            }
            System.out.println(line);

            Integer X = Integer.valueOf(line.split(" ")[0]);
            Integer Y = Integer.valueOf(line.split(" ")[1]);
            String D = line.split(" ")[2];

            if (X > limitX || Y > limitY) throw new IllegalArgumentException("Type the correct number");
            if ((!Objects.equals(D, "N")) && (!Objects.equals(D, "W")) &&
                    (!Objects.equals(D, "E")) && !Objects.equals(D, "S")) {
                throw new IllegalArgumentException("Type the correct direction");
            } else {
                rover.setPosition(X, Y, Direction.valueOf(D));

                System.out.println("Type the movement: ");

                String movement = sc.nextLine();

                rover.process(movement);
                rover.printPosition();
            }
            System.out.println("Type the position: ");
        }
        sc.close();
    }
}
