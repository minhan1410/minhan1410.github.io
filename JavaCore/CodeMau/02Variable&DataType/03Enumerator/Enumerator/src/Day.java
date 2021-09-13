public enum Day {
    //Khởi tạo giá trị đặc biệt cho hằng số enum
    MONDAY("Thứ hai"), 
    TUESDAY("Thứ ba"), 
    WEDNESDAY("Thứ tư"), 
    THURSDAY("Thứ năm"), 
    FRIDAY("Thứ sáu"), 
    SATURDAY("Thứ bảy"), 
    SUNDAY("Chủ nhật");

    String value;

    //Constructor (Hàm tạo)
    //Phạm vi truy cập của constructor enum luôn là private
    private Day(String value) {
        this.value = value;
    }

    //Lấy value
    public String getValue() {
        return value;
    }
    
}
