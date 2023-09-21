package Week12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input max number: ");
        int n = keyboard.nextInt();
        ArrayList<Integer> alist;
        alist = Eratos.sieve(n);
        Iterator<Integer> iter = alist.iterator();

        while(iter.hasNext()){
            int temp = iter.next();
            System.out.printf("%d ",temp);
        }
    }
}
