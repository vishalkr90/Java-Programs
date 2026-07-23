class Calculator{
    void add(){
        System.out.println("Non parameterized");
    }
    void add(int x){
        System.out.println("Parameterized");
    }
}
public class MethodOverloadingDemo {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.add();
        obj.add(5);
    }
}
