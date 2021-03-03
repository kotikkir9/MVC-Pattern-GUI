import java.util.Observable;

import javafx.geometry.Pos;

public class GBPLabel extends View {

    public GBPLabel(Model model) {
        super(model);

        this.setStyle("-fx-border-width: 1; -fx-border-color: Black;");
        this.setPrefWidth(150);
        this.setAlignment(Pos.CENTER);
    }

    @Override
    public void update(Observable o, Object arg) {
        Model model = (Model) o;
        this.setText(String.valueOf(String.format("%,.2f", model.getGBP())));
    }   
}
