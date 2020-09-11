package di.second_example.initial_state;

public class MyLegacyTest {

    public static void main(String[] args) {
        MyApplication app = new MyApplication();
        app.processMessages("Hi bro", "whatever@random.com");
    }
}
