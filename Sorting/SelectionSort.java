public class SelectionSort {
    public static void select(int arr[]){
        int n = arr.length;
        // for(int i = 0;i<n-1;i++){
        //     for(int j = i+1;j<n;j++){
        //         if(arr[i]>arr[j]){
        //             int temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }
        for(int i = 0;i<n;i++){
            int min = Integer.MAX_VALUE;
            int index = 1;
            for(int j = i;j<n;j++){
                if(arr[j]<min){
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        System.out.print("The array is after Sorting ; ");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        return;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,1,0,-3,5};
        int n = arr.length;
        System.out.print("The array is before Sorting ; ");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        select(arr);
    }
}
