package Week2;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int num1 = keyboard.nextInt();
        int num2 = keyboard.nextInt();

        System.out.printf("dividend: %d\n", num1);
        System.out.printf("divisor: %d\n", num2);
        System.out.println("quotient: " + num1/num2);
        System.out.println("remainder: " + num1%num2);
    }
}
