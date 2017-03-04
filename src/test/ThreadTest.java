import org.junit.Test;

/**
 * Created by zhiwen.cao on 2017/2/15.
 */
public class ThreadTest {
    public static volatile int count = 0;

    public synchronized void inc() {
        count++;
        System.out.println(count);
    }

    @Test
    public void synTest() {
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                public void run() {
                    inc();
                }
            }).start();
            System.out.println("loop value i = " + i);
        }
        System.out.println("last value = " + count);
    }
}
