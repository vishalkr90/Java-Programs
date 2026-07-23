import java.util.Scanner;

public class AlphaNumericTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row : ");
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){// Lines
            for(int j = 1;j<=i;j++){ // How much star print in line
             if(i%2==0){
                System.out.print((char)(j+64)+" ");
             }  
            else{
                System.out.print(j+" ");
            }
            }
            System.out.println();
        }
    }
}
