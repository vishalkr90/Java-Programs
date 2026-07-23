import java.util.Scanner;

class facto{
    public int factor(){
    System.out.print("Enter the number: ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int fact = 1;
    for(int i  = 1 ; i<=num ;i++){
            fact = fact*i;
        }
        System.out.println(fact);
        return fact;
    }
}
public class Factorial {
    public static void main(String[] args) {
        facto obj = new facto();
        int objc=obj.factor();
        System.out.println(objc);

    }
}
