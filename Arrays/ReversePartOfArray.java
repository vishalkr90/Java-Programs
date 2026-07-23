public class ReversePartOfArray {
    public static void main(String[] args) {
        int [] arr = {54,55,33,45,22,13,66,88,87,54,56};
        int n = 8;
        int i = 3;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
