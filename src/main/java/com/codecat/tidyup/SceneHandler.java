package com.codecat.tidyup;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneHandler {

    private Stage stage;

    public SceneHandler(Stage7 stage)
    {
        this.stage = stage;
    }

    public void changeScene(String filename) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SceneHandler.class.getResource(filename));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setScene(scene);

    }
}
