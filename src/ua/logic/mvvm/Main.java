package ua.logic.mvvm;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private static ObservableList<Model> list = FXCollections.observableArrayList();

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("view.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();


//        controller.setMainApp(this);
    }

    public static void main(String[] args) {
        list.add(new Model("1", "1 of 2", "credit", "100"));
        list.add(new Model("2", "2 of 2", "refund", "100"));
        launch(args);
    }

    public static ObservableList<Model> getList() {
        return list;
    }
}
