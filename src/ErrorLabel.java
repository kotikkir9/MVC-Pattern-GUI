import javafx.animation.PauseTransition;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class ErrorLabel extends Label {

    private UpdateButton button;
    private PauseTransition pause;

    public ErrorLabel(UpdateButton button) {
        this.button = button;

        this.setText("Invalid Input");
        this.setStyle("-fx-text-fill: red;");
        this.setVisible(false);

        pause = new PauseTransition(Duration.seconds(1));
        pause.setOnFinished(event -> this.setVisible(false));

        button.setOnAction(event -> handle());
    }

    private void handle() {
        if(!button.handle()) {
            this.setVisible(true);
            pause.play();
        }
    }

}