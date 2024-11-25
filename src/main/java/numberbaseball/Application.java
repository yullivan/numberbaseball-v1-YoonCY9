package numberbaseball;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> randomNumbers = new ArrayList<>();

        Random random = new Random();
        while (randomNumbers.size() < 3) {
            int randNum = random.nextInt(9) + 1;
            if (!randomNumbers.contains(randNum)) {
                randomNumbers.add(randNum);
            }
        }

        System.out.println("숫자 야구 게임을 시작합니다!");
        System.out.println("1부터 9까지의 서로 다른 숫자 3개를 맞춰보세요.");

        while (true) {
            int strike = 0;
            int ball = 0;

            ArrayList<Integer> userInput = new ArrayList<>();
            // 사용자 입력 받기 (이 부분은 완성되어 있음)
            System.out.print("\n1 ~ 9 사이의 첫 번째 숫자를 입력하세요: ");
            userInput.add(scanner.nextInt());
            if ((userInput.get(0) < 1) || (userInput.get(0) > 9)) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            System.out.print("1 ~ 9 사이의 두 번째 숫자를 입력하세요: ");
            userInput.add(scanner.nextInt());
            if ((userInput.get(1) < 1) || (userInput.get(1) > 9)) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            System.out.print("1 ~ 9 사이의 세 번째 숫자를 입력하세요: ");
            userInput.add(scanner.nextInt());
            if ((userInput.get(2) < 1) || (userInput.get(2) > 9)) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            for (int i = 0; i < 3; i++) {
                if (Objects.equals(userInput.get(i), randomNumbers.get(i))) {
                    strike++;
                } else if (userInput.contains(randomNumbers.get(i))) {
                    ball++;
                }
            }
            // 유저 인풋이 1 1 1 이면
//            for (int i = 0; i < 3; i++) {
//                for (int j = 0; j < 3; j++) {
//                    if (!Objects.equals(userInput.get(i), randomNumbers.get(i)) &&
//                            Objects.equals(userInput.get(i), randomNumbers.get(j)))
//                        ball++;
//                }
//            }


            // TODO: strike 개수를 계산하세요
            // TODO: 결과를 출력하세요 (예: "1 스트라이크")
            // TODO: 3 스트라이크인 경우 게임을 끝내세요

            System.out.println(strike + " 스트라이크 " + ball + " 볼");
            if (strike == 3) {
                break;
            }

        }
        System.out.println("축하합니다! 정답을 맞추셨습니다.");
    }
}

