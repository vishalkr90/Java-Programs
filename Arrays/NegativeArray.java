import java.util.Scanner;

public class NegativeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of Array : ");
        //Taking Input
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //Printing
        System.out.print("The Negative Elements of Array are : ");
        for(int i = 0;i<n;i++){
            if(arr[i]<0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
