public class TestThread extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500); //sleep 500 mili giây. sau khi chạy hãy thử tăng lên 1000, 2000 mili giây
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
        System.out.println("Done!!!");
    }

}
