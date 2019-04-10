package ua.logic.mvvm;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class View implements Initializable {
    private ViewModel viewModel;

    @FXML
    private TableView<Model> trackersTableView;

    @FXML
    private TableColumn<Model, String> iconColumn;

    @FXML
    private TableColumn<Model, String> nameColumn;

    @FXML
    private TableColumn<Model, String> periodColumn;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        iconColumn.setCellValueFactory(cellData -> cellData.getValue().numberProperty());
        nameColumn.setCellValueFactory(cellData -> cellData.getValue().splitProperty());
        periodColumn.setCellValueFactory(cellData -> cellData.getValue().typeProperty());
    }

    public void setViewModel(ViewModel viewModel) {
        trackersTableView.setItems(viewModel.getList());
    }
}
