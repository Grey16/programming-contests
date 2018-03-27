/*
PERIWINKLES ARE PERFECT
TULIPS ARE GRAND
*/

import java.util.*;

public class Prob6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] str1 = in.nextLine().toCharArray();
        char[] str2 = in.nextLine().toCharArray();
        ArrayList<String> letters = new ArrayList<String>();
        for(int i = 0; i < str1.length; i++) {
            if(str1[i] >= 'A' && str1[i] <= 'Z') {
                if(!letters.contains(String.valueOf(str1[i]))) {
                    letters.add(String.valueOf(str1[i]));
                }
            }
        }

        ArrayList<String> letters2 = new ArrayList<String>();
        for(int i = 0; i < str2.length; i++) {
            if(str2[i] >= 'A' && str2[i] <= 'Z') {
                if(!letters2.contains(String.valueOf(str2[i]))) {
                    letters2.add(String.valueOf(str2[i]));
                }
            }
        }

        for(int i = 0; i < letters2.size(); i++) {
            if(!letters.contains(letters2.get(i))) {
                letters.add(letters2.get(i));
            } else {
                letters.remove(letters.indexOf(letters2.get(i)));
            }
        }

        System.out.println("double is " + letters.size());
    }
}
