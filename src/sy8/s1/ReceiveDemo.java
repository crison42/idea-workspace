package sy8.s1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket(135);
        byte[] bys =new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys, bys.length);
        ds.receive(dp);
        String str= new String(dp.getData(),0,dp.getLength());
        String ip = dp.getAddress().getHostAddress();
        System.out.println(ip+"传递的数据是："+str);
    }
}