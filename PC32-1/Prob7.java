import java.util.*;

public class Prob7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> allCities = new ArrayList<String>();
        ArrayList<ArrayList<String>> cities = new ArrayList<ArrayList<String>>();
        while(true) {
            String input = in.nextLine();
            if(input.equals("END")) {
                break;
            }
            String[] inArr = input.split(" ");
            ArrayList<String> cityList = new ArrayList<String>();
            for(String s : inArr) {
                cityList.add(s);
                if(!allCities.contains(s)) {
                    allCities.add(s);
                }
            }
            cities.add(cityList);
        }
        /*
        for(ArrayList<String> list : cities) {
            System.out.println(list);
        }
        System.out.println("All cities: " + allCities);
        */
        int[][] matrix = buildMatrix(allCities, cities);
        for(int[] row : matrix) {
            for(int n : row) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    public static int[][] buildMatrix(ArrayList<String> allCities, ArrayList<ArrayList<String>> cities) {
        int[][] matrix = new int[allCities.size()][allCities.size()];
        for(int i = 0; i < allCities.size(); i++) {
            int index = findCity(allCities.get(i), cities);
            if(index != -1) {
                ArrayList<String> cityList = cities.get(index);
                for(int j = 1; j < cityList.size(); j++) {
                    matrix[i][allCities.indexOf(cityList.get(j))] = 1;
                }
            }
        }
        return matrix;
    }

    public static int findCity(String key, ArrayList<ArrayList<String>> cities) {
        int index = -1;
        for(int i = 0; i < cities.size(); i++) {
            if(cities.get(i).get(0).equals(key)) {
                index = i;
            }
        }
        return index;
    }
}

/*
Providence Hartford Springfield Concord
Concord Providence Bangor Halifax
Hartford Providence Albany
Springfield Providence Montpelliar
Bangor Concord Ottawa
Halifax Concord Hamilton
Albany Hartford Detroit
Montpelliar Springfield
Ottawa Bangor Toronto
Hamilton Halifax
Detroit Albany
Worcester Keene
Keene Worcester
*/
