public class Student extends Person {

    public Student(String name, int age, String address) {
        super(name, age, address);
        //TODO Auto-generated constructor stub
    }

    @Override  //Annottion này không bắt buộc phải chú thích trên method đã ghi đè method của lớp cha
    //Tuy nhiên khi ghi đè một method trong lớp con chúng ta nên sử dụng chú thích này để đánh dấu phương thức
    //Hãy thử đổi tên phương thức của lớp cha sẽ sảy ra điều gì?
    public void display() {
        // TODO Auto-generated method stub
        super.display(); //Thử loại bỏ super.display() thay vao một câu lệnh khác?
    }

    @Deprecated
    public void show(){
        System.out.printf("Tôi tên là %s, năm nay tôi %d tuổi và tôi đến từ %s", getName(),getAge(), getAddress());
    }
    
}
