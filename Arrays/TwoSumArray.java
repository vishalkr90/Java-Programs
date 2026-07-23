public class TwoSumArray {
    public static void main(String[] args) {
       int[] arr = {4,5,6,7,8,9};
       boolean ans = twosum(arr,13);
       System.out.println(ans);
    }
    public static boolean twosum(int arr[] ,int target){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
