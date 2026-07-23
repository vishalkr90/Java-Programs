class Students{
    int id;
    int age;
    Students(int id,int age){
        System.out.println(id);
        this.id = 666;    
        System.out.println(this.id);
        System.out.println("Parameterized constructor");
    }
    Students(){
        System.out.println("Default constructor");
}
}

public class Constructor {
    public static void main(String[] args) {
        Students st1 = new Students(33,33);
        Students st2 = new Students();
    }
}
