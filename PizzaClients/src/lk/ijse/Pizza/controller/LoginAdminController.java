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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author kad
 */
public class LoginAdminController implements Initializable {

    @FXML
    private AnchorPane pnlAdmin;
    @FXML
    private TextField tfUserName;
    @FXML
    private PasswordField tfPassword;
    @FXML
    private Button btnCancle;
    @FXML
    private Button btnLog;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clickBtnCancel(MouseEvent event) {
    }

    @FXML
    private void clickBtnLog(MouseEvent event) {
        try {
            Parent p = FXMLLoader.load(this.getClass().getResource("/lk/ijse/Pizza/controller/LoginAdmin.fxml"));
            Scene s = new Scene(p);
            Stage stage = (Stage) this.pnlAdmin.getScene().getWindow();
            stage.setScene(s);
        } catch (IOException ex) {
            Logger.getLogger(LoginAdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
