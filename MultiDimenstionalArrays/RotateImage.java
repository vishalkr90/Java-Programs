public class RotateImage {
    public static void main(String[] args) {
        int arr[][] = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i = 0;i<arr.length;i++){
            int stcol = 0,endcol = arr.length-1;
            while(stcol<endcol){
                int temp = arr[i][stcol];
                arr[i][stcol] = arr[i][endcol];
                arr[i][endcol] = temp;
                stcol++;
                endcol--;
            }
        }
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
