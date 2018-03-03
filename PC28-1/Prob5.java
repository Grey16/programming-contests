// 13 min, 50 sec

import java.util.*;

public class Prob5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            int x = in.nextInt();
            int y = in.nextInt();
            if(x == -1 && y == -1 ) {
                break;
            }
            int currX = 0;
            int currY = 0;
            boolean b = false;
            for(int i = 1; i <= y; i++) {
                if(i % 4 == 1) {
                    currX += 1;
                    currY += 1;
                } else if(i % 4 == 2) {
                    currX += 2;
                    currY += 1;
                } else if(i % 4 == 3) {
                    currX -= 1;
                    currY += 2;
                } else if(i % 4 == 0) {
                    currX -= 1;
                    currY += 1;
                }
                if(x == currX && y == currY) {
                    System.out.println("Mad man will land here");
                    b = true;
                    break;
                }
            }
            if(!b) {
                System.out.println("Mad man will not land here");
            }
        }
    }
}
