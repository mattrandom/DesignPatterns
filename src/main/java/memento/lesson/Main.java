package memento.lesson;

import memento.lesson.smart_app.SmartApp;
import memento.lesson.smart_app.SmartAppCaretaker;

public class Main {
    public static void main(String[] args) {
        SmartApp smartApp = new SmartApp();
        SmartAppCaretaker smartAppCaretaker = new SmartAppCaretaker();

        smartApp.changeVersion(1.0);
        smartApp.changeVersion(1.1);
        smartApp.changeVersion(1.2);

        smartAppCaretaker.addMemento(smartApp.save());

        smartApp.changeVersion(1.3);
        smartApp.changeVersion(2.0);
        smartApp.changeVersion(2.1);

        smartApp.load(smartAppCaretaker.getMemento(0));
    }
}
