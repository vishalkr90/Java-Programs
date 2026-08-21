public class ColumnPrint {
    public static void main(String[] args) {
        int arr[][] = {{3,5,2,5},{2,3,4,7},{6,9,3,9}};
        for(int i = 0;i<arr[0].length;i++){
            for(int j = 0;j<arr.length;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
