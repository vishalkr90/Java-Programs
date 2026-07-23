// import java.util.Scanner;
// public class PlusOne{
//     public static void main(String[] args){
//         // Scanner sc = new Scanner(System.in);
//         // System.out.print("Enter the length of Array : ");
//         // int n = sc.nextInt();
//         // int arr[] = new int[n];
//         // System.out.print("Enter the elements of Array : ");
//         // for(int i = 0;i<n;i++){
//         //     arr[i] = sc.nextInt();
//         // }
//         // System.out.print("The array is : ");
//         // for(int i = 0;i<n;i++){
//         //     System.out.print(arr[i] + " ");
//         // }
//         // for(int i = n-1;i>=0;i--){
//         //     if(arr[i]<9){
//         //         arr[i]++;
//         //         break;
//         //     }
//         //     else{
//         //         arr[i]=0;
//         //     }
//         // }
//         // System.out.print("\nAfter Plus The array is : ");
//         // for(int i = 0;i<n;i++){
//         //     System.out.print(arr[i] + " ");
//         // }
//         int arr[] = {4,5,6,7};
//         System.out.println(arr);
//     }
// }

import java.util.Scanner;

public class PlusOne {

    // LeetCode wali method
    public static int[] plusOne(int[] arr) {
        int n = arr.length;

        // for (int i = n - 1; i >= 0; i--) {
        //     if (arr[i] < 9) {
        //         arr[i]++;
        //         return arr;
        //     }
        //     arr[i] = 0;
        // }

        // Agar saare digits 9 the
        int[] ans = new int[n + 1];
        ans[0] = 1;
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {9,9,9};
        int[] result = plusOne(arr);
        System.out.print("After Plus One: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
            }
        // for (int num : result) {
        //     System.out.print(num + " ");
        // }

        
    }
}