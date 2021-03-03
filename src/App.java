import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

        Model model = new Model();

        USDLabel labelUSD = new USDLabel(model);
        EUROLabel labelEURO = new EUROLabel(model);
        GBPLabel labelGBP = new GBPLabel(model);
        BYNLabel labelBYN = new BYNLabel(model);
        
        InputField inputField = new InputField();
        UpdateButton button = new UpdateButton(model, inputField);
        ErrorLabel error = new ErrorLabel(button);
 
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.BASELINE_CENTER);
        grid.setHgap(20);
        grid.setVgap(10);
        grid.add(new Text("USD"), 0, 0);
        grid.add(labelUSD, 1, 0);
        grid.add(new Text("EURO"), 0, 1);
        grid.add(labelEURO, 1, 1);
        grid.add(new Text("GBP"), 0, 2);
        grid.add(labelGBP, 1, 2);
        grid.add(new Text("BYN"), 0, 3);
        grid.add(labelBYN, 1, 3);
        grid.add(new Text("DKK"), 0, 4);
        grid.add(inputField, 1, 4);

        VBox vBox = new VBox();
        vBox.setSpacing(10);
        vBox.setAlignment(Pos.CENTER);

        vBox.getChildren().addAll(grid, button, error);

        Scene scene = new Scene(vBox, 280, 240);
        stage.setScene(scene);
        stage.show();
    }
}
