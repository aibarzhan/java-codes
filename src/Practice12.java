package two.dimensionalArray;

import java.util.Scanner;

public class Practice12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int [][]array = new int[x][y];
        int max = Integer.MIN_VALUE;
        int outIndex = 0;
        int inIndex = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (max < array[i][j]){
                    max = array[i][j];
                    outIndex = i;
                    inIndex = j;
                }

            }

        }
        System.out.println(max);
        System.out.println(outIndex + " " + inIndex);
    }
}
