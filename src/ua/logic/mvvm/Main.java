package ua.logic.mvvm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("view.fxml"));

//        Parent root = FXMLLoader.load(getClass().getResource("view.fxml"));
        primaryStage.setScene(new Scene(loader.load()));
        primaryStage.show();

        View controller = loader.getController();

        ViewModel viewModel = new ViewModel();
        controller.setViewModel(viewModel);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
