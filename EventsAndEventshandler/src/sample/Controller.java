package sample;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.awt.*;

public class Controller {
    @FXML
private TextField txt1;

    public void onButtonClicked (){
        System.out.println("Hello "+txt1.getText());
    }
}

