package View;

import Domain.RacingCar;
import Domain.RacingCars;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Output {
    private static final String RESULT = "실행결과\n";

    public static void printResults(RacingCars racingCars){
        System.out.println(RESULT);
       List<RacingCar> racingCarList = racingCars.getRacingCars();
       racingCarList.stream()
                       .forEach(cars -> System.out.println(cars.getCarName() + " : " + '-' * cars.getCarPosition() + "\n"));
    }
/*
    public static void printFinalResult(RacingCars racingCars){
        List<RacingCar> racingCarList = racingCars.getRacingCars();
        int maxPosition = racingCarList.getCar
        System.out.println("\b\b" + "가 최종 우승했습니다");


    }*/
}
