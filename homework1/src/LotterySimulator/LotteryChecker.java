package LotterySimulator;

public class LotteryChecker {
    //구매한 로또 번호와 1등 번호 매치
    private int Checker;

    public LotteryChecker() {
        this.Checker = 0;
    }

    public int CheckNum(int[] winningNum, int[] myNum) {
        //보너스 숫자를 제외한 6자리 비교
        //1등: 6점, 3등: 5점, 4등: 4점, 5등: 3점
        //2등: 15점
        for (int i = 0; i <= 5; i++) {
            for (int k = 0; k <= 5; k++) {
                if (winningNum[i] == myNum[k]) {
                    this.Checker++;
                }
            }
        }
        for (int k = 0; k <= 5; k++) { // 보너스 숫자랑 비교
            if (winningNum[6] == myNum[k])
                this.Checker += 10;
        }
        return Checker;
    }
}
