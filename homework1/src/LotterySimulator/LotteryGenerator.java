package LotterySimulator;

import java.util.Random;

public class LotteryGenerator {

    private int[] lottery_number = new int[10];

    //1. 숫자 뽑기
    public LotteryGenerator() {
        Random randomNum = new Random();
        for (int i = 0; i < 10; i++) {       //숫자가 1부터 10까지 들어가있는 배열을 만든다.
            this.lottery_number[i] = i + 1;
        }
        for (int i = 0; i < 10; i++) {        // 배열을 무작위로 충분히 섞어준다.
            int rndNum = randomNum.nextInt(9);
            int temp = this.lottery_number[i];
            this.lottery_number[i] = this.lottery_number[rndNum];
            this.lottery_number[rndNum] = temp;
        }
    }

    public int[] getWinningNum() { // 1등 번호 뽑기
        int[] winningNum = new int[7];
        for (int i = 0; i < 7; i++) {
            winningNum[i] = this.lottery_number[i];
        }
        return winningNum;
    }

    public int[] getMyNum() { //내 번호 뽑기
        int[] myNum = new int[6];
        for (int i = 0; i < 6; i++) {
            myNum[i] = this.lottery_number[i];
        }
        return myNum;
    }
}
