package org.openjfx;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {
   @FXML public TextField ipAddress;

    @FXML
    private void sendIPAddress() throws IOException {

        System.out.println(ipAddress.getCharacters());
        MyClient client=new MyClient(ipAddress.getCharacters().toString());

    }
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
