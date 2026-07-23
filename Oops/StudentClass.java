
public class StudentClass {
    public static class Student{ //Creating a new data type
        String name;
        int rno;
        double percent;

    }
    
    public static void fun(Student x){
        System.out.println(x.name);
    }
    public static void main(String[] args) {
        
        Student s1 = new Student();//declaration
        s1.name = "Vishal";
        s1.rno = 32;
        s1.percent = 88.4;

        fun(s1);
    }
}
