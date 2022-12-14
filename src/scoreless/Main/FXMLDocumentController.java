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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
    
    @FXML
    private ImageView img;
    
    Image triEq = new Image("scoreless/Assets/eq.png");
    Image triEsc = new Image("scoreless/Assets/esc.png");
    Image triIsc = new Image("scoreless/Assets/isc.png");
  
   public void onKeyTyped(KeyEvent event) {
        if (!event.getCharacter().matches("[0-9]")) {
            event.consume();
        }
        
        if (txt1.getText().isEmpty() || txt2.getText().isEmpty() || txt3.getText().isEmpty()) {
            lbl.setText("No hay suficientes datos");
            img.setImage(null);
        }
        
    }

    public void onKeyReleased(KeyEvent event) {
        x = Integer.parseInt(txt1.getText());
        y = Integer.parseInt(txt2.getText());
        z = Integer.parseInt(txt3.getText());
        
        if (x == y && y == z) {
            lbl.setText("Hay un triángulo equilátero");            
            img.setImage(triEq);
        } else if (x == y || y == z || x == z) {
            lbl.setText("Hay un triángulo isósceles");
            img.setImage(triIsc);
        } else {
            lbl.setText("Hay un triángulo escaleno");
            img.setImage(triEsc);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //TODO
    }
        
}

 
