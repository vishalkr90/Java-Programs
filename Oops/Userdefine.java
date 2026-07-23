public class Userdefine {
    //Creating a new data type
    public static class Student {
        String name;
        int rollno;
        double percent;
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Vishal";
        s1.rollno = 43;
        s1.percent = 93.2;
        System.out.println("The name is: "+ s1.name);
        System.out.println("The name  roll number is : " +s1.rollno);
        System.out.println("The percentage is: "+ s1.percent);

        Student s2 = new Student();
        s2.name = "Shivam";
        s2.rollno=33;
        s2.percent = 50;
        System.out.println("The name is: "+ s2.name);
        System.out.println("The name  roll number is : " +s2.rollno);
        System.out.println("The percentage is: "+ s2.percent);
    }
    
}
