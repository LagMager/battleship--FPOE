package com.example.battleshipfpoe.Controller;

import com.example.battleshipfpoe.Model.Board.BoardHandler;
import com.example.battleshipfpoe.Model.List.ArrayList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable {

    @FXML
    private AnchorPane BoardPane;

    @FXML
    private Pane BoatPane;

    private BoardHandler boardHandler;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Define board size and plane dimensions as per your requirements
        double planeWidth = 600;  // Adjust width as needed
        double planeHeight = 600; // Adjust height as needed
        int gridSize = 10;        // Define the size of each tile, e.g., 40px by 40px

        // Initialize the BoardHandler with the dimensions and board size
        boardHandler = new BoardHandler(planeWidth, planeHeight, gridSize, BoardPane);

        // Update the grid to display the board
        boardHandler.updateGrid();

        boardHandler.printBoard();
    }
}
