package factory.exercise.factory_method.factory;

import factory.exercise.factory_method.buttons.Button;
import factory.exercise.factory_method.buttons.HtmlButton;

/**
 * HTML Dialog (concrete creator) will produce HTML buttons (concrete product).
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
