package converter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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

	/**
	 * Convert a distance from one unit to another.
	 */
	public void handleConvert(ActionEvent event) {
		textfield1.setStyle("-fx-text-inner-color: black;");
		// read values from textfield(s)
		String text = textfield1.getText().trim();
		// This is for testing
		try {
			Double.parseDouble(text);
			// perform the conversion and output the result
			System.out.println("handleConvert converting " + text);

		} catch (NumberFormatException e) {
			textfield1.setStyle("-fx-text-inner-color: red;");
			textfield2.setText("invalid number");
			return;
		}
		textfield2.setText(text);
	}

	public void handleClear(ActionEvent event) {
		
	}

}
