public class RemoveDuplicateEle {
    public static int RemoveDuplicate(int arr[]){
        int n = arr.length;
        if(n<=2){
            return n;
        }
        int count = 2;
        for(int i = 2;i<n;i++){
            if(arr[i]!=arr[count - 2]){
                arr[count] = arr[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,4,4,5,5,5,6};
        int result = RemoveDuplicate(arr);
        System.out.println(result);
        for(int i = 0 ;i<result;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
