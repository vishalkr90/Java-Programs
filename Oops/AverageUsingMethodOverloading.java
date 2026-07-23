class Average{
    double avg(int a,int b,int c){
        return (a+b+c)/3;
    }
    int avg(int a,int b){
        return (a+b)/2;
    }
}



public class AverageUsingMethodOverloading {
    public static void main(String[] args) {
        Average s = new Average();
        double avge = s.avg(2,90,5);
        int avger = s.avg(19,5);
        System.out.println("The average of three numbers : "+avge);
        System.out.println("The average of two numbers : "+avger);
    }
}
