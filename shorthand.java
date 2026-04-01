import java.util.Scanner;
public class shorthand {
    public static void main(String[] args) {
        int a = 5;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x1 = input.nextInt();
        a +=x1;
        a = a+x1;
        
        System.out.println("a = "+ a);
    }
}
