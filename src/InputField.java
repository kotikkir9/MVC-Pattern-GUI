import javafx.geometry.Pos;
import javafx.scene.control.TextField;

public class InputField extends TextField {

    public InputField() {
        
        this.setMaxWidth(150);
        this.setAlignment(Pos.CENTER);
        this.setFocusTraversable(false);
    }
 
}
