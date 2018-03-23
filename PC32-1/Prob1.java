import java.util.*;
import java.text.*;

public class Prob1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(", ");
        int[] nums = new int[input.length];
        for(int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
        int firstX = nums[0] - nums[3];
        int secX = nums[1] + nums[3];
        double middleX = (((double) nums[0] + nums[1]) / 2);
        int middleY = nums[2] + nums[4];
        System.out.println("(" + firstX + ",0), (" + secX + ",0), (" + format("###########0.#", middleX) + "," + middleY + ")");
    }
    public static String format(String key, double num) {
        DecimalFormat formatter = new DecimalFormat(key);
        return formatter.format(num);
    }
}
