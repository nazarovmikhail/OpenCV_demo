package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;

public class Controller {
    @FXML
    Circle myCircle;

    @FXML
    Polygon myPolygon;

    @FXML
    Label message;

    @FXML
    public void onclick1(ActionEvent e) {
        //myCircle.setRadius(50);
        //System.out.println("lollolol");
        message.setText("Ну привет!");
    }
    public void onclick2(ActionEvent e) {
        myPolygon.setRotate(45);
        System.out.println("hahahaha");
    }
    /*public void mouseClicked(ActionEvent e){
        myPolygon.setFill(Color.CORAL);
    }*/
}
