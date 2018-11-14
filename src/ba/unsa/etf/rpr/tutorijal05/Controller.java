package ba.unsa.etf.rpr.tutorijal05;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    Double number = 0d;
    int operation = -1;

    @FXML
    private Button minus;

    @FXML
    private Button nine;

    @FXML
    private Button six;

    @FXML
    private Button mult;

    @FXML
    private Button one;

    @FXML
    private TextField display;

    @FXML
    private Button clear;

    @FXML
    private Button seven;

    @FXML
    private Label label;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button plus;

    @FXML
    private Button eight;

    @FXML
    private Button zero;

    @FXML
    private Button divide;

    @FXML
    private Button four;

    @FXML
    private Button equals;

    @FXML
    private Button five;

    @FXML
    public void buttonAction(ActionEvent actionEvent) {
        if (actionEvent.getSource() == one) {
            display.setText(display.getText() + "1");
        } else if (actionEvent.getSource() == two) {
            display.setText(display.getText() + "2");
        } else if (actionEvent.getSource() == three) {
            display.setText(display.getText() + "3");
        } else if (actionEvent.getSource() == four) {
            display.setText(display.getText() + "4");
        } else if (actionEvent.getSource() == five) {
            display.setText(display.getText() + "5");
        } else if (actionEvent.getSource() == six) {
            display.setText(display.getText() + "6");
        } else if (actionEvent.getSource() == seven) {
            display.setText(display.getText() + "7");
        } else if (actionEvent.getSource() == eight) {
            display.setText(display.getText() + "8");
        } else if (actionEvent.getSource() == nine) {
            display.setText(display.getText() + "9");
        } else if (actionEvent.getSource() == zero) {
            display.setText(display.getText() + "0");
        } else if (actionEvent.getSource() == clear) {
            display.setText("");
        } else if (actionEvent.getSource() == plus) {
            number = Double.parseDouble(display.getText());
            operation = 1;
            display.setText("");
        } else if (actionEvent.getSource() == minus) {
            number = Double.parseDouble(display.getText());
            operation = 2;
            display.setText("");
        } else if (actionEvent.getSource() == mult) {
            number = Double.parseDouble(display.getText());
            operation = 3;
            display.setText("");
        } else if (actionEvent.getSource() == divide) {
            number = Double.parseDouble(display.getText());
            operation = 4;
            display.setText("");
        }
        else if(actionEvent.getSource() == equals) {
            switch(operation) {
                case 1:
                    Double answer = number + Double.parseDouble(display.getText());
                    display.setText(String.valueOf(answer));
                    break;
                case 2:
                    answer = number - Double.parseDouble(display.getText());
                    display.setText(String.valueOf(answer));
                    break;
                case 3:
                    answer = number * Double.parseDouble(display.getText());
                    display.setText(String.valueOf(answer));
                    break;
                case 4:
                    answer = number * Double.parseDouble(display.getText());
                    display.setText(String.valueOf(answer));
                    break;
            }
        }
    }
}