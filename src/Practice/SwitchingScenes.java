package Practice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * Created by Steve on 07/02/2018.
 *
 *  NewBoston Javafx tutorial : 4 switching scenes
 *
 *
 *
 *  Code is 100% identical to his but the method overriding icon next to the button actions
 *  cause this to fail, on his screen they were green and not red
 *
 */
public class SwitchingScenes extends Application {

    Stage window;                       // calling  stage window to make easier to red


    Scene firstScene, secondScene;      // creating first and second scene


    // start application
    public static void main(String[] args) {

        launch(args);

    }


    @Override

    public void start(Stage primaryStage) throws Exception {


        window = primaryStage;                                           // making  window the primary stage

        Label myLabel = new Label("Welcome to the first scene!");  //creating label : text snippet


        // button 1
        Button firstButton = new Button("Click to go to the next scene!");  // create new button

        firstButton.setOnAction(e -> window.setScene(secondScene));     // make the action of button to switch the scenes


        // layout 1
        VBox layout1 = new VBox(20);                            // layout 1: Children are laid out in vertical column with 20px spacing

        layout1.getChildren().addAll(myLabel, firstButton);             // adding the label and the button to the layout

        firstScene = new Scene(layout1, 300, 300);        // adding layout to the scene and giving dimensions


        // button 2
        Button secondButton = new Button();                             // create new button

        secondButton.setText("Click to go back to the last scene!");    // set text on button

        firstButton.setOnAction( e -> window.setScene(secondScene));     // set action to return to first scene

        // layout 2
        StackPane layout2 = new StackPane();                            // new stack pane layout

        layout2.getChildren().addAll(secondButton);                     // adds the second button to  layout2

        secondScene = new Scene(layout2, 450, 450);       // creates second scene with layout2 and size


        // setting window
        window.setScene(firstScene);                                    // need to tell window what to display first

        window.setTitle(" Lets try switching scenes!" );                // give window title

        window.show();                                                  // show window

    }
}
