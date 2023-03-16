import java.util.Scanner;

public class Homework1 {

    // Practice #19

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int sum = 0;
        int i;
        for (i = n1; i < n2; i++) {
            sum = sum + i;
        }
        float temp = (float) sum / (n2 - n1);
        System.out.println(temp);
    }
}