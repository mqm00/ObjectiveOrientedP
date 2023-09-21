package LotterySimulator;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //1. 입력받은 숫자만큼 로또 구매
        Scanner keyboard = new Scanner(System.in);
        LotteryGenerator lottoMachine = new LotteryGenerator();
        int[] winningNum = new int[7];      //로또 당첨번호 생성
        winningNum = lottoMachine.getWinningNum();

        //입력
        while (true) {
            System.out.printf("<<");
            int input = keyboard.nextInt();
            if (input == 0) {
                System.out.println(">> End of program");
                System.exit(0);
            }

            //당첨번호 출력
            System.out.printf(">> Round Winning number : ");
            for (int i = 0; i < 7; i++) {
                if (i < 6)
                    System.out.printf("%d ", winningNum[i]);
                else
                    System.out.printf("+ %d\n", winningNum[i]);
            }

            //결과 출력
            for (int i = 0; i < input; i++) {
                int[] myNum = new int[6];
                LotteryGenerator myLotteryMachine = new LotteryGenerator();
                LotteryChecker Checker = new LotteryChecker();
                myNum = myLotteryMachine.getMyNum();
                System.out.printf(">> Lottery number : ");
                for (int k = 0; k < 6; k++)
                    System.out.printf("%d ", myNum[k]);
                int checkingNum = Checker.CheckNum(winningNum, myNum);
                if (checkingNum == 15)
                    System.out.printf("Winner (2nd place)\n");
                else if (checkingNum == 6)
                    System.out.printf("Winner (1th place)\n");
                else if (checkingNum == 5)
                    System.out.printf("Winner (3rd place)\n");
                else if (checkingNum == 4)
                    System.out.printf("Winner (4th place)\n");
                else if(checkingNum == 3)
                    System.out.printf("Winner (5th place)\n");
                else
                    System.out.printf("Lose\n");
            }
        }
    }
}
