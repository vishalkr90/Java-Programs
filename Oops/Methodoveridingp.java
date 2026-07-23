class Animal {
    void sound(){
        System.out.println("Animal is sound");
    }
}
class Dog extends Animal{
    void sound(){
        super.sound();
        System.out.println("dog is a sound");
    }
}

public class Methodoveridingp {
  public static void main(String[] args) {
    Animal obj = new Dog();
    obj.sound();
  }  
}
