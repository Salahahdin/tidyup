package com.codecat.tidyup;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        // Get the controller instance
        HelloController controller = fxmlLoader.getController();
        if (controller == null) {
            throw new IllegalStateException("Controller was not initialized properly.");
        }

        controller.setSceneHandler(new SceneHandler(primaryStage));

        primaryStage.setScene(scene);
        primaryStage.setTitle("TidyUp");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();


    }
}