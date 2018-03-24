import java.util.*;

public class Prob4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        ArrayList<Integer> terms = new ArrayList<Integer>();
        int term = 0;
        boolean found = false;
        for(int i = 1; i <= 300; i++) {
            if((i - 1) % 4 == 0) {
                if(i == 1) {
                    terms.add(a);
                } else {
                    terms.remove(0);
                    terms.add(terms.get(0));
                }
            } else if((i - 2) % 4 == 0) {
                if(i == 2) {
                    terms.add(b);
                } else {
                    terms.remove(0);
                    terms.add(terms.get(0));
                }
            } else if((i - 3) % 4 == 0) {
                if(i == 3) {
                    term = 2 * terms.get(0) + terms.get(1);
                    terms.add(term);
                } else {
                    terms.remove(0);
                    term = 2 * terms.get(1) + terms.get(2);
                    terms.add(term);
                }
            } else if (i % 4 == 0) {
                if(i == 4) {
                    term = 2 * terms.get(0) - terms.get(1);
                    terms.add(term);
                } else {
                    terms.remove(0);
                    term = 2 * terms.get(1) - terms.get(2);
                    terms.add(term);
                }
            }
            if(Math.abs(term) > 100) {
                System.out.println(term);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("None by 300.");
        }
    }
}
