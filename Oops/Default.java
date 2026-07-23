// package Oops;
// import Oops.StudentClass;

// public class Default {

//     public static void change(StudentClass s){
//         s.name = "Vishal";
//     }
//     public static void main(String[] args) {
//         StudentClass s1 = new StudentClass();
//         System.out.println(s1.name);
//     }
// }


public class Default {

    public static void change(StudentClass.Student s){
        s.name = "Vishal";
    }

    public static void main(String[] args) {
        StudentClass.Student s1 = new StudentClass.Student();
        change(s1);
        System.out.println(s1.name);
    }
}