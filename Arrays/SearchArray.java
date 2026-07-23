import java.util.Scanner;
public class SearchArray {
    public static void main(String[] args) {
        int count = 0;
        int[] arr = {44,55,33,66,22,87,43,23,48};
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<arr.length;i++){
            if(n==arr[i]){
                count++;
            }
        }
        if(count>0){
            System.out.println("Number found");
        }
        else
            System.out.println("Number not found");


    }
}
