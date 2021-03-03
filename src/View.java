import java.util.Observable;
import java.util.Observer;

import javafx.scene.control.Label;

public abstract class View extends Label implements Observer {

    public View(Model model) {
        model.addObserver(this);
    }
}