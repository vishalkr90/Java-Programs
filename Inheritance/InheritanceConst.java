class Parent{
    Parent(){
        System.out.println("This is parent Class");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("Child class");
    }
}
public class InheritanceConst {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        Child obj2 = new Child();
        Parent obj3 = new Child();
        
    }
}
