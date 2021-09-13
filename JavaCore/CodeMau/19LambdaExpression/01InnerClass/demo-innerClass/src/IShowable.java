public interface IShowable {

    void show();
    
    interface Message{ //interface lồng trong interface IShowable
        void sendMessage();
    }
    
}
