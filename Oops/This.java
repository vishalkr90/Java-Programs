class Students {
    int id = 77;
    Students(int id) {
    }
    void show() {
        System.out.println(id);
    }
}
public class This {
    public static void main(String[] args) {
        Students st1 = new Students(7);
        st1.show();
    }
}
