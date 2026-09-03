public class ColumnWiseSnake {
    public static void main(String[] args) {
        int arr[][] = {{3,5,2,6,5},{2,3,4,4,3},{6,5,3,3,6},{7,3,1,2,5}};
        for(int i = 0;i<arr[0].length;i++){
            if(i%2==0){
                for(int j = 0;j<arr.length;j++){
                System.out.print(arr[j][i]+" ");
            }
            }
            else{
                for(int j = arr.length-1;j>=0;j--){
                    System.out.print(arr[j][i]+" ");
                }
            }
            System.out.println();
        }
    }
}
