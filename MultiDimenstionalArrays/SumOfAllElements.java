public class SumOfAllElements {
    public static void main(String[] args) {
        int sum = 0;
        int arr[][] = {{3,5,2},{2,3,4},{6,5,3}};
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                sum = sum + arr[i][j];
            }
        }
        System.out.println("Sum of all elements are : "+sum);
    }
}
