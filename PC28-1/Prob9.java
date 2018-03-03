// 1 hour, 3 minutes, 43 sec

import java.util.*;

public class Prob9 {
    public static ArrayList<Integer[]> dislikes;
    public static boolean[] peopleUsed;
    public static int[] people;
    public static int[] seat;
    public static boolean seatFound;

    public static void main(String[] args) {
        dislikes = new ArrayList<Integer[]>();
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for(int i = 0; i < n; i++) {
            String[] strArr = in.nextLine().split(" ");
            Integer[] tempInt = new Integer[strArr.length - 1];
            for(int j = 0; j < strArr.length - 1; j++) {
                tempInt[j] = Integer.parseInt(strArr[j + 1]);
            }
            dislikes.add(tempInt);
        }
        Integer[] tempInt = new Integer[1];
        tempInt[0] = 0;
        dislikes.add(tempInt);

        people = new int[n + 1];
        for(int i = 0; i < n + 1; i++) {
            people[i] = i + 1;
        }

        peopleUsed = new boolean[n + 1];
        for(int i = 0; i < n + 1; i++) {
            peopleUsed[i] = false;
        }

        seatFound = false;
        seat = new int[n + 1];

        fillSeats(0);
        if(seatFound) {
            for(int i = 0; i < seat.length; i++) {
                System.out.print(seat[i] + " ");
            }
            System.out.println("");
        } else {
            System.out.println("There is no possible seating plan.");
        }
    }

    public static void fillSeats(int currentPos) {
        if(currentPos == seat.length) {
            checkSeats();
            if(seatFound) {
                return;
            }
        } else {
            for(int i = 0; i < people.length; i++) {
                if(!peopleUsed[i]) {
                    seat[currentPos] = people[i];
                    peopleUsed[i] = true;
                    fillSeats(currentPos + 1);
                    if(!seatFound) {
                        peopleUsed[i] = false;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static void checkSeats() {
        for(int i = 0; i < seat.length; i++) {
            List<Integer> thisDislike = Arrays.asList(dislikes.get(seat[i] - 1));
            if(i == 0) {
                if(thisDislike.contains(seat[1]) || thisDislike.contains(seat[seat.length - 1])) {
                    return;
                }
            } else if(i == seat.length - 1) {
                if(thisDislike.contains(seat[seat.length - 2]) || thisDislike.contains(seat[0])) {
                    return;
                }
            } else {
                if(thisDislike.contains(seat[i - 1]) || thisDislike.contains(seat[i + 1])) {
                    return;
                }
            }
        }
        seatFound = true;
        return;
    }
}
