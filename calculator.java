import java.util.Scanner;
public class calculator {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        int add = a+b;
        int sub = a-b;
        int modul = a%b;
        int multi = a*b;
        int div = a/b;

        System.out.println("first + second: "+add );
        System.out.println("first - second: "+sub );
        System.out.println("first % second: "+modul );
        System.out.println("first * second: "+multi );
        System.out.println("first / second: "+div );
    }
    
}
