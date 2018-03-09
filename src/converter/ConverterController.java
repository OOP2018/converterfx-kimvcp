package converter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * UI controller for events and initializing components.
 * 
 * @author Vichaphol Thamsuthikul
 * 
 */
public class ConverterController {
	@FXML
	TextField textfield1;
	@FXML
	TextField textfield2;
	@FXML
	private ComboBox<Length> unitbox1;
	@FXML
	private ComboBox<Length> unitbox2;

	/**
	 * Convert a distance from one unit to another.
	 */
	public void handleConvert(ActionEvent event) {
		textfield1.setStyle("-fx-text-inner-color: black;");
		// read values from textfield(s)
		// String text = textfield1.getText().trim();
		// This is for testing
		Length x = unitbox1.getValue();
		Length y = unitbox2.getValue();
		x.getValue();
		y.getValue();
		try {

			if (!textfield1.getText().equals("")) {
				double value = Double.parseDouble(textfield1.getText().trim());
				String.format("%.4g", value);
				textfield2.setText(String.format("%.4g",(x.getValue() * value) / y.getValue()));
			} else if (!textfield2.getText().equals("")) {
				double value2 = Double.parseDouble(textfield2.getText().trim());
				textfield1.setText(String.format("%.4g",(y.getValue() * value2) / x.getValue()));
			}
			// perform the conversion and output the result
			// System.out.println("handleConvert converting " + text);

		} catch (NumberFormatException e) {
			textfield1.setStyle("-fx-text-inner-color: red;");
			textfield2.setText("invalid number");
			return;
		}
		// textfield2.setText(kg + "");
	}

	public void handleClear(ActionEvent event) {
		textfield1.setStyle("-fx-text-inner-color: black;");
		textfield1.setText("");
		textfield2.setText("");
	}

	/**
	 * JavaFX calls the initialize() method of your controller when it creates the
	 * UI form, after the components have been created and @FXML annotated
	 * attributes have been set.
	 *
	 * This is a hook to initialize anything your controller or UI needs.
	 */
	@FXML
	public void initialize() {
		if (unitbox1 != null) {
			unitbox1.getItems().addAll(Length.values());
			unitbox1.getSelectionModel().select(0); // select an item to show
		}
		if (unitbox2 != null) {
			unitbox2.getItems().addAll(Length.values());
			unitbox2.getSelectionModel().select(1); // select an item to show
		}
	}

}
