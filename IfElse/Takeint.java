import java.util.Scanner;

class Takeint{
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 5==0 && num % 3==0){
            System.out.println("Banu");
        }
        else if(num % 3 == 0){
            System.out.println("Rana");
        }
        else if(num % 5 ==0){
            System.out.println("Riya");
        }
        else{
            System.out.println("Isha");
        }
    }
}