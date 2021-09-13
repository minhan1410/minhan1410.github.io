# Trắc nghiệm đầu vào khoá học Spring Boot

*Thời gian làm 24 tiếng cho thoải mái*

Hầu hết các câu hỏi ở dạng tự luận. Hãy viết đáp án luôn ở file này (định dạng Markdown) và nộp lại.
Những câu hỏi nào bạn không biết hãy Google, đọc, hiểu rồi trả lời.

1. Hãy nói ra sự khác biệt giữa JDK và JRE?
2. Java Virtual Machine là gì? có tác dụng gì?
3. Trong đoạn code dưới đây, kết quả in ra là gì? giải thích!
  ```java
  public static void main(String[] args) {
      int i;
      System.out.println(i);
  }
  ```
  Hỏi: kết quả in ra màn hình là gì?

4. Hãy so sánh ưu và nhược điểm của 2 loại vòng lặp này

  ```java
  List<String> listString = Arrays.asList("John", "Jimmy", "Henry", "Thuý", "Đào", "Hương");
  listString = Arrays.asList("John", "Jimmy", "Henry", "Thuý", "Đào", "Hương");
  //vòng lặp sử dụng biến index
  for (int i = 0; i < listString.size(); i++) {
    System.out.println(i + " " + listString.get(i));
  }

  //vòng lặp không có biến index
  for (String item : listString) {
    System.out.println(item);
  }
  ```
  
5. Cho một mảng các số tự nhiên [1, 2, 0, 8, 5, 3, 9, 7] hãy viết hàm để dồn tất cả số lẻ sang bên trái, số chẵn sang bên phải

6. Cho một dãy có số lượng các chữ số là lẻ 2N + 1, ví dụ "123", "32567"
hãy viết hàm lấy chữ số ở chính giữa, cộng với số bên trái, rồi nhân với số bên phải, tiếp tục cho đến hết dãy số. 
"123" -> (2 + 1) * 3
"32567" -> ((5 + 2) * 6 + 3) * 7

7. Tối qua thầy mua vé xem phim "Bố Già" ở CGV. Lúc nhận email, thấy bị thiếu ảnh BarCode. Thầy gọi cho bộ phận kỹ thuật ở CGV
![](cgv.jpg)

Họ bảo là chức năng này hoạt động bình thường ở phía họ. Nhưng tại sao khách hàng lại gặp lỗi. Bạn được CGJ tuyển dụng và giao nhiệm vụ sửa lỗi này. Vậy bạn đánh giá nguyên nhân lỗi này từ đâu, và các bước bạn sẽ tiến hành để khảo sát lỗi.