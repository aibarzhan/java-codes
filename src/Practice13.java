package two.dimensionalArray;
 // if elements of array are odd numbers, we have to change its value to 0
import java.util.Scanner;

public class Practice13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[][] array = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (array[i][j] % 2 == 1)
                    array[i][j] = 0;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}


