package sy7.s2;

class SaleTicket implements Runnable {
    private static int totalTickets = 20; // 火车票总数
    private static final Object lock = new Object(); // 用于同步的锁对象
    private final int sellPoint; // 售票点序号

    public SaleTicket(int sellPoint) {
        this.sellPoint = sellPoint;
    }

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
                    System.out.println("售票点" + sellPoint + "正在销售第" + (20 - totalTickets + 1) + "张票");
                    totalTickets--;
                }
            }
        }
    }
}