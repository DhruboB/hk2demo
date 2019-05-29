package in.dhrubo.demo.bo;

import in.dhrubo.demo.bointerface.Vehicle;
import org.glassfish.hk2.api.Rank;
import org.jvnet.hk2.annotations.Service;

import javax.inject.Named;

/**
 * This class is an implementation of Vehicle interface but with characteristics of a Car.
 *
 * @author Dhrubo
 * @license MIT
 */
@Service @Named @Rank(100)
public class Car implements Vehicle {

    private static final String brandName = "Audi";
    private String name;
    private String brandType;
    private String carType;
    private static final String wheel = "FOUR";

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

    public static String getWheel() {
        return wheel;
    }

    public MovementStatus drive() {
        return MovementStatus.MOVING_FORWARD;
    }

    public MovementStatus turn() {
        return MovementStatus.TURNING_RIGHT;
    }

    public MovementStatus stop() {
        return MovementStatus.STOP;
    }
}
