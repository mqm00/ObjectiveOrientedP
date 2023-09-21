package Week10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] inputArr = new int[100000];
        int[] targetArr = new int[100];
        int[] resultArr = new int[100];
        Scanner inputStream = null;
        try{
            inputStream = new Scanner(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("input.txt was not found");
        }
        for(int i=0; i<100; i++){
            targetArr[i] = inputStream.nextInt();
        }

        for(int i=0; i<100000; i++) {
            inputArr[i] = inputStream.nextInt();
        }

        for(int i=0; i<100; i++) {
            resultArr[i] = BinarySearch.Search(inputArr, 0, 99999, targetArr[i]);
        }
        
        for(int i=0; i<100; i++){
            System.out.println("target: "+ targetArr[i] + "  " + "index: " + resultArr[i]);
        }
    }
}
