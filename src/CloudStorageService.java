public class CloudStorageService extends Service
        implements PremiumFeature, Billable {

    // TODO: declare premium field
    private boolean premium;

    // TODO: constructor
    public CloudStorageService(String name, int id) {
        super(name, id);
        this.premium = false;
    }

    @Override
    public void performService() {

        // TODO:
        // check if active
        // print cloud access message
        if (!isActive()) {
            System.out.println(getServiceName() + " is not active");
            return;
        }

        System.out.println("Accessing cloud storage: " + getServiceName());
    }

    @Override
    public void upgradeToPremium() {

        // TODO:
        // enable premium
        // print message
        premium = true;
        System.out.println(getServiceName() + " upgraded to premium storage");
    }

    @Override
    public void generateBill() {

        // TODO:
        // print billing message
        System.out.println("Generating cloud storage bill for " + getServiceName());
    }
}
