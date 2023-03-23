package two.dimensionalArray;
import java.util.Scanner;
  // We need to find maximum and minimum element in array and have to replace their place to each other
public class Practice14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[][] array = new int[x][y];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
                if (min > array[i][j]) {
                    min = array[i][j];
                }
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (array[i][j] == max) {
                    array[i][j] = min;
                } else if (array[i][j] == min)
                    array[i][j] = max;
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
