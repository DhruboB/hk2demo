package in.dhrubo.demo.bo;

import in.dhrubo.demo.bointerface.Vehicle;
import org.jvnet.hk2.annotations.Service;

import javax.inject.Named;

/**
 * This class is an implementation of Vehicle interface but with characteristics of a Bike.
 *
 * @author Dhrubo
 * @license MIT
 */
@Service @Named
public class Bike implements Vehicle {

    private static final String brandName = "Royal Enfield";
    private String name;
    private String brandType;
    private String carType;
    private static final String wheel = "TWO";

    public String getBrandName() {
        return brandName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrandType() {
        return brandType;
    }

    public void setBrandType(String brandType) {
         this.brandType = brandType;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getWheel() {
        return wheel;
    }

    public MovementStatus drive() {
        return MovementStatus.MOVING_BACKWARD;
    }

    public MovementStatus turn() {
        return MovementStatus.TURNING_LEFT;
    }

    public MovementStatus stop() {
        return MovementStatus.STOP;
    }
}
