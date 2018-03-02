// 5 min, 0 sec

import java.util.*;

public class Prob1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            int input = in.nextInt();
            if(input == 0) {
                break;
            }
            System.out.println(input * input * 2);
        }
    }
}
