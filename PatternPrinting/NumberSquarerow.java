import java.util.Scanner;

public class NumberSquarerow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row : ");
        int row = sc.nextInt();
        System.out.print("Enter column : ");
        int col = sc.nextInt();
        for(int i=1;i<=row;i++){// Lines
            for(int j = 1;j<=col;j++){ // How much star print in line
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
