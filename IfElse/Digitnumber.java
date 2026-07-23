import java.util.Scanner;
public class Digitnumber {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num>999&& num<10000)
            System.out.println("The number is 4 digit number");
        
        else
            System.out.println("The number is not 4 digit number");
        
    }
}
