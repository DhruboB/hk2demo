package in.dhrubo.demo.contract;

import org.jvnet.hk2.annotations.Contract;

/**
 * This is an Interface of possible Services which will expose defined public APIs (methods) for client consumptions.
 * As per HK2 framework, Services can be injected as and when necessary.
 *
 * @author Dhrubo
 * @license MIT
 */
@Contract
public interface DemoContract {
    void getVehicleDetail();
}
