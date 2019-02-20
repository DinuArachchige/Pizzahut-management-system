/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.Pizza.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author kad
 */
public class DashboadController implements Initializable {

    @FXML
    private AnchorPane pnlDashBoard;
    @FXML
    private AnchorPane pnlLoad;
    @FXML
    private Button btnTOP;
    @FXML
    private Button btnChef;
    @FXML
    private Button btnAdmin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clickBtnTOP(MouseEvent event) {
        try {
            AnchorPane anchorPane=FXMLLoader.load(getClass().getResource("/lk/ijse/Pizza/view/LoginCall.fxml"));
            this.pnlLoad.getChildren().clear();
            this.pnlLoad.getChildren().add(anchorPane);
        } catch (IOException ex) {
            Logger.getLogger(DashboadController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void clickBtnChef(MouseEvent event) {
        try {
            AnchorPane anchorPane=FXMLLoader.load(getClass().getResource("/lk/ijse/Pizza/view/LoginChef.fxml"));
            this.pnlLoad.getChildren().clear();
            this.pnlLoad.getChildren().add(anchorPane);
        } catch (IOException ex) {
            Logger.getLogger(DashboadController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void clickBtnAdmin(MouseEvent event) {
        try {
            AnchorPane anchorPane=FXMLLoader.load(getClass().getResource("/lk/ijse/Pizza/view/LoginAdmin.fxml"));
            this.pnlLoad.getChildren().clear();
            this.pnlLoad.getChildren().add(anchorPane);
        } catch (IOException ex) {
            Logger.getLogger(DashboadController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
