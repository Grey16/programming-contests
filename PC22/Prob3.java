//5m 30s without rounding final output to 2 decimal places However, I forgot to prompt for input
import java.util.*;
import java.text.*;

public class Prob3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount of initial investment: ");
        double start = in.nextDouble();
        int x = 1;
        while(true) {
            System.out.print("Enter % change for month " + String.valueOf(x) + " (or 999999 to quit): ");
            double currIn = in.nextDouble();
            if(currIn == 999999) {
                break;
            } else {
                start *= 1 + (currIn / 100);
            }
            x++;
        }
        String pattern = "#############.##";
        DecimalFormat df = new DecimalFormat(pattern);
        String format = df.format(start);
        System.out.println("The final value of your investment is " + format);
        //System.out.println(start);
    }
}
