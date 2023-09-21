package Week3;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int input_Num = keyboard.nextInt();

        for(int i=1; i<=100; i++){
            if(input_Num*i <= 100)
                System.out.printf("%d, ", input_Num*i);
            else
                break;
        }
    }
}
