import java.util.Scanner;

public class addnum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter Second number: ");
        int b = input.nextInt();
        System.out.print("The sum is : ");
        System.out.println(   a+b);
    }
}
