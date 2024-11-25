package numberbaseball;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        int strike = 0;
        int ball = 0;

        System.out.println("숫자 야구 게임을 시작합니다!");
        System.out.println("1부터 9까지의 서로 다른 숫자 3개를 맞춰보세요.");

        while (true) {
            ArrayList<Integer> userInput = new ArrayList<>();
            // 사용자 입력 받기 (이 부분은 완성되어 있음)
            System.out.print("\n첫 번째 숫자를 입력하세요: ");
            userInput.add(scanner.nextInt());

            System.out.print("두 번째 숫자를 입력하세요: ");
            userInput.add(scanner.nextInt());

            System.out.print("세 번째 숫자를 입력하세요: ");
            userInput.add(scanner.nextInt());
            for (int i = 0; i < 3; i++) {
                if (Objects.equals(userInput.get(i), numbers.get(i))) {
                    strike++;
                }
                for (int j = 0; j < 3; j++) {
                    if (!Objects.equals(userInput.get(i), numbers.get(i)) &&
                            Objects.equals(userInput.get(i), numbers.get(j)))
                        ball++;
                }
            }
            // 유저 인풋이 1 1 1 이면
//            for (int i = 0; i < 3; i++) {
//                for (int j = 0; j < 3; j++) {
//                    if (!Objects.equals(userInput.get(i), numbers.get(i)) &&
//                            Objects.equals(userInput.get(i), numbers.get(j)))
//                        ball++;
//                }
//            }


            // TODO: strike 개수를 계산하세요
            // TODO: 결과를 출력하세요 (예: "1 스트라이크")
            // TODO: 3 스트라이크인 경우 게임을 끝내세요

            System.out.println(strike + " 스트라이크" + ball + " 볼");
            if (strike == 3) {
                break;
            }
            strike = 0;
            ball = 0;


        }
        System.out.println("축하합니다! 정답을 맞추셨습니다.");
    }
}

