public class ConsultationService extends Service
        implements Billable {

    // TODO: constructor
    public ConsultationService(String name, int id) {
        super(name, id);
    }

    @Override
    public void performService() {

        // TODO:
        // check active
        // print consultation message
        if (!isActive()) {
            System.out.println(getServiceName() + " is not active");
            return;
        }

        System.out.println("Providing online consultation via " + getServiceName());
    }

    @Override
    public void generateBill() {

        // TODO:
        // print billing message
        System.out.println("Generating consultation bill for " + getServiceName());
    }
}
