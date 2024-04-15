package QD.zy3.no3;

import QD.zy3.no1.TFCardImpl;

public class Client {
    public static void main(String[] args) {
        System.out.println("******1.读SD卡中的数据******");
        Computer computer = new Computer();
        String msg1 = computer.readSD(new SDCardImpl());
        System.out.println(msg1);

        System.out.println("===================");
        System.out.println("******2.使用该电脑读取TF卡中的数据******");
        SDAdapterTF sdAdapterTF = new SDAdapterTF(new TFCardImpl());
        String msg2 = computer.readSD(sdAdapterTF);
        System.out.println(msg2);

    }
}
