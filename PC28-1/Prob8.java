// 24 min, 12 sec

import java.util.*;

public class Prob8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            int first = in.nextInt();
            int second = in.nextInt();
            if(first == 0 && second == 0) {
                break;
            }
            int sum1 = sumDigits(first);
            int square1;
            int sum2 = sumDigits(second);
            int square2;
            ArrayList<Integer> temp1 = new ArrayList<Integer>();
            ArrayList<Integer> temp2 = new ArrayList<Integer>();
            while(true) {
                square1 = sum1 * sum1;
                int temp = sumDigits(square1);
                if(temp1.contains(temp)) {
                    break;
                } else {
                    sum1 = temp;
                    temp1.add(temp);
                }
            }
            while(true) {
                square2 = sum2 * sum2;
                int temp = sumDigits(square2);
                if(temp2.contains(temp)) {
                    break;
                } else {
                    sum2 = temp;
                    temp2.add(temp);
                }
            }
            if(temp1.get(temp1.size() - 1) == temp2.get(temp2.size() - 1)) {
                System.out.println("These numbers are square-friendly.");
            } else {
                System.out.println("These numbers are not square-friendly.");
            }
        }

    }

    public static int sumDigits(int num) {
        String[] str = String.valueOf(num).split("");
        int sum = 0;
        for(int i = 1; i < str.length; i++) {
            sum += Integer.parseInt(str[i]);
        }
        return sum;
    }
}
