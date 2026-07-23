public class ProductOfArray {
    public static void main(String[] args) {
        int[] arr = {44,33,34,53,24,76};
        int product = 1;
        
        for(int i = 0;i<arr.length;i++){
            product = product * arr[i];
        }
        System.out.println("The sum of all elements are : "+product);
    }
}
