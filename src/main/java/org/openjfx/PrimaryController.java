package org.openjfx;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javax.swing.*;

public class PrimaryController {
   @FXML public TextField ipAddress;

    @FXML
    private void sendIPAddress() throws IOException {
        try {
            System.out.println(ipAddress.getCharacters());
        }
        catch (Exception e) {
            System.err.println(e);
           // e.printStackTrace(); // System.err.println(e);
        }
    }
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
