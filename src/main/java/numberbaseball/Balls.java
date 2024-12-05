package numberbaseball;

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
        String status = ball.matchStatus(ball1);
        if (status.equals("STRIKE")) {
            return "STRIKE";
        }
        else if (ball.matchStatus(ball1).equals("BALL")) {
            return "BALL";
        }
        return "NOTHING";

    }

}
