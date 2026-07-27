import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        for (int i = 2; i * i <= n; i++) {
            int count = 0;

            while (n % i == 0) {
                count++;
                n /= i;
            }

            if (count > 0) {
                System.out.print(i + "^" + count + " ");
            }
        }

        if (n > 1) {
            System.out.print(n + "^1");
        }
        
    }
}
    