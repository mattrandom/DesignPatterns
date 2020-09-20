package chain_of_responsibility.example.second.middleware;

/**
 * ConcreteHandler. Checks a user's role.
 */
public class RoleCheckMiddleware extends Middleware {

    @Override
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        if (email.equals("user@example.com")) {
            System.out.println("Hello, user!");
            return true;
        }

        return checkNext(email, password);
    }
}
