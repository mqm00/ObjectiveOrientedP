package Week2;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int percent = keyboard.nextInt();
        double GPA = ((double)percent/100*4);
        System.out.printf("(%d/100)*4 = %.0f", percent, GPA);
    }
}
