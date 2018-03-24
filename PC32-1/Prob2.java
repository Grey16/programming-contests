//82659938253364

import java.util.*;

public class Prob2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] input = in.nextLine().toCharArray();
        int[] nums = new int[input.length];
        for(int i = 0; i < input.length; i++) {
            nums[i] = input[i] - 48;
        }
        ArrayList<Integer> peaks = new ArrayList<Integer>();
        ArrayList<Integer> dips = new ArrayList<Integer>();
        for(int i = 1; i < nums.length - 1; i++) {
            if(nums[i - 1] < nums[i] && nums[i + 1] < nums[i]) {
                peaks.add(i);
            }
            if(nums[i - 1] > nums[i] && nums[i + 1] > nums[i]) {
                dips.add(i);
            }
        }
        for(Integer peak : peaks) {
            System.out.println("peak at location " + peak);
        }
        for(Integer dip: dips) {
            System.out.println("dip at location " + dip);
        }
    }
}
