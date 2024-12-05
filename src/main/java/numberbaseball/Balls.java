package numberbaseball;

import java.util.Objects;

public class Balls {

    Ball ball1;
    Ball ball2;
    Ball ball3;

    public Balls(Ball ball1, Ball ball2, Ball ball3) {
        this.ball1 = ball1;
        this.ball2 = ball2;
        this.ball3 = ball3;
    }

    public String matchStatus(Ball ball) {

        if (!ball.matchStatus(ball1).equals("NOTHING")) {
            return ball.matchStatus(ball1);
        }
        if (!ball.matchStatus(ball2).equals("NOTHING")) {
            return ball.matchStatus(ball2);
        }
        if (!ball.matchStatus(ball3).equals("NOTHING")) {
            return ball.matchStatus(ball3);
        }

        return "NOTHING";
    }

}
