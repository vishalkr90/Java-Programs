class MyException extends Exception {

    MyException(String msg) {
        super(msg);
    }
}
class UserDefineExceptionDemo {

    static void checkAge(int age) throws MyException {

        if(age < 18) {
            throw new MyException("Under Age");
        }

        System.out.println("Eligible");
    }

    public static void main(String[] args) {

        try {
            checkAge(15);
        }
        catch(MyException e) {
            System.out.println(e.getMessage());
        }

    }
}