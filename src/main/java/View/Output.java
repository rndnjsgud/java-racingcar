package View;

import Domain.RacingCar;
import Domain.RacingCars;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

public class Output {
    private static final String RESULT = "실행결과\n";

    public void printResults(RacingCars racingCars){
        System.out.println(RESULT);
        Map<RacingCar, Integer> racingCarList = racingCars.getRacingCars();
        for(Map.Entry<RacingCar, Integer> entry : racingCarList.entrySet()){
            RacingCar car = entry.getKey();
            int carPosition = entry.getValue();
            System.out.println(car.getCarName() + " : " + '-' * carPosition + "\n");
        }
    }

    public void printFinalResult(RacingCars racingCars){
        Map<RacingCar, Integer> racingCarList = racingCars.getRacingCars();
        int maxValue = (Collections.max(racingCarList.values()));
        for(Map.Entry<RacingCar, Integer> entry : racingCarList.entrySet()){
            if(entry.getValue() == maxValue){
                System.out.println(entry.getKey().getCarName() + ", ");
            }
        }
        System.out.println("\b\b" + "가 최종 우승했습니다");


    }
}
