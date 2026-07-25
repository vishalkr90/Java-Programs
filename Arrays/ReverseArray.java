public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {4,5,99,7,8,9};
        int n = arr.length;
        for(int i = 0;i<n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
  
        // int i = 0,j=n-1;
        // while(i<j){
        //     int temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
        //     i++;
        //     j--;
        // }
        System.out.print("The Reverse Array is : ");
        for( int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
         }
        // // for(int ele : arr){
        // //     System.out.print(ele + " ");
        // // }
       
        }
    }

