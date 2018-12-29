package ua.logic.mvvm;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class View implements Initializable {

    private Main main;

    private ViewModel viewModel;

    @FXML
    private TableView<Model> tableView;

    @FXML
    private TableColumn<Model, String> numberColumn;

    @FXML
    private TableColumn<Model, String> splitColumn;

    @FXML
    private TableColumn<Model, String> typeColumn;

    @FXML
    private TableColumn<Model, String> amountColumn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        numberColumn.setCellValueFactory(cellData -> cellData.getValue().numberProperty());
        splitColumn.setCellValueFactory(cellData -> cellData.getValue().splitProperty());
        typeColumn.setCellValueFactory(cellData -> cellData.getValue().typeProperty());
        amountColumn.setCellValueFactory(cellData -> cellData.getValue().amountProperty());
    }

    public void setMain(Main main) {
        this.main = main;

        tableView.setItems(main.getList());
    }

}
