package org.openjfx;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javax.swing.*;

public class PrimaryController {
   @FXML public TextField ipAddress;
   @FXML public String Address;

    @FXML
    private void sendIPAddress() throws IOException {
        try {
            Address = String.valueOf(ipAddress.getCharacters());
            System.out.println(Address);
            //System.out.println(ipAddress.getCharacters());
        }
        catch (Exception e) {
           System.err.println(e);
        }
    }
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
