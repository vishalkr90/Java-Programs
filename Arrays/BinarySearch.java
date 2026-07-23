public class BinarySearch {
    static int search(int arr[],int target){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int mid;
        while(low<=high){
            mid = (low + high)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low = mid + 1;
            }
            else if(arr[mid]>target){
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] ={3,4,6,7,8};
        int result = search(arr,9);
        System.out.println(result);
        
        
        
    }
    

}
