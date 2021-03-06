package Join;

/**
 * JoinDemo
 *
 * @author Michael.Wang
 * @date 2017/6/15
 */
public class JoinDemo {

    public static void main(String[] args) throws InterruptedException {
        join0();
    }

    private static void join0() throws InterruptedException {
        JoinDemoThread demo = new JoinDemoThread();
        long start = System.currentTimeMillis();
        demo.start();
        demo.join(0); //不停等待，直到等到线程终止

        /**
         if (millis == 0) {
             while (isAlive()) {
                 wait(0);
             }
         }
         */
        System.out.println("Thread isAlive: "+demo.isAlive());
        System.out.println("time spent: "+(System.currentTimeMillis() - start));
        System.out.println("joined.");
    }
}