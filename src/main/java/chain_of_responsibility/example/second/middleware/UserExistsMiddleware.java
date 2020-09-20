package chain_of_responsibility.example.second.middleware;

import chain_of_responsibility.example.second.server.Server;

/**
 * ConcreteHandler. Checks whether a user with the given credentials exists.
 */
public class UserExistsMiddleware extends Middleware {
    private Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("This e-mail has not been registered yet.");
            return false;
        }

        if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong password");
            return false;
        }

        return checkNext(email, password);
    }
}
