public class MaxElement {
    public static void main(String[] args) {
        int arr[][] = {{3,5,2},{2,3,4},{6,98,3}};
        int max = arr[0][0];
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max Element is : "+max);
    }
}
