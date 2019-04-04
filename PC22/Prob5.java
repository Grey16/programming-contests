//2m 33s
import java.util.*;

public class Prob5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Position: ");
        int n = in.nextInt();
        int value = (n * (n + 1)) / 2;
        System.out.println("The value is: " + String.valueOf(value));
    }
}
