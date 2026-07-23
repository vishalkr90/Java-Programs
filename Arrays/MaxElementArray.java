import java.util.Scanner;
public class MaxElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the Array : ");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i =1;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.print("The maximum element of the Array is : "+max);
    }
}
