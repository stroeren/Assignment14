import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

public class App extends Application {

    @FXML
    private TextField kmField, milesField, inchesField, cmField, poundsField, kgField;

    @FXML
    private Button convertToMilesButton, convertToKmButton, convertToCmButton, convertToInchesButton, convertToKgButton, convertToPoundsButton;

    @Override
    public void start(Stage primaryStage) {
        kmField = new TextField();
        milesField = new TextField();
        inchesField = new TextField();
        cmField = new TextField();
        poundsField = new TextField();
        kgField = new TextField();

        convertToMilesButton = new Button("Convert to Miles");
        convertToKmButton = new Button("Convert to Kilometers");
        convertToCmButton = new Button("Convert to Centimeters");
        convertToInchesButton = new Button("Convert to Inches");
        convertToKgButton = new Button("Convert to Kilograms");
        convertToPoundsButton = new Button("Convert to Pounds");

        convertToMilesButton.setOnAction(e -> convertToMiles());
        convertToKmButton.setOnAction(e -> convertToKilometers());
        convertToCmButton.setOnAction(e -> convertToCentimeters());
        convertToInchesButton.setOnAction(e -> convertToInches());
        convertToKgButton.setOnAction(e -> convertToKilograms());
        convertToPoundsButton.setOnAction(e -> convertToPounds());

        VBox vbox = new VBox(kmField, milesField, convertToMilesButton, convertToKmButton, inchesField, cmField, convertToCmButton, convertToInchesButton, poundsField, kgField, convertToKgButton, convertToPoundsButton);
        Scene scene = new Scene(vbox, 200, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void convertToMiles() {
        double km = Double.parseDouble(kmField.getText());
        double miles = km * 0.621371;
        milesField.setText(String.format("%.2f", miles));
    }

    private void convertToKilometers() {
        double miles = Double.parseDouble(milesField.getText());
        double km = miles / 0.621371;
        kmField.setText(String.format("%.2f", km));
    }

    private void convertToCentimeters() {
        double inches = Double.parseDouble(inchesField.getText());
        double cm = inches * 2.54;
        cmField.setText(String.format("%.2f", cm));
    }

    private void convertToInches() {
        double cm = Double.parseDouble(cmField.getText());
        double inches = cm / 2.54;
        inchesField.setText(String.format("%.2f", inches));
    }

    private void convertToKilograms() {
        double pounds = Double.parseDouble(poundsField.getText());
        double kg = pounds * 0.453592;
        kgField.setText(String.format("%.2f", kg));
    }

    private void convertToPounds() {
        double kg = Double.parseDouble(kgField.getText());
        double pounds = kg / 0.453592;
        kgField.setText(String.format("%.2f", pounds));
    }

    public static void main(String[] args) {
        launch(args);
    }
}