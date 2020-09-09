package factory.exercise.factory_method.factory;

import factory.exercise.factory_method.buttons.Button;
import factory.exercise.factory_method.buttons.WindowsButton;

/**
 * Windows Dialog (concrete creator) will produce Windows buttons (concrete product).
 */
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
