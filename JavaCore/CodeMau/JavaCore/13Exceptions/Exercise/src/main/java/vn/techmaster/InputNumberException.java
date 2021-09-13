package vn.techmaster;

public class InputNumberException extends Exception {

    public InputNumberException(String message){
        super(message);
    }

    @Override
    public String getMessage() {
        return "Lỗi: " + super.getMessage();
    }
}
