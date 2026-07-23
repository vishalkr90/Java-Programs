class Student{
    private String name;
    private int roll;
    private int age;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getRoll(){
        return roll;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setRoll(int roll){
        this.roll = roll;
    }

}


public class Encapsulation {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setName("Rahul");
        obj.setAge(8);
        obj.setRoll(44);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getRoll());
    }
}
