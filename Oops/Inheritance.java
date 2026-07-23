class Vechile{
    double price;
    double mileage;
    String color;

    void display(){
        System.out.println("Price : "+ price);
        System.out.println("Mileage : "+ mileage);
        System.out.println("Price : "+ color);
    }
}

class Car extends Vechile{
    String ftype;
    boolean sunroof;
    String brand;

}

class Me extends Vechile{
    String name;
}

public class Inheritance {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.price = 334343;
        car1.mileage = 34;
        car1.color = "red";
        car1.display();
        car1.ftype = "re";
        car1.brand = "Tata";
        car1.sunroof = true;
        System.out.println(car1.sunroof);

        Me m1 = new Me();
        m1.name = "Vishal";
        m1.mileage=88;

    }
}
