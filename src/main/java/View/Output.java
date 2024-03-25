package View;

import Domain.RacingCar;
import Domain.RacingCars;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Output {
    private static final String RESULT = "실행결과\n";
    private static final String FINAL_RESULT = "가 최종 우승했습니다";
    public static void printResults(RacingCars racingCars){
        System.out.println(RESULT);
       List<RacingCar> racingCarList = racingCars.getRacingCars();
       racingCarList.stream()
                       .forEach(cars -> System.out.println(cars.getCarName() + " : " + "-".repeat( cars.getCarPosition())));
    }

    public int findWinnersPosition(RacingCars racingCars){
        List<RacingCar> racingCarList = racingCars.getRacingCars();
        int maxPosition = 0;
        for(int i = 0 ; i < racingCarList.size() ; i++){
            maxPosition = findBigger(racingCarList.get(i).getCarPosition(), maxPosition);
        }
        return maxPosition;
    }

    public int findBigger(int n, int m){
        if(n > m){
            return n;
        }
        return m;
    }

    public static void printFinalResult(RacingCars racingCars){
        List<RacingCar> racingCarList = racingCars.getRacingCars();
        int maxPosition = 0;
        for(int i = 0 ; i < racingCarList.size() ; i++){

        }
        System.out.println("\b\b" + FINAL_RESULT);
    }
}
