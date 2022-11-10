package uz.bakhromjon.javafxgetinputvalue;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.controlsfx.control.action.Action;

public class HelloController {

    @FXML
    private TextField myTextField;

    @FXML
    private Label myLabel;

    public void submit(ActionEvent event) {
        String inputText = myTextField.getText();
        if (inputText.isEmpty()) {
            myLabel.setText("Please enter your age.");
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Ogohlantirish!");
            alert.setHeaderText("Yosh maydoniga yoshingizni kiriting!");
//            alert.setContentText("Hi");
            alert.show();
        } else {
            try {
                int age = Integer.parseInt(inputText);
                setSpecialTextByAge(age);
            } catch (Exception ex) {
                myLabel.setText("Please enter only number!");
            }
        }
    }

    private boolean checkAge(int age) {
        return age >= 18;
    }

    private void setSpecialTextByAge(int age) {
        if (checkAge(age)) {
            myLabel.setText("You are signed up");
        } else {
            myLabel.setText("You are must 18+");
        }
    }

}