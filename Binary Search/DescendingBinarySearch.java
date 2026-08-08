public class DescendingBinarySearch {
    public static void main(String[] args) {
        int arr[] = {56,40,30,29,29,19};
        int n = arr.length;
        int low = 0,high = n-1;
        int tar = 56;
        int mid;
        while(low<=high){
            mid = (low + high)/2;
            if(arr[mid] == tar){
                System.out.println(mid);
                return;
            }
            else if(arr[mid] < tar){
                high = mid-1;
            }
            else {
                low = mid + 1;
            }
        }
    }
}
