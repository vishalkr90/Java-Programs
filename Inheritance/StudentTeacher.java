class Person{
   String name ;
   int age ;

   Person(String name,int age){
     this.name=name;
     this.age=age;
   }
   void display(){
    System.out.println("person name "+ name);
    System.out.println("person age is :"+ age);
   }
}
 class Students extends Person{
    int marks ;
    Students(String name, int age,int marks){
      super(name, age);
      this.marks =marks ;
    }
    
    @Override
     void display(){
   System.out.println("students name is :"+ name);
    System.out.println("student age is :"+ age);
     System.out.println("students marks is :"+ marks);
   }
     }
 
 class Teacher extends Person{
    String subject ;
     Teacher(String name, int age ,String subject){
      super(name, age);
      this.subject=subject ;

    }
     
    @Override
     void display() {
         System.out.println("teacher name is :" + name);
         System.out.println("teacher age is :" + age);
         System.out.println("teacher subject :"+subject);
 }
}

public class StudentTeacher {
    public static void main(String[] args) {
      Person   obj =new Person("kajal",18);
      obj.display();
        Students obj2 = new Students("riya", 20,400);
        obj2.display();  
        Teacher obj3 = new Teacher("riya", 20,"python");
        obj3.display();

    }
}