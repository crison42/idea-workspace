package sy7.s2;


public class SaleTicketDemo {
    public static void main(String[] args) {
        SaleTicket saleTicket = new SaleTicket();

        // 创建5个线程模拟5个售票点
        Thread thread1 = new Thread(saleTicket);
        Thread thread2 = new Thread(saleTicket);
        Thread thread3 = new Thread(saleTicket);
        Thread thread4 = new Thread(saleTicket);
        Thread thread5 = new Thread(saleTicket);

        // 启动线程
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}