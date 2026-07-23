import java.util.Scanner;

public class AlphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row : ");
        int row = sc.nextInt();
        System.out.print("Enter column : ");
        int col = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j = 1; j<=col; j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
