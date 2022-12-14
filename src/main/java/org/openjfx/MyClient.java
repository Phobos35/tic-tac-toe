package org.openjfx;

import java.io.DataOutputStream;
import java.net.Socket;

public class MyClient {
    private String ip;
    Integer ordre=0;

    public MyClient(String ip){
        this.ip=ip;
        String prem=ordre==0? "1":"0";
        try {
            //cl=new MyClient(ip);
            Socket s = new Socket(ip, 6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF(prem);
            dout.flush();
            dout.close();
            s.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void main(String[] args) {
        try {
            //cl=new MyClient(ip);
            Socket s = new Socket("localhost", 6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("0.8");
            dout.flush();
            dout.close();
            s.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
