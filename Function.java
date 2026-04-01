import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        greet();
        int first = readNumber();
        int second = readNumber();
        System.out.println("The addition of first and second number is : " + first + second);
    }

public static void greet(){
    System.out.println("Welcome");
}

public static int readNumber(){
    Scanner sc1 = new Scanner(System.in);
    int number = sc1.nextInt();
    return number;
}






}

