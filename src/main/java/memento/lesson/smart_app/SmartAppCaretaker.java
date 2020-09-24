package memento.lesson.smart_app;

import java.util.ArrayList;
import java.util.List;

// Caretaker
public class SmartAppCaretaker {
    private List<SmartAppMemento> mementos = new ArrayList<>();


    public void addMemento(SmartAppMemento memento) {
        mementos.add(memento);
        System.out.println(String.format("The saved version: {%s} is listed under index [%s]", memento.getVersion(), mementos.size() - 1));
    }

    public SmartAppMemento getMemento(int index) {
        if (mementos.size() > index) {
            System.out.println(String.format("The version %s has been loaded", mementos.get(index).getVersion()));
            return mementos.get(index);
        } else {
            throw new IndexOutOfBoundsException("Wrong index or version does not exist");
        }
    }
}
