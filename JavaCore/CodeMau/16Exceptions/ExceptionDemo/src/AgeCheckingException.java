public class AgeCheckingException  extends Exception {
    //Đây là exception do mình tự định nghĩa
    public AgeCheckingException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Lỗi nhập vào một tuổi: " + super.getMessage();
    }
    
}
