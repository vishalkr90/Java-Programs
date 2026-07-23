import java.util.Arrays;
public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        // int[] arr = {3,4,5,6,2};
        // int[] x = arr;//x is shalllow copy of arr
        // x[0] = 4848;
        // System.out.println(arr[0]);
        int a = 4;
        int [] arr = {39,44,22,43};
        int[] y = Arrays.copyOf(arr,arr.length);//Deep copy
        y[0] = 100;
        System.out.println(y[0]);
        System.out.println(arr[0]);

    }
}
