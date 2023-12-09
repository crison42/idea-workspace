package sy7.test;

public class SellTickets implements Runnable {
    private static int tickets = 20; // 总票数
    private static int ticketId = 1; // 票号

    @Override
    public void run() {
        while (true) {
            synchronized (SellTickets.class) { // 使用类锁进行同步
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticketId + "张票");
                    tickets--; // 剩余票数--
                    ticketId++; // 票号++
                } else {
                    break;
                }
            }
        }
    }
}
