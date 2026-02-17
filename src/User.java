public abstract class User {


    // TODO: declare fields
    // name
    // id
    private String name;
    private int id;


    // TODO: constructor
    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // TODO: abstract method manageService(Service s)
    abstract void manageService(Service s);


    // TODO: abstract method useService(Service s)
    abstract void useService(Service s);

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }
}
