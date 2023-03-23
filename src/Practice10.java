package two.dimensionalArray;

import java.util.Scanner;
 // We have to summarize elements, when i and j are even
public class Practice10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[][]array = new int[x][y];
        int summ = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i % 2 == 0 && j % 2 == 0)
                    summ = summ + array[i][j];
            }
        }
        System.out.println(summ);
    }
}
