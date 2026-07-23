import java.util.Scanner;
public class SumArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the size of Arrays : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of Array : ");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            sum = sum +arr[i];
        }
        System.out.print("The sum of all elements of Array are : "+sum);


    }

}