
public class Oops1 {
    int roll;
    String name;
    void print(){
        System.out.println(name);
        System.out.println(roll);
    }

    public static void main(String[] args) {
        Oops1 std1 = new Oops1();
        std1.name = "vishal";
        std1.roll = 34;
        std1.print();

        Oops1 std2 = new Oops1();
        std2.name = "sauravl";
        std2.roll = 3;
        std2.print();
    }
}
