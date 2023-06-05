package democalcu;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;


/*import javafx.fxml.FXML;
import javafx.scene.control.Label; */

public class HelloController  implements Initializable {
    /*@FXML
    private Label welcomeText;*/

       @FXML
    private TextField txt_result;
       String op = "";
       long number1;
       long number2;
       //click CTRL

       public void Number(ActionEvent ae)
       {

       }
    public void Operation (ActionEvent ae)
    {

    }


    /*@FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to Calculator!");
    }*/



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}