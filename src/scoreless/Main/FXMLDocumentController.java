/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreless.Main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author fullerd3v
 */
public class FXMLDocumentController implements Initializable {
    
    int x, y, z;
    @FXML
    private Label lbl;

    @FXML
    private TextField txt1;

    @FXML
    private TextField txt2;

    @FXML
    private TextField txt3;
  
   public void onKeyTyped(KeyEvent event) {
        if (!event.getCharacter().matches("[0-9]")) {
            event.consume();
        }
        
        if (txt1.getText().isEmpty() || txt2.getText().isEmpty() || txt3.getText().isEmpty()) {
            lbl.setText("No hay suficientes datos");
        }
        
    }

    public void onKeyReleased(KeyEvent event) {
        x = Integer.parseInt(txt1.getText());
        y = Integer.parseInt(txt2.getText());
        z = Integer.parseInt(txt3.getText());
        
        if (x == y && y == z) {
            lbl.setText("Hay un triángulo equilátero");
        } else if (x == y || y == z || x == z) {
            lbl.setText("Hay un triángulo isósceles");
        } else {
            lbl.setText("Hay un triángulo escaleno");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //To change body of generated methods, choose Tools | Templates.
    }
        
}

 
