import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nsp = n-1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=nsp;j++){
                System.out.print("% ");
                
            }
            for(int j = 1;j<=nst;j++){
                System.out.print("* ");
                
            }
            nsp = nsp-1;
            nst = nst+2;
            System.out.println();
        }
        
    }
}




// for(int i = 1;i<=n;i++){
//             for(int j = 1;j<=n-i;j++){
//                 System.out.print("  ");
//             }
//             for(int j = 1;j<=2*i-1;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }