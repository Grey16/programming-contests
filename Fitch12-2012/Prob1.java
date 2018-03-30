import java.util.*;

public class Prob1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 4; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            if(b < a) {
                int temp = b;
                b = a;
                a = temp;
            }
            if(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) == Math.round(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)))) {
                System.out.println((int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
                continue;
            }
            if(Math.sqrt(Math.pow(b, 2) - Math.pow(a, 2)) == Math.round(Math.sqrt(Math.pow(b, 2) - Math.pow(a, 2)))) {
                if((int) Math.sqrt(Math.pow(b, 2) - Math.pow(a, 2)) != 0) {
                    System.out.println((int) Math.sqrt(Math.pow(b, 2) - Math.pow(a, 2)));
                    continue;
                }
            }
            System.out.println("NO");
        }
    }
}
