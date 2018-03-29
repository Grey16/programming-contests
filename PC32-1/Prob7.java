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

        int[][] matrix = buildMatrix(allCities, cities);

        while(true) {
            System.out.println("Cities?");
            String input = in.nextLine();
            if(input.equals("DONE")) {
                break;
            }
            String[] inArr = input.split(" ");
            System.out.println(connect(inArr[0], inArr[1], allCities, matrix));
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

    public static String connect(String c1, String c2, ArrayList<String> allCities, int[][] matrix) {
        int index1 = allCities.indexOf(c1);
        int index2 = allCities.indexOf(c2);
        int numStops = -1;

        int[][] currMatrix = new int[matrix.length][matrix.length];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                currMatrix[i][j] = matrix[i][j];
            }
        }
        for(int i = 0; i < matrix.length - 1; i++) {
            if(currMatrix[index1][index2] > 0) {
                numStops = i;
                break;
            }
            currMatrix = multiplyMatrices(matrix, currMatrix);
        }

        if(numStops == -1) {
            return "No connection";
        } else if(numStops == 0) {
            return "Direct";
        } else {
            return numStops + "-stop";
        }
    }

    public static int[][] multiplyMatrices(int[][] mat1, int[][] mat2) {
        int[][] output = new int[mat1.length][mat1.length];
        for(int row = 0; row < mat1.length; row++) {
            for(int col = 0; col < mat1.length; col++) {
                int total = 0;
                for(int i = 0; i < mat1.length; i++) {
                    total += mat1[row][i] * mat2[i][col];
                }
                output[row][col] = total;
            }
        }
        return output;
    }
}

/*
A B C
B C
C A
*/
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
