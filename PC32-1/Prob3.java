import java.util.*;
import java.text.*;

public class Prob3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            int input = Integer.parseInt(in.nextLine());
            String str = in.nextLine();
            if(str.equals("M")) {
                double ans = (double) input * 8 * 336;
                System.out.println(input + " miles/hour is " + format("##########0.00", ans) + " furlongs/fortnight");
            } else {
                double ans = (double) input / 8 / 336;
                System.out.println(input + " furlongs/fortnight is " + format("####0.00", ans) + " miles/hour");
            }

            if(in.nextLine().equals("N")) {
                break;
            }
        }
    }

    public static String format(String key, double num) {
        DecimalFormat formatter = new DecimalFormat(key);
        return formatter.format(num);
    }
}
