package sy7.s2;

public class SaleTicketDemo {
    public static void main(String[] args) {
        // 创建5个售票点
        SaleTicket saleTicket1 = new SaleTicket(1);
        SaleTicket saleTicket2 = new SaleTicket(2);
        SaleTicket saleTicket3 = new SaleTicket(3);
        SaleTicket saleTicket4 = new SaleTicket(4);
        SaleTicket saleTicket5 = new SaleTicket(5);

        // 创建5个线程分别对应5个售票点
        Thread thread1 = new Thread(saleTicket1);
        Thread thread2 = new Thread(saleTicket2);
        Thread thread3 = new Thread(saleTicket3);
        Thread thread4 = new Thread(saleTicket4);
        Thread thread5 = new Thread(saleTicket5);

        // 启动线程
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}