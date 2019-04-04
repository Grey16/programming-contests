//3m 17s
import java.util.*;

public class Prob2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter L: ");
        double l = in.nextDouble();
        System.out.print("Enter H: ");
        double h = in.nextDouble();
        double r = l / (2 * 3.1416);
        double volume = 3.1416 * r * r * h;
        System.out.println(volume);
    }
}
