// FOREVER

import java.util.*;

public class Prob4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);

        String[] bells = new String[n];
        for(int i = 1; i < input.length; i++) {
            int index = Integer.parseInt(input[i]);
            for(int h = 65; h < n + 65; h++) {
                bells[h - 65] = String.valueOf((char) h);
            }
            int k = n;
            String schedule = "";
            for(int j = 1; j <= (index / n) + 1; j++) {
                if(j == 1) {
                    for(int l = 0; l < bells.length; l++) {
                        schedule += bells[l];
                    }
                } else {
                    if(k == 1) {
                        k = n;
                    }
                    bells = swap(bells, k - 2, k - 1);
                    k--;
                    for(int l = 0; l < bells.length; l++) {
                        schedule += bells[l];
                    }
                }
                //System.out.println(Arrays.toString(bells));
            }
            System.out.println("Ring " + index + " was " + schedule.substring(index - 1, index));

        }
    }

    public static String[] swap(String[] a, int m, int n) {
        String temp = a[m];
        a[m] = a[n];
        a[n] = temp;
        return a;
    }
}
