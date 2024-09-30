package com.example.library.controllers.client;

import com.example.library.services.impl.AccountServiceImpl;
import com.example.library.services.IAccountService;
import com.example.library.utils.Alert;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class EmailController {
    public TextField txtEmail;

    private final IAccountService accountService;

    public EmailController() {
        this.accountService = new AccountServiceImpl();
    }

    public void btnSubmit(ActionEvent actionEvent) {
        System.out.println(txtEmail.getText());
        try {
            accountService.resetPassword(txtEmail.getText());
            Alert.showAlert(javafx.scene.control.Alert.AlertType.INFORMATION, "Success", null, "Reset password successfully, check your email for more information!");
        } catch (Exception e) {
            Alert.showAlert(javafx.scene.control.Alert.AlertType.ERROR, "Error", null, e.getMessage());
        }
    }
}
