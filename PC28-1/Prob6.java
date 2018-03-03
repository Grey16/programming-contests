// 7 min, 36 sec

import java.util.*;
import java.text.*;

public class Prob6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int currX = 0;
        int currY = 0;
        double dist = 0;
        for(int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            double temp = Math.abs(currX - x) * Math.abs(currX - x) + Math.abs(currY - y) * Math.abs(currY - y);
            temp = Math.sqrt(temp);
            dist += temp;
            currX = x;
            currY = y;
        }
        NumberFormat formatter = new DecimalFormat("########.00");
        System.out.println(formatter.format(dist));
    }
}
