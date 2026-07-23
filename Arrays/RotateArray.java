public class RotateArray {
    public static void main(String[] args) {
        int k = 4;
        
        int arr[] = {4,5,6,7,3,4,6,7,8,9,0,3,2};
        int n = arr.length;
        for(int i = 0;i<k;i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        for(int i = 0;i<=n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
