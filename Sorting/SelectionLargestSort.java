public class SelectionLargestSort {
    public static void Selection(int arr[]){
        int n = arr.length;
        for(int i = n-1;i>=0;i--){
            int max = Integer.MIN_VALUE;
            int index = 1;
            for(int j = i;j>=0;j--){
                if(arr[j]>max){
                    max = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        System.out.print("The array is after Sorting : ");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        return;
    }
    public static void main(String[] args) {
        int arr[] = {2,0,-3,9,1};
        int n = arr.length;
        System.out.print("The array is before Sorting : ");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Selection(arr);
        
    }
}
