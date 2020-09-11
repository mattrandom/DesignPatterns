package di;

public class Main {
    public static void main(String[] args) {

        /**
         * The class ClientA is now not depending on any specific implementations of Service.
         * Instead of creating an instance of dependent class directly in ClientA, the dependency injection container
         * or framework is now responsible for creating that instance and inject it to the class ClientA via its constructor.
         *
         * Here, an implementation of Service is ServiceB is created and passed to ClientA, which is not aware of
         * the actual implementation it is using. ClientA only knows that the injected object is of type Service.
         */
        Service service = new ServiceB();
        Client client = new ClientA(service);
        System.out.println(client.doSomething());

        /**
         * Besides constructor injection, setter injection is used to pass the depending object to the dependent one.
         * We can change to different Service’s implementation, e.g. ServiceC like this:
         */
        ((ClientA) client).setService(new ServiceC());
        System.out.println(client.doSomething());

    }

}
