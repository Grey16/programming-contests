// 29 min, 45 sec

import java.util.*;

public class Prob7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        int[] nums = new int[input.length];
        for(int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
            if(i != input.length - 1) {
                if(nums[i] > 6) {
                    nums[i] = 6;
                }
            }
        }
        boolean printed = false;
        int target = nums[input.length - 1];
        int numCoins = 0;
        int total = 0;
        for(int i = 0; i <= nums[0]; i++) {
            total += i * 1;
            numCoins += i;
            if(total <= target && numCoins <= 6) {
                for(int j = 0; j <= nums[1]; j++) {
                    total += j * 2;
                    numCoins += j;
                    if(total <= target && numCoins <= 6) {
                        for(int k = 0; k <= nums[2]; k++) {
                            total += k * 6;
                            numCoins += k;
                            if(total <= target && numCoins <= 6) {
                                for(int l = 0; l <= nums[3]; l++) {
                                    total += l * 10;
                                    numCoins += l;
                                    if(total <= target && numCoins <= 6) {
                                        for(int m = 0; m <= nums[4]; m++) {
                                            total += m * 30;
                                            numCoins += m;
                                            if(total <= target && numCoins <= 6) {
                                                for(int n = 0; n <= nums[5]; n++) {
                                                    total += n * 50;
                                                    numCoins += n;
                                                    if(total <= target && numCoins <= 6) {
                                                        for(int o = 0; o <= nums[6]; o++) {
                                                            total += o * 125;
                                                            numCoins += o;
                                                            if(total == target && numCoins <= 6) {
                                                                printed = true;
                                                                String print = "Can give ";
                                                                int[] coinArr = {i, j, k, l, m, n, o};
                                                                String[] nameArr = {"ding", "dingsding", "swing", "wing", "bigwing", "liang", "bigliang"};
                                                                for(int p = 0; p < coinArr.length; p++) {
                                                                    if(coinArr[p] > 0) {
                                                                        print += String.valueOf(coinArr[p]) + " " + nameArr[p] + " ";
                                                                    }
                                                                }
                                                                System.out.println(print);
                                                            }
                                                            total -= o * 125;
                                                            numCoins -= o;
                                                        }
                                                    }
                                                    total -= n * 50;
                                                    numCoins -= n;
                                                }
                                            }
                                            total -= m * 30;
                                            numCoins -= m;
                                        }
                                    }
                                    total -= l * 10;
                                    numCoins -= l;
                                }
                            }
                            total -= k * 6;
                            numCoins -= k;
                        }
                    }
                    total -= j * 2;
                    numCoins -= j;
                }
            }
            total -= i * 1;
            numCoins -= i;
        }
        if(!printed) {
            System.out.println("No ways");
        }

    }
}
