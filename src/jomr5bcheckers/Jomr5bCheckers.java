/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jomr5bcheckers;

import jomr5bcheckers.UI.CheckerBoard;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Jared
 */
public class Jomr5bCheckers extends Application {
    
    private final int numRows =	8;
    private final int numCols =	8;
    private final int boardWidth = 600;	
    private final int boardHeight = 600;
    private final Color lightColor = Color.SKYBLUE;
    private final Color darkColor = Color.DARKBLUE; 
    private CheckerBoard checkerBoard;	
    
    @Override
    public void start(Stage primaryStage) 
    {   
        //checkerBoard = new CheckerBoard(this.numRows, this.numCols, this.boardWidth, this.boardHeight, this.lightColor, this.darkColor);
        checkerBoard = new CheckerBoard(this.numRows, this.numCols, this.boardWidth, this.boardHeight);
        
        Scene scene = new Scene(checkerBoard.build());
        
        primaryStage.setTitle("Checkers");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
