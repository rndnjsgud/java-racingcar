package Service;

import Domain.RacingCar;
import Domain.RacingCars;

import java.util.Map;

public class MoveCar {
    public int generateRandomNumber(){
        return (int)(Math.random()*10);
    }

    public void moveCar(RacingCar racingCar){
        if(generateRandomNumber() >= 4){
            racingCar.moveCarPosition();
        }
    }

    public Map<RacingCar, Integer> moveCars(RacingCars racingCars){
        Map<RacingCar, Integer> racingCarList = racingCars.getRacingCars();
        for(Map.Entry<RacingCar, Integer> entry : racingCarList.entrySet()){
            moveCar(entry.getKey());
        }
        return racingCarList;
    }
}
