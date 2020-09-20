package chain_of_responsibility.example.second;

import chain_of_responsibility.example.second.middleware.Middleware;
import chain_of_responsibility.example.second.middleware.RoleCheckMiddleware;
import chain_of_responsibility.example.second.middleware.ThrottlingMiddleware;
import chain_of_responsibility.example.second.middleware.UserExistsMiddleware;
import chain_of_responsibility.example.second.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        Middleware throttling = new ThrottlingMiddleware(2);
        Middleware userExists = new UserExistsMiddleware(server);
        Middleware roleCheck = new RoleCheckMiddleware();

        // All checks are linked. Client can build various chains using the same components.
        Middleware middlewares = throttling.linkWith(userExists).linkWith(roleCheck);

        // Server gets a chain from client code.
        server.setMiddleware(middlewares);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}
