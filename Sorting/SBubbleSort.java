public class SBubbleSort{
    public static void main(String[] args) {
        int arr[] = {7,3,4,7,8,1};
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            for(int j = 0 ;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
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
        System.out.println();
        System.out.print("The array is after Sorting : ");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}