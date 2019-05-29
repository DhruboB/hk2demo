package in.dhrubo.demo.service;

import in.dhrubo.demo.contract.DemoContract;
import in.dhrubo.demo.bointerface.Vehicle;
import org.glassfish.hk2.api.Rank;
import org.jvnet.hk2.annotations.Service;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/**
 * This class represents a Service containing multiple APIs (methods) for external consumptions.
 * This is a Service class as per HK2 framework and can be injected as and when required by external caller.
 * It is good practice using @Singleton and @Named annotations, though @Named is optional and @Singleton can
 * also be skipped as Services are anyway by default Singleton. For this case, @Rank is also not required and will
 * discuss about this in our documentation further. Marking it here just for possibilities.
 *
 * @author Dhrubo
 * @license MIT
 */
@Service @Named @Singleton @Rank(1)
public class DemoService implements DemoContract {

    // Injecting Car object with Name as there are multiple implementation of Vehicle.
    // This is a FIELD injection
    @Inject @Named("Car")
    private Vehicle car;
    // Injecting Bike object with Name as there are multiple implementation of Vehicle
    // This is a FIELD injection
    @Inject @Named("Bike")
    private Vehicle bike;
    // Injecting Default object without @Name as there are multiple implementation of Vehicle.
    // This is happening due to @Rank annotation of one of implementation which is considered as
    // default Object while injecting.Higher the rank, larger numeric value will take priority.
    // This is a FIELD injection
    @Inject
    private Vehicle defaultVehicle;


    /**
     * This method is one of service method of this Service class. It provides detail about above Injected Objects.
     *
     * @author Dhrubo
     */
    public void getVehicleDetail() {
        System.out.println("== Car Detail ==");
        System.out.println(car.getBrandName());
        System.out.println(car.turn());
        System.out.println("== Bike Detail ==");
        System.out.println(bike.getBrandName());
        System.out.println(bike.turn());
        System.out.println("== Default Vehicle Detail ==");
        System.out.println(defaultVehicle.getBrandName());
        System.out.println(defaultVehicle.turn());
    }
}
