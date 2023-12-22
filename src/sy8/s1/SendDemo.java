package sy8.s1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        byte[] bys = "hello,udp,我来了！".getBytes();
        DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("localhost"), 135);
        ds.send(dp);
        ds.close();
    }
}