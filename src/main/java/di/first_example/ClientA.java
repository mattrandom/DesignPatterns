package di.first_example;

public class ClientA implements Client {

    /**
     * And the class ClientA is now implementing the Client interface and it uses the Service interface
     * instead of a concrete class - the actual Service’s implementation is “injected” to this class via
     * its constructor - constructor injection:
     */
    Service service;

    public ClientA(Service service) { // constructor injection
        this.service = service;
    }

    public void setService(Service service) { // setter injection
        this.service = service;
    }

    @Override
    public String doSomething() {
        return service.getInfo();
    }
}
