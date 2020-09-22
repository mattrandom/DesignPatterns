package template_method.exercise.second.networks;

public abstract class Network {
    protected String userName;
    protected String password;

    protected Network() {
    }

    public final boolean post(String message) {
        if (logIn(this.userName, this.password)) {
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    protected abstract boolean logIn(String userName, String password);
    protected abstract boolean sendData(byte[] data);
    protected abstract void logOut();
}
