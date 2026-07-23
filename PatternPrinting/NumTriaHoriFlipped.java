import java.util.Scanner;

public class NumTriaHoriFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row : ");
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){// Lines
            for(int j = 1;j<=n+1-i;j++){ // How much star print in line
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
