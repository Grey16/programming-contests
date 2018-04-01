import java.util.*;

public class Prob2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 4; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            while(a != b) {
                if(a < b) {
                    int temp = b;
                    b = a;
                    a = temp;
                }
                a -= b;
            }
            System.out.println(a);
        }
    }
}
