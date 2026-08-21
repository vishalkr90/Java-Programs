public class RowMaxSum {
    public static void main(String[] args) {
        int arr[][] = {{3,5,2,6,5},{2,3,4,4,3},{6,5,3,3,6},{7,39,1,2,5}};
        int max = Integer.MIN_VALUE,index = -1;
        for(int i = 0;i<arr.length;i++){
            int sum = 0;
            for(int j = 0;j<arr[0].length;j++){
                sum = sum + arr[i][j];
            }
            if(sum>max){
                max = sum;
                index = i+1;
            }
        }
        System.out.println("The max sum with row is : " + index + " and the sum is : "+ max);
    }
}
