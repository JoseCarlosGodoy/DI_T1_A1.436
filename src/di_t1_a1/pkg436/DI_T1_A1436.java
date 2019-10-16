/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_t1_a1.pkg436;

import static java.awt.Color.blue;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Usuario
 */
public class DI_T1_A1436 extends Application {
    
    @Override
   public void start(Stage stage) throws Exception {
        
        Circle circle = new Circle(125,100,50);
        Rectangle rectangle=new Rectangle(10,25,Color.AQUAMARINE);
        Group root=new Group();
        PathTransition pt = new PathTransition();
        
        pt.setDuration(Duration.millis(4000));
        pt.setPath(circle);
        pt.setNode(rectangle);
        pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.setAutoReverse(true);
        pt.play(); // Start animation
        
        //Controles de la animacion
        circle.setOnMousePressed(e -> pt.pause());
        circle.setOnMouseReleased(e -> pt.play());
        
        root.getChildren().add(circle);
        root.getChildren().add(rectangle);
        Scene scene = new Scene(root, 300, 250);
        stage.setTitle("Circulo");
        stage.setScene(scene);
        stage.show();
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
