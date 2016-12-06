package com.company;

import java.util.ArrayList;
import java.util.List;

public class AoC2AMain {

    static String sequence1 = "DULUDRDDDRLUDURUUULRRRURDRDULRUDDUDRULUDDUDRLDULRRLRDRUDUUULUUDLRURDUDDDDRDLLLLULRDLDRDLRLULRUURDDUULUDLRURRDDRDDRDDLDRDLLUURDRUULRRURURRDLRLLLUDULULULULUDRLLRUDUURLDRLRLRDRRDRLLLDURRDULDURDDRLURRDURLRRRLDLLLDRUUURLRDLDLLLLRDURRLDLULRLDDLDLURLRRDDRUDDUULRURRUDLRDLDUURDDDDRLRURUDULUDLRRLLLLLRDRURLLDLDULUUDLUDDDRLLDRRUDLLURRUUDDRRLLRRLDDDURLDRDRLURRRRDRRRDDUDULULDURRUUURRRDULUUUDDRULDRLLRDLDURLURRLLRUUUULRDURLLDDRLLDLRLRULUUDRURUDLLURUDDRDURLRDRRRDURLDDRDRLRLLURULUUULUDDDULDLRDDDRDLLRRLDRDULLUUUDLDDLDDDLLLLLLLDUDURURDURDRUURRRDDRDUDLULDURDUDURDDDRULDURURURRLURLURLUURLULDLLRUULURDDRLRDDLRDLRRR";
    static String sequence2 = "LUURLRUDRRUDLLDLUDDURULURLUUDUUDDRLUULRDUDDUULDUUDRURDDRRDRLULLRDRDLRLLUURRUULRLDRULUDLDUUDDDRDDLRDLULDRLDUULDLRDLLLDLDLRDUULUDURRULLRLDUDRLLLULUUUULUUDUUURRRDULLUURUDRRLDURRUULDRDULDUDRDUUULUUDDRLUDRLDLDRUUURDLDUDRUDUURLLRRLRLLRRLDULDDULUDUUURULDDUDUDRURRDLULRUDDURDLDLLRRRLDRLULLLRUULDUDLUUDURRLLLRLUDURRDDLDRDDDLURDLDRRUDUDLUDULULRUUUDLUURLLRLDDLURULDURDLRRDDDDURLDDLLDDULLLRLDLDULDUUDDRLDUURDDLDLUUDULRRLRLUURURUURLRLURUURLDRUURLLRDDUUUDULUDDDRDRLDRDRRLRLDULLRRUDLURULULRDRURURLULDUDLRURLRDDRULDDLRD";
    static String sequence3 = "LUDRULUULRRDDDDRRDUURUDDRLDDLDRDURRURULRDLDLDUUDRRDUUDUDLLLRRLDUDDRLDDLRRLRDRLUDLULUDDUUDULDUUULUDLDDURLDURUDLDRUUDRLRRLDLDDULDUUDDLDDLLURDRLRUURDDRUDDUDLDRRLRUDRUULRRRLRULULURDLRRURDRLRULDDDRDUULLURUUUURUDDLRRRRRDURLULDLUULUDRRUDUDRRDDRURDURLRLUDDLDLRRULUDLDDRLDDLDDDLLLLRDLLUULDDLULDLDRDDUDLURUDLDLDDRRUUDDDLRLLLDRRDDDUURDUDURUURRDRLLDUDLDUULLDLDLLUULLRRULDLDRURLDULDRUURDURRURDLRDLLLDRRUDRUUDRURLUDDRURLDURRDLUUDLUUDULLLDDDDRRDLLLDLURULDDRDLUUURRDRRUUDDUL";
    static String sequence4 = "DUUULDUDDDURLLULDDLLUDURLLLURULULURUURDRURLRULLLLDRDDULRRDRRLLLRDDDUULLRRURRULLDDURRRLRDDLULDULLDUDLURRDLDDLURDLRLLDRURLLRLLRRRDRRRURURUUDDLLDDLDDDLRLURUUUULRDLUDDDURLLDDRLDRRLLUDUUULRLLDRRRLRUUDLDUULRLUDRULLLLDUDLLUUDDRUURLURUDRDDDLRURUDRLULLULUUDLDURDULRRDRLDURUULRDRRRDRDRRLRLRDDUULLRDLDURDDDULURRLULDDURDURDDUDURDLLUUULUDULRDDLDRDRUDLLUURDLRDURURULURULLDRLLRRULDLULULDLULRURLRRLUDLLLRLUDLURLULDULDRLLLDLDDDDRDRLRRLRDULUUDULDDLDURDLLLDDDDLLUURRDURLDLUDDLULRUUUDDRRLDLLLRDLLDRRRDDLULLURDDRRRRLDLRLLLRL";
    static String sequence5 = "LULLRRDURRLDUUDRRURLURURRRLRDRUULUULURLLURRDRULRDURDDDDUULLLLDUULDLULURDRLDLULULDRLLDLLRLRULURUDRUUDULRULLLUDRULUDRLLUDLDRRDRUUURURLRDURDRLRDDDURLURRDLRUUUDUURULULDLUULRDLRRRDRDRLLLDLRRDRLLDDULDRUDRRLULLRDLDUDDULRDDLULRURULRLLLULDLLLLRDLDRURUDUURURLDRLUULLDUDULUDDDULUDLRUDDUDLULLUULUUURULURRULRDDURDDLURLRRDRDLDULRLRDRRRULRDDDRLLDDDDRRRRDRDLULUURDURULDLRDULDUDLDURUDLUDLUDDDUDURDURDDURLLRUDUURRRUDRRRRULLLLDDDLUULLUULRRRULDLURDLULRULDRLR";
    static List<String> allowedCoordinates = new ArrayList<String>();
static boolean verbosePrint = false;

    public static void main(String[] args) {
        boolean isFirstPuzzle = false;


        setAllowedCoordinates(isFirstPuzzle);


        // The 5 on the pad represents coordinate (0,0)
        AoC2ACoordinate coordinate = new AoC2ACoordinate(0, 0);

        for (char direction : sequence1.toCharArray()) {
            coordinate.moveOneStep(direction, allowedCoordinates);
            if (verbosePrint) {
                coordinate.printStep(direction);
            }
        }
        coordinate.print();

        for (char direction : sequence2.toCharArray()) {
            coordinate.moveOneStep(direction, allowedCoordinates);
            if (verbosePrint) {
                coordinate.printStep(direction);
            }
        }
        coordinate.print();
        for (char direction : sequence3.toCharArray()) {
            coordinate.moveOneStep(direction, allowedCoordinates);
            if (verbosePrint) {
            coordinate.printStep(direction);}
        }
        coordinate.print();
        for (char direction : sequence4.toCharArray()) {
            coordinate.moveOneStep(direction, allowedCoordinates);
            if (verbosePrint) {
                coordinate.printStep(direction);
            }
        }
        coordinate.print();
        for (char direction : sequence5.toCharArray()) {
            coordinate.moveOneStep(direction, allowedCoordinates);
            if (verbosePrint) {
                coordinate.printStep(direction);
            }
        }
        coordinate.print();


    }

    private static void setAllowedCoordinates(boolean firstPuzzle) {
        if (firstPuzzle) {
            allowedCoordinates.add("-1,1");
            allowedCoordinates.add("-1,0");
            allowedCoordinates.add("-1,-1");
            allowedCoordinates.add("0,1");
            allowedCoordinates.add("0,0");
            allowedCoordinates.add("0,-1");
            allowedCoordinates.add("1,1");
            allowedCoordinates.add("1,0");
            allowedCoordinates.add("1,-1");
        }
        else{
            allowedCoordinates.add("0,0");
            allowedCoordinates.add("1,0");
            allowedCoordinates.add("2,0");
            allowedCoordinates.add("3,0");
            allowedCoordinates.add("4,0");

            allowedCoordinates.add("1,1");
            allowedCoordinates.add("2,1");
            allowedCoordinates.add("3,1");

            allowedCoordinates.add("2,2");

            allowedCoordinates.add("1,-1");
            allowedCoordinates.add("2,-1");
            allowedCoordinates.add("3,-1");

            allowedCoordinates.add("2,-2");

        }
    }
}