// 8 min, 5 sec

import java.util.*;

public class Prob3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] input = in.nextLine().toCharArray();
        String output = "";
        for(int i = 0; i < input.length; i++) {
            if(input[i] <= 'm') {
                int value = input[i] - 96;
                value *= 2;
                value %= 26;
                output += String.valueOf((char)(value + 96));
            } else {
                int value = input[i] - 96;
                value *= 2;
                value++;
                value %= 26;
                output += String.valueOf((char)(value + 96));
            }
        }
        System.out.println(output);
    }
}
