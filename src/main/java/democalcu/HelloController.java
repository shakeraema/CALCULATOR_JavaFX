package democalcu;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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
            String no = ((Button)ae.getSource()).getText();
            txt_result.setText(txt_result.getText()+no)
       }
       //Second
    public void Operation (ActionEvent ae)
    {
        String operation = ((Button)ae.getSource()).getText();
        if (!operation.equals("="))
        {
            if(!op.equals("")){
                return;
            }
            op = operation;
            number1 = Long.parseLong(txt_result.getText());
            txt_result.setText("");
        }
        else {
            if(op.equals("")){
                return;
            }
            number2 = Long.parseLong(txt_result.getText());
            calculate(number1, number2, op);
            op = "";
            //create 3 Method calculate
        }
    }
    public void calculate (long n1, long n2, String op){
           // TODO
        switch (op) {
            case "+" : txt_result.setText(n1 + n2 + "");
        }
    }

    /*@FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to Calculator!");
    }*/



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}