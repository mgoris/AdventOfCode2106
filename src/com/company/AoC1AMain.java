package com.company;

import java.util.ArrayList;
import java.util.List;
import com.company.*;

public class AoC1AMain {
    public static void main(String[] args) {
        List<AoC1ADirection> inputData = new ArrayList<AoC1ADirection>();
        List<AoC1ACoordinate> coordinates = new ArrayList<AoC1ACoordinate>();
        List<String> stringCoordinates = new ArrayList<String>();
        AoC1ACoordinate lastCoordinate;
        AoC1ACoordinate nextCoordinate;

        inputData.add(new AoC1ADirection("R", 4));
        inputData.add(new AoC1ADirection("D", 3));
        inputData.add(new AoC1ADirection("L", 5));
        inputData.add(new AoC1ADirection("D", 3));
        inputData.add(new AoC1ADirection("R", 5));
        inputData.add(new AoC1ADirection("D", 2));
        inputData.add(new AoC1ADirection("R", 2));
        inputData.add(new AoC1ADirection("D", 5));
        inputData.add(new AoC1ADirection("R", 2));
        inputData.add(new AoC1ADirection("D", 5));
        inputData.add(new AoC1ADirection("L", 5));
        inputData.add(new AoC1ADirection("U", 5));
        inputData.add(new AoC1ADirection("R", 1));
        inputData.add(new AoC1ADirection("D", 3));
        inputData.add(new AoC1ADirection("R", 2));
        inputData.add(new AoC1ADirection("U", 2));
        inputData.add(new AoC1ADirection("L", 1));
        inputData.add(new AoC1ADirection("U", 5));
        inputData.add(new AoC1ADirection("L", 3));
        inputData.add(new AoC1ADirection("U", 1));
        inputData.add(new AoC1ADirection("L", 2));
        inputData.add(new AoC1ADirection("U", 1));
        inputData.add(new AoC1ADirection("L", 3));
        inputData.add(new AoC1ADirection("D", 5));
        inputData.add(new AoC1ADirection("R", 1));
        inputData.add(new AoC1ADirection("D", 3));
        inputData.add(new AoC1ADirection("R", 4));
        inputData.add(new AoC1ADirection("D", 2));
        inputData.add(new AoC1ADirection("L", 4));
        inputData.add(new AoC1ADirection("D", 3));
        inputData.add(new AoC1ADirection("R", 1));
        inputData.add(new AoC1ADirection("D", 4));
        inputData.add(new AoC1ADirection("R", 4));
        inputData.add(new AoC1ADirection("D", 3));
        inputData.add(new AoC1ADirection("R", 5));
        inputData.add(new AoC1ADirection("U", 3));
        inputData.add(new AoC1ADirection("R", 188));
        inputData.add(new AoC1ADirection("D", 4));
        inputData.add(new AoC1ADirection("R", 1));
        inputData.add(new AoC1ADirection("D", 48));
        inputData.add(new AoC1ADirection("R", 5));
        inputData.add(new AoC1ADirection("D", 4));
        inputData.add(new AoC1ADirection("L", 71));
        inputData.add(new AoC1ADirection("U", 3));
        inputData.add(new AoC1ADirection("L", 2));
        inputData.add(new AoC1ADirection("U", 188));
        inputData.add(new AoC1ADirection("L", 3));
        inputData.add(new AoC1ADirection("U", 2));
        inputData.add(new AoC1ADirection("L", 3));
        inputData.add(new AoC1ADirection("U", 3));
        inputData.add(new AoC1ADirection("L", 5));
        inputData.add(new AoC1ADirection("D", 1));
        inputData.add(new AoC1ADirection("L", 1));
        inputData.add(new AoC1ADirection("D", 2));
        inputData.add(new AoC1ADirection("R", 4));
        inputData.add(new AoC1ADirection("U", 2));
        inputData.add(new AoC1ADirection("R", 5));
        inputData.add(new AoC1ADirection("U", 3));
        inputData.add(new AoC1ADirection("R", 3));
        inputData.add(new AoC1ADirection("D", 3));
        inputData.add(new AoC1ADirection("L", 4));
        inputData.add(new AoC1ADirection("D", 3));
        inputData.add(new AoC1ADirection("R", 4));
        inputData.add(new AoC1ADirection("D", 5));
        inputData.add(new AoC1ADirection("R", 4));
        inputData.add(new AoC1ADirection("U", 4));
        inputData.add(new AoC1ADirection("R", 3));
        inputData.add(new AoC1ADirection("D", 4));
        inputData.add(new AoC1ADirection("R", 4));
        inputData.add(new AoC1ADirection("D", 1));
        inputData.add(new AoC1ADirection("R", 3));
        inputData.add(new AoC1ADirection("U", 1));
        inputData.add(new AoC1ADirection("L", 1));
        inputData.add(new AoC1ADirection("U", 4));
        inputData.add(new AoC1ADirection("R", 1));
        inputData.add(new AoC1ADirection("U", 4));
        inputData.add(new AoC1ADirection("R", 1));
        inputData.add(new AoC1ADirection("U", 1));
        inputData.add(new AoC1ADirection("L", 3));
        inputData.add(new AoC1ADirection("U", 2));
        inputData.add(new AoC1ADirection("L", 2));
        inputData.add(new AoC1ADirection("U", 2));
        inputData.add(new AoC1ADirection("L", 1));
        inputData.add(new AoC1ADirection("U", 5));
        inputData.add(new AoC1ADirection("R", 3));
        inputData.add(new AoC1ADirection("D", 4));
        inputData.add(new AoC1ADirection("R", 5));
        inputData.add(new AoC1ADirection("D", 2));
        inputData.add(new AoC1ADirection("L", 5));
        inputData.add(new AoC1ADirection("D", 5));
        inputData.add(new AoC1ADirection("L", 1));
        inputData.add(new AoC1ADirection("U", 2));
        inputData.add(new AoC1ADirection("L", 1));
        inputData.add(new AoC1ADirection("D", 3));
        inputData.add(new AoC1ADirection("L", 3));
        inputData.add(new AoC1ADirection("U", 1));
        inputData.add(new AoC1ADirection("R", 3));
        inputData.add(new AoC1ADirection("U", 4));
        inputData.add(new AoC1ADirection("R", 4));
        inputData.add(new AoC1ADirection("U", 4));
        inputData.add(new AoC1ADirection("L", 1));
        inputData.add(new AoC1ADirection("U", 1));
        inputData.add(new AoC1ADirection("L", 2));
        inputData.add(new AoC1ADirection("D", 2));
        inputData.add(new AoC1ADirection("R", 4));
        inputData.add(new AoC1ADirection("D", 1));
        inputData.add(new AoC1ADirection("R", 3));
        inputData.add(new AoC1ADirection("D", 4));
        inputData.add(new AoC1ADirection("R", 2));
        inputData.add(new AoC1ADirection("D", 3));
        inputData.add(new AoC1ADirection("R", 1));
        inputData.add(new AoC1ADirection("U", 5));
        inputData.add(new AoC1ADirection("R", 4));
        inputData.add(new AoC1ADirection("D", 5));
        inputData.add(new AoC1ADirection("L", 2));
        inputData.add(new AoC1ADirection("U", 5));
        inputData.add(new AoC1ADirection("R", 1));
        inputData.add(new AoC1ADirection("D", 5));
        inputData.add(new AoC1ADirection("L", 1));
        inputData.add(new AoC1ADirection("U", 3));
        inputData.add(new AoC1ADirection("L", 3));
        inputData.add(new AoC1ADirection("D", 2));
        inputData.add(new AoC1ADirection("R", 2));
        inputData.add(new AoC1ADirection("U", 5));
        inputData.add(new AoC1ADirection("R", 2));
        inputData.add(new AoC1ADirection("U", 2));
        inputData.add(new AoC1ADirection("R", 5));
        inputData.add(new AoC1ADirection("D", 5));
        inputData.add(new AoC1ADirection("R", 2));
        inputData.add(new AoC1ADirection("D", 3));
        inputData.add(new AoC1ADirection("R", 5));
        inputData.add(new AoC1ADirection("D", 5));
        inputData.add(new AoC1ADirection("R", 2));
        inputData.add(new AoC1ADirection("D", 4));
        inputData.add(new AoC1ADirection("L", 2));
        inputData.add(new AoC1ADirection("D", 1));
        inputData.add(new AoC1ADirection("L", 3));
        inputData.add(new AoC1ADirection("D", 5));
        inputData.add(new AoC1ADirection("L", 3));
        inputData.add(new AoC1ADirection("U", 2));
        inputData.add(new AoC1ADirection("R", 5));
        inputData.add(new AoC1ADirection("U", 1));
        inputData.add(new AoC1ADirection("R", 3));
        inputData.add(new AoC1ADirection("U", 2));
        inputData.add(new AoC1ADirection("R", 2));
        inputData.add(new AoC1ADirection("D", 1));


        lastCoordinate = new AoC1ACoordinate(0, 0);
        coordinates.add(lastCoordinate);
        stringCoordinates.add(lastCoordinate.x() + "," + lastCoordinate.y());
        for (AoC1ADirection direction : inputData) {

            switch (direction.orientation()) {
                case "R": {
                    for (int i = 0; i < direction.steps(); i++) {
                        nextCoordinate = new AoC1ACoordinate(lastCoordinate.x() + 1, lastCoordinate.y());
                        System.out.print(nextCoordinate.x());
                        System.out.print(",");
                        System.out.print(nextCoordinate.y());
                        System.out.println();
                        coordinates.add(nextCoordinate);

                        if (stringCoordinates.contains(nextCoordinate.x() + "," + nextCoordinate.y())) {
                            System.out.print("ABOVE IS DUPLICATE!");
                            System.out.println();
                        }
                        stringCoordinates.add(nextCoordinate.x() + "," + nextCoordinate.y());
                        lastCoordinate = nextCoordinate;
                    }
                    break;
                }
                case "L": {
                    for (int i = 0; i < direction.steps(); i++) {
                        nextCoordinate = new AoC1ACoordinate(lastCoordinate.x() - 1, lastCoordinate.y());
                        System.out.print(nextCoordinate.x());
                        System.out.print(",");
                        System.out.print(nextCoordinate.y());
                        System.out.println();
                        coordinates.add(nextCoordinate);

                        if (stringCoordinates.contains(nextCoordinate.x() + "," + nextCoordinate.y())) {
                            System.out.print("ABOVE IS DUPLICATE!");
                            System.out.println();
                        }
                        stringCoordinates.add(nextCoordinate.x() + "," + nextCoordinate.y());
                        lastCoordinate = nextCoordinate;
                    }
                    break;
                }
                case "U": {
                    for (int i = 0; i < direction.steps(); i++) {
                        nextCoordinate = new AoC1ACoordinate(lastCoordinate.x(), lastCoordinate.y() + 1);
                        System.out.print(nextCoordinate.x());
                        System.out.print(",");
                        System.out.print(nextCoordinate.y());
                        System.out.println();
                        coordinates.add(nextCoordinate);

                        if (stringCoordinates.contains(nextCoordinate.x() + "," + nextCoordinate.y())) {
                            System.out.print("ABOVE IS DUPLICATE!");
                            System.out.println();
                        }
                        stringCoordinates.add(nextCoordinate.x() + "," + nextCoordinate.y());
                        lastCoordinate = nextCoordinate;
                    }
                    break;
                }
                case "D": {
                    for (int i = 0; i < direction.steps(); i++) {
                        nextCoordinate = new AoC1ACoordinate(lastCoordinate.x(), lastCoordinate.y() - 1);
                        System.out.print(nextCoordinate.x());
                        System.out.print(",");
                        System.out.print(nextCoordinate.y());
                        System.out.println();
                        coordinates.add(nextCoordinate);

                        if (stringCoordinates.contains(nextCoordinate.x() + "," + nextCoordinate.y())) {
                            System.out.print("ABOVE IS DUPLICATE!");
                            System.out.println();
                        }
                        stringCoordinates.add(nextCoordinate.x() + "," + nextCoordinate.y());
                        lastCoordinate = nextCoordinate;
                    }
                    break;
                }
            }

        }

    }

}
