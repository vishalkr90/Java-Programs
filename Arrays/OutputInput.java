import java.util.Scanner;

public class OutputInput {
    public static void main(String[] args) {
        // int[] arr = {4,33,5,333,132,7};
        // int i=0;
        // System.out.println("The size of array is "+arr.length);
        // while(i<arr.length){
        //     System.out.println(arr[i]);
        //     i++;
        // }
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        //Input
        for(int i=0;i<7;i++){
            arr[i] = sc.nextInt();
        }
        //Print
        for(int i = 0;i<7;i++){
            System.out.print(2*arr[i]+" ");
        }








    }
}
