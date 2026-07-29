public class FindDuplicateElement {
    public static int dup(int arr[]){
        int n = arr.length;
        int num = 0;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    num = arr[i];
                }
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int result = dup(arr);
        System.out.println(result);
        
//     int[] arr = {2,3,1,4,2};
//     int n = arr.length;
//     boolean[] flag = new boolean[n + 1];

//     for (int i = 0; i < n; i++) {
//     int ele = arr[i];

//     if (flag[ele]) {
//         System.out.println("Duplicate = " + ele);
//     } 
//     else {
//         flag[ele] = true;
//     }
// }
    }
}
