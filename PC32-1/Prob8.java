// -2 -1 -1 0 0 2 -1 1 2 2 -1 2 -2 0 -1 0 1 2 -1 3 0 2 -1 0 3 -2

import java.util.*;

public class Prob8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] inputs = in.nextLine().split(" ");
        String output = "";
        for(int i = 0; i < inputs.length; i += 2) {
            int index = (i / 2) + 1;
            int x = Integer.parseInt(inputs[i]);
            int y = Integer.parseInt(inputs[i + 1]);
            if((index - 5) % 20 == 0) {
                x -= 1;
            } else if((index - 10) % 20 == 0) {
                y -= 1;
            } else if((index - 15) % 20 == 0) {
                x += 1;
            } else if(index % 20 == 0) {
                y += 1;
            }
            output += decode(x, y);
        }
        System.out.println(output);
    }

    public static String decode(int x, int y) {
        String s = "";
        if(x == 1 && y == 0) {
            s = "A";
        } else if(x == 1 && y == 1) {
            s = "B";
        } else if(x == 0 && y == 1) {
            s = "C";
        } else if(x == -1 && y == 1) {
            s = "D";
        } else if(x == -1 && y == 0) {
            s = "E";
        } else if(x == -1 && y == -1) {
            s = "F";
        } else if(x == 0 && y == -1) {
            s = "G";
        } else if(x == 1 && y == -1) {
            s = "H";
        } else if(x == 2 && y == -1) {
            s = "I";
        } else if(x == 2 && y == 0) {
            s = "J";
        } else if(x == 2 && y == 1) {
            s = "K";
        } else if(x == 2 && y == 2) {
            s = "L";
        } else if(x == 1 && y == 2) {
            s = "M";
        } else if(x == 0 && y == 2) {
            s = "N";
        } else if(x == -1 && y == 2) {
            s = "O";
        } else if(x == -2 && y == 2) {
            s = "P";
        } else if(x == -2 && y == 1) {
            s = "Q";
        } else if(x == -2 && y == 0) {
            s = "R";
        } else if(x == -2 && y == -1) {
            s = "S";
        } else if(x == -2 && y == -2) {
            s = "T";
        } else if(x == -1 && y == -2) {
            s = "U";
        } else if(x == 0 && y == -2) {
            s = "V";
        } else if(x == 1 && y == -2) {
            s = "W";
        } else if(x == 2 && y == -2) {
            s = "X";
        } else if(x == 3 && y == -2) {
            s = "Y";
        } else if(x == 3 && y == -1) {
            s = "Z";
        }
        return s;
    }
}
