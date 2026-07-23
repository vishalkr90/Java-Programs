public class Occurence {
    public static void main(String[] args) {
        int arr[] = {5,6,7,8,4,5,5,7};
        int val = 5;
        int count = 0;
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(val==arr[i]){
                count = count + 1;
            }
        }
        System.out.println(count);
        val = n - count;
        System.out.println(val);

    }
}
