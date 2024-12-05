package numberbaseball;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ballTest {



    @Test
    void 스볼아테스트() {
        Ball com = new Ball(1,3);
        Ball userBall = new Ball(1,3);
        assertThat(com.matchStatus(userBall)).isEqualTo("STRIKE");

    }

    @Test
    void 볼테스트() {

        Ball com2 = new Ball(1,1);
        Ball userBall2 = new Ball(1,2);
        assertThat(com2.matchStatus(userBall2)).isEqualTo("BALL");
    }
}


