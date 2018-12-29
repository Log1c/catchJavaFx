package ua.logic.mvvm;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {
    private final StringProperty number;
    private final StringProperty split;
    private final StringProperty type;
    private final StringProperty amount;

    public Model() {
        this(null, null, null, null);
    }

    public Model(String number, String split, String type, String amount) {
        this.number = new SimpleStringProperty(number);
        this.split = new SimpleStringProperty(split);
        this.type = new SimpleStringProperty(type);
        this.amount = new SimpleStringProperty(amount);
    }

    public String getNumber() {
        return number.get();
    }

    public StringProperty numberProperty() {
        return number;
    }

    public String getSplit() {
        return split.get();
    }

    public StringProperty splitProperty() {
        return split;
    }

    public String getType() {
        return type.get();
    }

    public StringProperty typeProperty() {
        return type;
    }

    public String getAmount() {
        return amount.get();
    }

    public StringProperty amountProperty() {
        return amount;
    }
}
