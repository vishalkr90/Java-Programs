public class RemoveDuplicateArraySorted {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,3,3,4,4,4,5,5,5};
        int n = arr.length;
        int count = 1;
        for(int i = 0;i<n-1;i++){
            if(arr[i] != arr[i+1]){
                arr[count] = arr[i+1];
                count++;
            }
        }
        System.out.print("The Array is : ");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
