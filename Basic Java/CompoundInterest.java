import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        float p = input.nextFloat();
        System.out.print("Enter Time: ");
        float r = input.nextFloat();
        System.out.print("Enter Rate: ");
        float t = input.nextFloat();

        double ci = p*Math.pow((1 + r/100),t);
        System.out.println("The Compound Interest is :" + ci );
    }
}
