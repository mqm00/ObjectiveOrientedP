package Week6;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int inputKey = keyboard.nextInt();
        int[][] snail = new int[inputKey][inputKey];
        snail = drawSnail(inputKey);
        for(int i=0; i<inputKey; i++){
            for(int j=0; j<inputKey; j++){
                System.out.printf("%3d ", snail[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] drawSnail(int input) {
        int[][] mySnail = new int[input][input];
        //처음엔 행에서 1씩 더해가며 인자를 넣어주고 그 다음엔 열에서 1씩 더해가며 인자를 넣어준다.
        //그 후 1씩 빼면서 행에 인자를 넣어주고 그 후에 1씩 빼가며 열에 인자를 넣어준다.
        //이를 반복하면 된다.

        int Num = input;
        int key = 1;
        int countRow = -1;
        int rowNum = 0;
        int direction = 1;

        for (int i = Num; i > 0; i--) { //입력받은 숫자만큼 반복해준다.

            for (int j = 0; j < Num; j++) { //가로 행에 대한 반복
                countRow += direction; //1씩 더해가며 인자를 넣어주고, 이 반복이 끝나면 direction을 -1로 바꿔주어서 1씩 빼가며 인자를 넣어준다.
                mySnail[rowNum][countRow] = key;
                key++;
            }

            Num--; //행을 끝까지 넣으면 열은 끝난 행의 다음 것부터 넣어야하기 때문에 Num-- 를 해준다.

            for (int j = 0; j < Num; j++) {
                rowNum += direction;    //행과 마찬가지로 1이나 -1을 더해가며 인자를 넣는다.
                mySnail[rowNum][countRow] = key;
                key++;
            }

            direction = direction * (-1); //오른쪽으로 진행할 땐 +1, 왼쪽으로 진행할 땐 -1씩 해주어야하므로 한번 반복이 끝나면 바꿔준다.
        }
            int[][] temp = new int[input][input]; //private leak을 막기위해 새로운 배열을 만들어서 return 해준다.
            for(int i=0; i<input; i++){
                for(int j=0; j<input; j++){
                    temp[i][j] = mySnail[i][j];
                }
            }
        return temp;
        }
    }
