public class ShortestMaxElement{
    public static void main(String[] args) {
        int arr[][] = {{3,5,2},{2,3,4},{6,98,3}};
        int min = Integer.MAX_VALUE,row = -1;
        for(int i = 0;i<arr.length;i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0;j<arr[0].length;j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
            if(max<min){
                min = max;
            }
        }
        System.out.println(min);
    }
}