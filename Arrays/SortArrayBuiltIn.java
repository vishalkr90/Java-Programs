import java.util.Arrays;
public class SortArrayBuiltIn {
    public static void main(String[] args) {
        //sort = Ascending Order
        int[] arr = {4,5,3,6,2};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    static void print(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
