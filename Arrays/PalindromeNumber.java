import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        int x =sc.nextInt();
        if(x < 0){
            System.out.println("The number is not palindrome");
            return;
        }
        int original = x;
        int reverse = 0;
        while(x != 0){
            int digit = x%10;
            reverse = (reverse*10)+digit;
            x = x/10;
        }
        if(reverse == original){
            System.out.println("The number is palindrome");
        }
        else 
            System.out.println("The number is not palindrome");
    }
}
