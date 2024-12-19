package com.codecat.tidyup;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

import com.codecat.tidyup.SceneHandler;

public class HelloController {
    private SceneHandler sceneHandler;
    private Button startButton;

    public HelloController() {
    }
    public void setSceneHandler(SceneHandler sceneHandler) { this.sceneHandler = sceneHandler; }

    public HelloController(Stage stage) {
        this.sceneHandler = new SceneHandler(stage);
    }
    @FXML
    protected void onHelloButtonClick() throws IOException {
      sceneHandler.changeScene("homescreen.fxml");
    }

}