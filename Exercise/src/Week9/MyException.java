package Week9;

public class MyException extends Exception {
    private int number;

    public MyException(int num) {
        super("[MyException] ");
        number = num;
    }

    @Override
    public String getMessage() {
        if (number == 1)
            return super.getMessage() + "One of a and b is equal to 1; please input larger than 1";
        else if (number == 2)
            return super.getMessage() + "a and b are the same number; please try different value";
        else if (number == 3)
            return super.getMessage() + "Both a and b are larger than 10000; please input smaller value";
        else
            return "Not my area";
    }
}