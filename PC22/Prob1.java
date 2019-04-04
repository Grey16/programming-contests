// 4m 54s
import java.util.*;

public class Prob1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        double area = (3.1416 * r * r) - (2 * 3.1416 * (r / 2) * (r / 2));
        System.out.println(area);
    }
}
