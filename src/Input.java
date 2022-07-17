package src;

import src.instructions.Instructions;
import src.limit.Limit;
import src.parse.InstructionParser;
import src.position.Position;
import src.rover.Rover;
import src.validator.Validator;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        ArrayList<Rover> rovers = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the limit position: ");
        Limit limit= InstructionParser.parseLimit(sc.nextLine());
        System.out.println("Enter a rover position: ");

        while(sc.hasNextLine()) {
            String position = sc.nextLine();
            if(position.equals("e")){
                break;
            }
            if (!Validator.validatePosition(position, limit)) {
                System.out.println("Invalid data. Enter the position again");
                continue;
            }

            Position position1 = InstructionParser.parsePosition(position, limit);
            Instructions instructions = InstructionParser.parseInstruction(position1);
            Rover rover = InstructionParser.parseRover(instructions, position1);
            rovers.add(rover);

            System.out.println("Enter the instructions:");
            rover.roverInstructions(sc.nextLine());
            System.out.println("Enter a new rover position or e to exit:");
        }

        rovers.forEach(r -> System.out.println(r.getPosition()));
        sc.close();
}}
