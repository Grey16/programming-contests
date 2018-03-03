// 7 minutes, 45 sec

import java.util.*;

public class Prob2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            int x = in.nextInt();
            int n = in.nextInt();
            if(x == 0 && n == 0) {
                break;
            }
            System.out.println("The value is " + function(x, n));
        }
    }
    public static int function(int x, int n) {
        int lastTerm = x;
        int current = 0;
        for(int i = 2; i <= n; i++) {
            if(i % 2 == 0) {
                current = i - lastTerm;
            } else {
                current = i + lastTerm;
            }
            lastTerm = current;
        }
        return current;
    }
}
