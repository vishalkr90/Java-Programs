public class SecondMaximumElementOfArray {
    public static void main(String[] args) {
        int arr[]={10,10,5};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The maximum number is : "+max);
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>smax && arr[i]<max){
                smax = arr[i];
            }
        }
        System.out.println("The second maximum number is : "+smax);
    }
}
