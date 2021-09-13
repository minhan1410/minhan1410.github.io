public class Person {

    //Phương thức introduceYourself() không trả về giá trị nào nên ta sử dụng void
    //Phương thức có 3 tham số truyền vào là name, age, address
    public void introduceYourself(String name, int age, String address){
        System.out.println("Xin chào, tôi tên là " + name);
        System.out.println("Năm nay tôi " + age + " tuổi");
        System.out.println("Tôi đến từ " + address); 
    }

    
}
