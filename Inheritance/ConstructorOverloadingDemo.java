class Calculator{
    Calculator(){
        System.out.println("Non parameterized");
    }
    Calculator(int x ){
        System.out.println("Parameterized "+x);
    }
}
public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator(5);
    }
}
