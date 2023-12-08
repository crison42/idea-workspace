package sy7.s2;

class SaleTicket implements Runnable {
    private static int totalTickets = 20; // 火车票总数
    private static final Object lock = new Object(); // 用于同步的锁对象

    @Override
    public void run() {
        while (totalTickets > 0) {
            synchronized (lock) {
                if (totalTickets > 0) {
                    // 模拟售票过程
                    try {
                        Thread.sleep(100); // 假设售票过程需要一定时间
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    // 售票
                    System.out.println(Thread.currentThread().getName() + "售出了第" + totalTickets + "张火车票");
                    totalTickets--;
                }
            }
        }
    }
}
