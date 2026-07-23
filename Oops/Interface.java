interface Car{
    public void start();
}

class ElectricCar implements Car{
    public void start(){
        System.out.println("Electric car starts");
    }
}

class DieselCar implements Car{
    public void start(){
        System.out.println("Diesel Car Starting");
    }
}

public class Interface {
    public static void main(String[] args) {
        Car Tesla = new ElectricCar();
        Car XUV = new DieselCar();
        Tesla.start();
        XUV.start();
    }
}
