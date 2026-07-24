import java.util.Scanner;
public class Array {
    //Array traversal
        public static void main(String[] args) {
    //     int[] myArr = {98, 2, 8, 65, 45};
    //     for(int index = 0; index <= myArr.length;index ++){
    //     System.out.println(myArr[index]);
    //     }
    // }
    int arr[] = {3,5,2,3};
    int val = 3;
    int count = 0;
    for(int i = 0;i<arr.length;i++){
        if(val != arr[i]){
            arr[count] = arr[i];
            count++;
        }
    }
    System.out.println("Count = "+count);
    for(int i = 0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
        }
}
