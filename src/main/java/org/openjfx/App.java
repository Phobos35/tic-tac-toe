package org.openjfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        Button button1 = new Button("_");
        Button button2 = new Button("_");
        Button button3 = new Button("_");
        Button button4 = new Button("_");
        Button button5 = new Button("_");
        Button button6 = new Button("_");
        Button button7 = new Button("_");
        Button button8 = new Button("_");
        Button button9 = new Button("_");

        GridPane root = new GridPane();

        root.add(button1, 0, 0, 1, 1);
        root.add(button2, 1, 0, 1, 1);
        root.add(button3, 2, 0, 1, 1);
        root.add(button4, 0, 1, 1, 1);
        root.add(button5, 1, 1, 1, 1);
        root.add(button6, 2, 1, 1, 1);
        root.add(button7, 0, 2, 1, 1);
        root.add(button8, 1, 2, 1, 1);
        root.add(button9, 2, 2, 1, 1);
        Scene scene = new Scene(root, 80, 75);
        //stage.setScene(scene);
        //stage.show();

        scene = new Scene(loadFXML("primary"));
        scene.getStylesheets().add(App.class.getResource("styles.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}