package View;

import Domain.RacingCar;
import Domain.RacingCars;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Input {
    private static final String INPUT_CAR_NAME = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분";
    private static final String INPUT_GAME_NUMBER = "시도할 횟수는 몇 회인가요?";

    public List<String> inputCarName(){
        Scanner sc = new Scanner(System.in);
        List<String> carNames = Arrays.stream(sc.next()
                .split(","))
                .toList();
        return carNames;
    }
}
