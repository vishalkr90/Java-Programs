public class FirstOcuurence {
    public static void main(String[] args) {
        int arr[] = {1,1,3,4,4,4,5,5,5,6,7,7};
        int n = arr.length;
        int target = 5;
        int low = 0;
        int high = n-1;
        int mid,index = -1;
        while(low<=high){
            mid = (low + high)/2;
            if(arr[mid]==target){
                index = mid;
                high = mid - 1;
            }
            else if(arr[mid]<target){
                low = mid + 1;
            }
            else if(arr[mid]>target){
                high = mid - 1;
            }
        }
        System.out.println(index);
    }
}
