import java.util.Scanner;
// Homework Practice 18   while, for loop;
public class Homework0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int zp = 3;
        for (int i = 0; i < n; i++) {
            sum = sum + zp;
            zp = zp + 3;

        }
        System.out.println(sum);
    }
}
