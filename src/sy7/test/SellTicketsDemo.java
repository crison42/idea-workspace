package sy7.test;

/*
 * 某电影院目前正在上映贺岁大片(长津湖)，共有20张票，而它有3个售票窗口售票，请设计一个程序模拟该电影院售票。
 */
public class SellTicketsDemo {
    public static void main(String[] args) {
        SellTickets st1 = new SellTickets();
        SellTickets st2 = new SellTickets();
        SellTickets st3 = new SellTickets();
        Thread t1 = new Thread(st1);
        Thread t2 = new Thread(st2);
        Thread t3 = new Thread(st3);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}