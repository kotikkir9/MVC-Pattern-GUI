import javafx.scene.control.Button;

public class UpdateButton extends Button {
    
    private Model model;
    private InputField inputField;

    public UpdateButton(Model model, InputField inputField) {
        this.model = model;
        this.inputField = inputField;

        this.setText("Update");
        this.setPrefWidth(205);
        this.setFocusTraversable(false);

        this.setOnAction(e -> handle());
    }

    public boolean handle() {
        if(inputField.getText().matches("[0-9]+")) {
            model.setValuta(Integer.valueOf(inputField.getText()));
            return true;
        } else 
            return false;
    }

}