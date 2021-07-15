public class DemNguoc extends Thread {
    // public void run() {
    //     int a = 10;
    //     while (a > 0) {
    //         System.out.println(a);
    //         a--;
    //         try {
    //             Thread.sleep(1000);
    //         } catch (InterruptedException e) {
    //             e.printStackTrace();
    //         }
    //     }
    //     System.out.println("Happ new year");
    // }

    public void run() {
        int a,cout=0;
        do{
            a = (int) (Math.random() * 110);
            System.out.println(a);
            cout++;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (a < 100);
        System.out.println("==> So lan dem: "+--cout);
    }
}
