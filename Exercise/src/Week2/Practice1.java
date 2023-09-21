package Week2;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        keyboard.useDelimiter(",");

        String str1 = keyboard.next();
        String str2 = keyboard.next();
        String str3 = keyboard.next();

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
