package ua.logic.seatCell;

import javafx.fxml.*;
import javafx.scene.control.*;

import java.net.*;
import java.util.*;

public class SeatCellController implements Initializable {
    @FXML
    private Label seatNumber;

    @FXML
    private Label amountLabel;

    @FXML
    private Label cardHolderFirstName;

    @FXML
    private Label cardHolderLastName;

    @FXML
    private Label cardDescription;

    public void init(int seatNumber,
                     String cardHolderFirstName,
                     String cardHolderLastName,
                     String cardDescription,
                     Double amount) {
        this.seatNumber.setText(String.valueOf(seatNumber));
        this.cardHolderFirstName.setText(cardHolderFirstName);
        this.cardHolderLastName.setText(cardHolderLastName);
        this.cardDescription.setText(cardDescription);
        this.amountLabel.setText(String.valueOf(amount));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        init(1, "Anistas", "Gollopopolis",
                "VISA 3401", 56d);
    }
}