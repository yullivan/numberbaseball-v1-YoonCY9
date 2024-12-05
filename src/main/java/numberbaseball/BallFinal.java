package numberbaseball;

import java.util.ArrayList;
import java.util.Objects;

public class BallFinal {

    private int number1;
    private int number2;
    private int number3;


    public BallFinal(int number1, int number2, int number3) {

        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;

    }


    public ArrayList<Integer> BallList() {
        ArrayList<Integer> BallList = new ArrayList<>();
        BallList.add(number1);
        BallList.add(number2);
        BallList.add(number3);

        return BallList;

    }

    public String STRIKE(int userNum1, int userNum2, int userNum3) {
        int strike = 0;
        int ball = 0;

        ArrayList<Integer> userNumList = new ArrayList<>();
        userNumList.add(userNum1);
        userNumList.add(userNum2);
        userNumList.add(userNum3);

        for (int i = 0; i < BallList().size(); i++) {
            if (Objects.equals(userNumList.get(i), BallList().get(i))) {
                strike++;
            } else if (BallList().contains(userNumList.get(i))) {
                ball++;
            }

        }

        if (strike >= 1 || ball >= 1) {
            return "스트라이크 : " + strike + " 볼 : " + ball;
        }
        else return "out";


    }
}