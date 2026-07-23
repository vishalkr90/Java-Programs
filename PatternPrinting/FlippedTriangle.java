import java.util.Scanner;

public class FlippedTriangle {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Row : ");
//         int n = sc.nextInt();
        
//         // for(int i=n;i>=1;i--){// Lines
//         //     for(int j = 1;j<=i;j++){ // How much star print in line
//         //         System.out.print("*"+" ");
//         //     }
//         //     System.out.println();
//         // }
//         for(int i=1;i<=n;i++){// Lines
//             for(int j = n;j>=i;j--){ // How much star print in line
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }

//     }
// }
// public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Row : ");
//         int n = sc.nextInt();
//         int a = n;
//         for(int i=1;i<=n;i++){// Lines
//             for(int j = 1;j<=a;j++){ // How much star print in line
//                 System.out.print("*"+" ");
//             }
//             a--;
//             System.out.println();
//         }
//     }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){// Lines
            for(int j = 1;j<=n+1-i;j++){ // How much star print in line
                System.out.print("*"+" ");
            }
            
            System.out.println();
        }
}
}