import java.util.Scanner;
class Business{
    float SL;
    float CL;
    public void sell(){
        System.out.println("Enter the cost price: ");
        Scanner sc = new Scanner(System.in);
        float cl = sc.nextFloat();
        System.out.println("Enter the Selling price : ");
        Scanner sc1 = new Scanner(System.in);
        float sl = sc1.nextFloat();

        if(sl>cl){
            float profit = sl - cl;
            System.out.println("The profit is "+ profit);
        }
        else if(sl == cl){
            System.out.println("No loss and No profit");
        }
        else{
            float loss = cl - sl;
            System.out.println("The loss is "+ loss);
        }
    }
}



public class ProfitLoss {
    public static void main(String[] args) {
        Business obj = new Business();
        obj.sell();
    }
}
