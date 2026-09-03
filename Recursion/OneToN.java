
import java.util.*;
public class OneToN {
    static int n;
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        print(1);
    }
    public static void print(int x){
        if(x>n) return;
        System.out.println(x);
        print(x+1);
    }
}
