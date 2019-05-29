package in.dhrubo.demo;

import in.dhrubo.demo.service.DemoService;
import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.hk2.utilities.ServiceLocatorUtilities;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

import javax.inject.Singleton;

/**
 * This is a test class to trigger the DemoService via HK2 Dependency Injection framework.
 *
 * @author Dhrubo
 * @license MIT
 */
public class TestDemo {

    /**
     * This is entry point of the this Test application. Also it will act as a loader of
     * required necessary HK2 framework class.
     *
     * @param args
     * @author Dhrubo
     */
    public static void main(String[] args) {
        // loading HK2 framework , For Server application we can put this loading part within Bootloader mechanism via web descriptor.
        ServiceLocator locator = loadHK2();
        // looking up desired Service class object via HK2 framework.
        DemoService service = locator.getService(DemoService.class);
        // Calling the exposed APIs (methods) on obtained Service object. Hence, the program will start.
        service.getVehicleDetail();
    }

    /**
     * This method acts as loader of HK2 framework and scans all relevant annotated class definition and
     * loads as appropriate. However, HK2 framework defers class instantiating as much as possible till classes are required.
     *
     * @return ServiceLocator
     * @author Dhrubo
     */
    private static ServiceLocator loadHK2(){
        return ServiceLocatorUtilities.createAndPopulateServiceLocator();
    }

    /**
     * This method acts as loader of HK2 framework and bind provided class definition with Dynamic configuration and
     * loads as appropriate. However, HK2 framework defers class instantiating as much as possible till the class is required.
     * This is sample method but not used in this project yet.
     *
     * @return void
     * @author Dhrubo
     */
    private static void loadHK2Dynamically(){
        AbstractBinder binder = new AbstractBinder() {
            @Override
            protected void configure() {
                bind(DemoService.class).to(DemoService.class).in(Singleton.class);
            }
        };
        ServiceLocatorUtilities.bind(binder);
    }
}
