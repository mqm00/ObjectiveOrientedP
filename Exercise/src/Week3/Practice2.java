package Week3;
import java.util.Scanner;
import java.util.Random;

public class Practice2 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        String myChoice = keyboard.nextLine();
        int myChoice_int = 0;
        int comChoice = random.nextInt(3);

        // rock = 0;
        // scissors = 1;
        // paper = 2;

        if(myChoice.equalsIgnoreCase("rock"))
            myChoice_int = 0;
        if(myChoice.equalsIgnoreCase("scissors"))
            myChoice_int = 1;
        if(myChoice.equalsIgnoreCase("paper"))
            myChoice_int = 2;

        switch(myChoice_int){
            case 0:
                if(comChoice == 0) {
                    System.out.println("computer's choice : rock");
                    System.out.println("you tie");
                    break;
                }

                else if(comChoice == 1){
                    System.out.println("computer's choice : scissors");
                    System.out.println("you win");
                    break;
                }

                else if(comChoice == 2){
                    System.out.println("computer's choice : paper");
                    System.out.println("you lose");
                    break;
                }

            case 1:
                if(comChoice == 0){
                    System.out.println("computer's choice : rock");
                    System.out.println("you lose");
                    break;
                }

                else if(comChoice == 1){
                    System.out.println("computer's choice : scissors");
                    System.out.println("you tie");
                    break;
                }

                else if(comChoice == 2){
                    System.out.println("computer's choice : paper");
                    System.out.println("you win");
                    break;
                }

            case 2:
                if(comChoice == 0){
                    System.out.println("computer's choice : rock");
                    System.out.println("you win");
                    break;
                }

                else if(comChoice == 1){
                    System.out.println("computer's choice : paper");
                    System.out.println("you tie");
                    break;
                }

                else if(comChoice == 2){
                    System.out.println("computer's choice : scissors");
                    System.out.println("you lose");
                    break;
                }
        }
    }
}
