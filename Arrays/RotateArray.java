public class RotateArray {
    public static void main(String[] args) {
        int k = 4;
        int arr[] = {2,4,6,8,10,12,14};
        int n = arr.length;
        int i = 0;
        int j = 6;
        int temp;
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for( i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        i = 3;
        j = 6;
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for( i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        i = 0;
        j = n-1;
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for( i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
