public class Arr {
    public static void main(String[] args) {
        int arr[] = {4,5,6,6};
        int n = arr.length;
        int ans[] = new int[n];
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = 0;i<n;i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();
        for(int i = 0;i<n;i++){
            ans[i] = arr[i];
        }
        System.out.println();
        for(int i = 0;i<n;i++){
            System.out.print(ans[i] + " ");
        }
    }
}
