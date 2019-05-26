package in.dhrubo.demo.bointerface;

import in.dhrubo.demo.bo.MovementStatus;
import org.jvnet.hk2.annotations.Contract;

/**
 * This is a Business Interface and declaring as Contract as per HK2 framework for identifying it as
 * Interface of Injectable Business Objects.
 *
 * @author Dhrubo
 * @license MIT
 */
@Contract
public interface Vehicle {

    // this methods denotes whether the Vehicle is being driven or not
    MovementStatus drive();
    // this methods denotes whether the Vehicle is turning or not
    MovementStatus turn();
    // this methods denotes whether the Vehicle is stopped or not
    MovementStatus stop();
    // this methods returns Brand Name of the Vehicle
    String getBrandName();
}
