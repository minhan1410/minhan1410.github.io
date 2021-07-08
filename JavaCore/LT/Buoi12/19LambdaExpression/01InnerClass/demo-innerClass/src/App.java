public class App implements IShowable.Message {
    public static void main(String[] args) throws Exception {
        //Lớp lồng nhau
        DateExample dateExample = new DateExample();
        dateExample.day = 22;
        dateExample.month = 4;
        dateExample.year = 2021;

        DateExample.TimeExample timeExample = dateExample.new TimeExample();
        timeExample.hour = 8;
        timeExample.minute = 33;

        timeExample.show();
        System.out.println();

        //Interface lồng nhau
        App app = new App();
        app.sendMessage();
        IShowable.Message message = new App();
        message.sendMessage();
    }

    @Override
    public void sendMessage() {
        System.out.println("Phương thức của Inner interface");
        
    }
}
