class A{
    void run(){
        System.out.println("Class A");
    }
}

class B extends A{
    void run(){
        System.out.println("Class B");
    }
}






public class SuperKeyWord {
    public static void main(String[] args) {
        B obj = new B();
        obj.run();
    }
}
