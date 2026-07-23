import java.util.Scanner;
public class floatadd {
    public static void main(String[]args){
        Scanner me = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float a = me.nextFloat();
        System.out.print("Enter second number: ");
        float b = me.nextFloat();

        System.out.println("The sum of both number is : "+ (a+b));

    }
    
}
