public class ProductArrayExceptSelf {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int n = arr.length;
        int ans[] = new int[n];
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int product = 1;

        for(int i = 0;i<n;i++){
            ans[i] = product;
            product = product * arr[i];
        }
        product = 1;
        for(int i = n-1;i>=0;i--){
            ans[i] = product * ans[i];
            product = 
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
}
