package com.codecat.tidyup;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;
import java.io.IOException;
import com.codecat.tidyup.TaskCreator;
import com.codecat.tidyup.SceneHandler;

public class HelloController {
    private SceneHandler sceneHandler;
    private Button startButton;
    private Button addButton;
    public HelloController() {
        // (Optional) Add initialization code if needed
    }
    public void setSceneHandler(SceneHandler sceneHandler) { this.sceneHandler = sceneHandler; }

    @FXML
    protected void onHelloButtonClick() throws IOException {
        if (sceneHandler == null) {
            throw new IllegalStateException("SceneHandler is not initialized.");
        }
      sceneHandler.wrapChangeScene("homescreen.fxml", 800, 600, true, "TidyUp");
    }

    @FXML
    protected void onAddButtonClick() throws IOException {
        if (sceneHandler == null) {
            throw new IllegalStateException("SceneHandler is not initialized.");
        }
        sceneHandler.wrapChangeScene("create-task.fxml", 800, 600, true, "TidyUp");
    }
    @FXML
    protected void selectCategory() throws IOException{
        ChoiceBox<TaskCreator.Category> categoryBox = new ChoiceBox<>();
        categoryBox.getItems().addAll(TaskCreator.Category.values());

    }

}