public class BubbleSort {
    public static int[] bubble(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {25,-4,5,25,-1,9999};
        int art[] = bubble(arr);
        for(int i = 0;i<art.length;i++){
            System.out.print(art[i]+" ");
        }
    }
}
