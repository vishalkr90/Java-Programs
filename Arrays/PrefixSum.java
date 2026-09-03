public class PrefixSum {
    public static void main(String[] args) {
        int arr[] = {4,5,6,6,7};
        int sum = 0,j=0;
        for(int i = 1;i<arr.length;i++){
            arr[i] = arr[i] + arr[j];
            j++;
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
