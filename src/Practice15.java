package two.dimensionalArray;

import java.util.Scanner;

public class Practice15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int k = scanner.nextInt();
        int temp;
        int [][]array = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (array[i][j] % k == 0){
                    temp = array[i][j] / k;
                    array[i][j] = temp;
                }
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//7 3 4 9 10
//16 7 8 2 9
//9 1 4 12 3
//12 6 7 0 2