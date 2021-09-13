public class App extends Thread {
    public static void main(String[] args) throws Exception {
        //Tạo đối tượng mThread
        MultithreadWithThread mThread = new MultithreadWithThread(); 
        mThread.start(); //Bắt đầu khởi chạy thread


        //Luồng được chạy bằng cách chuyển một implements của lớp tới  constructor của thread 
        //và gọi phương thức start của luồng
        MultithreadWithRunnable mRunnable = new MultithreadWithRunnable();
        Thread thread = new Thread(mRunnable);
        thread.start();

        //Sử dụng sleep method
        TestThread test1 = new TestThread();
        System.out.println("Name of test1: " +test1.getName()); //Lấy tên
        System.out.println("Id of test2: " +test1.getId()); //Lấy id
        test1.start();
        //Thử start test1 cùng một lúc 
        //test1.start();
        //thêm join 
        try {
            //test1.join(); //đợi luồng 1 chết rồi mới chạy các luồng tiếp theo
            test1.join(1500); //khi test1 hoàn thành nhiệm vụ trong 1500 mili giây 
            //thì test2 và test3 bắt đầu thực hiện
        } catch (Exception e) {
            e.printStackTrace();
        }

        TestThread test2 = new TestThread();
        System.out.println("Name of test2: " +test2.getName());
        TestThread test3 = new TestThread();
        System.out.println("Name of test3: " +test3.getName());
        test2.start();
        test3.start();

        //đổi tên test1
        test1.setName("Test thread 1");
        System.out.println("Name of test1: " +test1.getName());
        
    }
}
