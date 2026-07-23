import java.util.Scanner;
public class Decreasing {
    public static void main(String[] args) {
        int i;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(i=n;i>=0;i--){
            System.out.println(i);
        }
    }

}
