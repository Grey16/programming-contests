import java.util.*;
import java.text.*;

public class Prob5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter AB:");
        double ab = in.nextDouble();
        System.out.print("Enter BJ:");
        double bj = in.nextDouble();
        System.out.print("Enter HR:");
        double hr = in.nextDouble();
        System.out.print("Enter RG:");
        double rg = in.nextDouble();
        System.out.print("Enter EP:");
        double ep = in.nextDouble();
        System.out.print("Enter PD:");
        double pd = in.nextDouble();
        System.out.print("Enter AC:");
        double ac = in.nextDouble();
        System.out.print("Enter AL:");
        double al = in.nextDouble();
        System.out.print("Enter BK:");
        double bk = in.nextDouble();

        double base1 = ab - bk - ep;
        double height1 = ab - bj - pd;
        double diagonal1 = Math.sqrt(Math.pow(base1, 2) + Math.pow(height1, 2));

        double base2 = ab - rg - al;
        double height2 = ab - hr - ac;
        double diagonal2 = Math.sqrt(Math.pow(base2, 2) + Math.pow(height2, 2));
        System.out.println("The sum of the two diagonals is " + format("#########0.00", diagonal1 + diagonal2));
    }

    public static String format(String key, double num) {
        DecimalFormat formatter = new DecimalFormat(key);
        return formatter.format(num);
    }
}
