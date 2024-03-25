package Domain;

import View.Input;

import java.util.List;
import java.util.Map;

public class RacingCars {
    private Map<RacingCar, Integer> racingCars;

    public RacingCars (Map<RacingCar, Integer> racingCars){
        this.racingCars = racingCars;
    }

    public Map<RacingCar, Integer> getRacingCars(){
        return racingCars;
    }
}
