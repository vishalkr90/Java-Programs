public class FloorSortedArray {
    static int findFloor(int[] arr, int x) {
        // code here
        int n = arr.length;
        int l = 0,h = n-1,index = -1;
        int mid;
        while(l<=h){
            mid = (l+h)/2;
            if(arr[mid] > x){
                h = mid - 1;
            }
            else if(arr[mid] <= x){
                index = mid;
                l = mid + 1;
            }
        }
        return index;
    }
}
