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
            Address = String.valueOf(ipAddress.getCharacters()); //this line store the incoming ip address in the variable call Address
            // System.out.println(Address);
            //System.out.println(ipAddress.getCharacters());

        System.out.println(ipAddress.getCharacters());
        MyClient client=new MyClient(ipAddress.getCharacters().toString());

    }
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
