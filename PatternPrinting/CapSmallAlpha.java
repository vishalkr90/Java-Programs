
import java.util.Scanner;

public class CapSmallAlpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row : ");
        int row = sc.nextInt();
        System.out.print("Enter column : ");
        int col = sc.nextInt();
        for(int i=1;i<=row;i++){// Lines
            for(int j = 1;j<=col;j++){ // How much star print in line
                if(i%2==0){
                    System.out.print((char)(i+64) + " ");
                }
                else{
                    System.out.print((char)(i+96) + " ");
                }
            }
            System.out.println();
        }
    }
}
