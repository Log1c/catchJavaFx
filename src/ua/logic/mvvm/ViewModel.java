package ua.logic.mvvm;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ViewModel {
    private ObservableList<Model> list = FXCollections.observableArrayList();

    public ViewModel() {
        //TODO mock
        list.add(new Model("1", "1 of 2", "credit", "100"));
        list.add(new Model("2", "2 of 2", "refund", "100"));
    }

    public ObservableList<Model> getList() {
        return list;
    }
}
