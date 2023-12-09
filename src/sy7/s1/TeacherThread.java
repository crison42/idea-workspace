package sy7.s1;

import java.util.Random;

class TeacherThread implements Runnable {
    private static int notesCount = 40; // 总共的学习笔记数量
    private static final Object lock = new Object(); // 用于同步的锁对象
    private final String teacherName; // 老师的名称
    private final Random random;

    public TeacherThread(String teacherName) {
        this.teacherName = teacherName;
        random = new Random();
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (notesCount > 0) {
                    notesCount--;
                    System.out.println(teacherName + "正在发第" + notesCount + "份学习笔记");
                } else {
                    // 如果所有学习笔记都被分发完，则结束线程
                    break;
                }
            }

            // 让其他线程有机会执行
            try {
                Thread.sleep(random.nextInt(500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}