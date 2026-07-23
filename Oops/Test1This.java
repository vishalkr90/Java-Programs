class Students {
    int id = 5;

    Students(int id) {
        this.id = id;
        System.out.println(id);
        id = 100;
        this.id = id;
        System.out.println(this.id);
        
        System.out.println(id);
        System.out.println(this.id);
    }

    void show() {
        System.out.println(id);
    }
}

public class Test1This {
    public static void main(String[] args) {
        Students s1 = new Students(20);
        
    }
}