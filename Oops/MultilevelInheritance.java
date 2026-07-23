class A{
    void methodA(){
        System.out.println("Method of A class");
    }
}
class B extends A{
    void methodB(){
        System.out.println("Method of B class");
    }
}
class C extends B{
    void methodC(){
        System.out.println("Method of C class");
    }
}
class D extends C{
    void methodd(){
        System.out.println("Method of D class");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        A sc = new D();
        sc.methodA();
        sc.methodB();
        sc.methodC();
        sc.methodd();
    }
}
