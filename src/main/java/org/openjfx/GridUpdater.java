package org.openjfx;

import javafx.application.Platform;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class GridUpdater extends Thread{

    @Override
    public void run() {

        Thread updater = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    ServerSocket ss = new ServerSocket(6666);
                    Socket s= ss.accept();
                    DataInputStream dis = new DataInputStream(s.getInputStream());
                    String str = (String) dis.readUTF();
                    System.out.println("message = " + str);
                    ss.close();
                }
                catch (Exception e){
                    System.err.println(e);
                }

            }
        });

        Platform.runLater(updater);
    }
}
