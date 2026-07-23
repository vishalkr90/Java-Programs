public class ThirdMaxElement {
    public static void main(String[] args) {
        int arr[] = {5,5,5,9,6};
        int max = arr[0];
        int smax = arr[0];
        int tmax = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The maximum element of array is : "+max);
        for(int i = 1;i<arr.length;i++){
            if(smax < arr[i] && arr[i] < max ){
                smax = arr[i];
            }
        }
        System.out.println("The Second maximum element of array is : "+smax);
        for(int i = 1;i<arr.length;i++){
            if(tmax < arr[i] && arr[i] < smax ){
                tmax = arr[i];
            }
        }
        System.out.println("The Third maximum element of array is : "+tmax);
    }
}
