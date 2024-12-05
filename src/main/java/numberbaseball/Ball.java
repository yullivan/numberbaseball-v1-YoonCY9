package numberbaseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ball {

    int number;
    int position;

    public Ball(int number, int position) {
        this.number = number;
        this.position = position;
    }

    public String matchStatus(Ball ball) {
        if (ball.number == number && ball.position == position) {
            return "STRIKE";
        }
        else if (ball.number == number) {
            return "BALL";
        }
        return "NOTHING";
    }
}
