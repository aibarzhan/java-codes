package two.dimensionalArray;

    import java.util.Scanner;
 // We have to get elements from array that are even and positive
    public class Practice7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] array = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    array[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (array[i][j] > -1 && array[i][j] % 2 == 0){
                        System.out.print(array[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
