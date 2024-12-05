package numberbaseball;

import java.util.ArrayList;

public class Ball3 {

    private int number;
    private int position1;
    private int position2;

    public Ball3(int number, int position1, int position2) {
        this.number = number;
        this.position1 = position1;
        this.position2 = position2;
    }

    public ArrayList<Integer> BallList() {
        ArrayList<Integer> BallList = new ArrayList<>();
        BallList.add(number);
        BallList.add(position1);
        BallList.add(position2);

        return BallList;

    }

    public String STRIKE(int userNum, int userPosition) {
        for (int i = 0; i < BallList().size(); i++) {
            int a = BallList().get(i);
            if (a == userNum || a == userPosition) {
                return "STRIKE";
            } else if (!(a == userNum) && (!(a == userPosition))) {
                return "NOTHING";
            }
        }
        return "BALL";
    }
}