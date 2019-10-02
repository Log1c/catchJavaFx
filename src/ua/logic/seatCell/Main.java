package ua.logic.seatCell;

import javafx.application.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.stage.*;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("seatCell.fxml"));

        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
