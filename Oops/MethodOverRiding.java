class Bank{
    public void RateOfInterest(){
        System.out.println("Generally rate of interest is 5%");
    }
}

class SBI extends Bank {
    public void RateOfInterest(){
        System.out.println("Rate Of Interest for SBI is 6%");
    }
}

class PNB extends Bank{
    public void RateOfInterest(){
        System.out.println("Rate of Interest for PNB is 7%");
    }
}


public class MethodOverRiding {
    public static void main(String[] args) {
        Bank obj = new Bank();
        SBI obj1 = new SBI();
        PNB obj2 = new PNB();
        obj.RateOfInterest();
        obj1.RateOfInterest();
        obj2.RateOfInterest();

    }
}
