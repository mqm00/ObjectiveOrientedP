package Week9;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        try {
            int a = keyboard.nextInt();
            int b = keyboard.nextInt();

            if (isCoprime(a, b)) {
                System.out.println(a + " and " + b + " are coprime");
            } else {
                System.out.println(a + " and " + b + " are not coprime");
            }
        } catch (InputMismatchException e) {
            System.out.println("you must input integer;");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }


    public static boolean isCoprime(int a, int b)
            throws MyException {
        if (a <= 1 || b <= 1)
            throw new MyException(1);
        else if (a == b)
            throw new MyException(2);
        else if (a > 10000 && b > 10000)
            throw new MyException(3);

        int count = 0;
        for (int i = 2; i <= 10000; i++) {
            if (a % i == 0 && b % i == 0)
                count++;
        }

        if (count == 0)
            return true;
        else
            return false;
    }
}

