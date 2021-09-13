## Multithreading
Đa luồng trong Java là một quá trình thực hiện đồng thời nhiều luồng. Một ứng dụng java ngoài luồng chính có thể có các luồng khác thực thi đồng thời làm ứng dụng chạy nhanh và hiệu quả hơn  

## Ưu điểm của đa luồng
- Có thể thực hiện nhiều thao tác cùng một lúc  
- Tiết kiệm thời gian  
- Các luồng là độc lập vì vậy nó không ảnh hưởng đến các luồng khác nếu có ngoại lệ xảy ra trong một luồng duy nhất  

## Thread
Luồng là một quy trình con (sub-process). Một đơn vị xử lý nhỏ nhất của máy tính có thể thực hiện một công việc riêng biệt

## Khác biệt giữa multithreading và multitasking
Multitasking là khả năng chạy đồng thời một hoặc nhiều chương trình cùng một lúc trên một hệ điều hành. VD: Trên HĐH windows chúng ta có thể làm việc đồng thời với word, excel, media player,...  
Multithreading là một tiến trình thực hiện nhiều luồng. VD: Khi nghe nhạc, chúng ta có thể tương tác được với các nút điều khiển như: play, pause, next,...

## Lớp Thread
Java cung cấp lớp Thread để hỗ trợ đa luồng. Lớp Thread cung cấp các constructor và method để tạo và thực hiện các hoạt động trên một luồng. Lớp Thread implements Runnable  
`public class Thread implements Runnable`

**Một số phương thức thường được sử dụng:**  
- public void run() : Sử dụng để thực hiện hành động cho một luồng  
- public void start() : Bắt đầu thực thi luồng. JVM gọi phương thức run() trên luồng  
- Phương thức sleep() của lớp Thread được sử dụng để tạm ngưng một thread cho một khoảng thời gian nhất định. Lớp Thread cung cấp hai phương thức để tạm ngưng một thread:  
*public static void sleep(long miliseconds)throws InterruptedException*   
*public static void sleep(long miliseconds, int nanos)throws InterruptedException*  
- Phương thức join() chờ một thread chết. Nói cách khác, nó làm cho các thread đang chạy ngừng hoạt động cho đến khi luồng mà nó tham gia hoàn thành nhiệm vụ của nó.  
*public void join()throws InterruptedException*  
*public void join(long milliseconds)throws InterruptedException*  
- Interrupt một thread trong java hay làm gián đoạn một luồng trong java. Nếu thread nằm trong trạng thái sleep hoặc wait (nghĩa là sleep() hoặc wait() được gọi ra), việc gọi phương thức interrupt() trên thread đó sẽ phá vỡ trạng thái sleep hoặc wait và ném ra ngoại lệ InterruptedException.  
*public void interrupt()*  
*public static boolean interrupted()*  
*public boolean isInterrupted()*  


## Vòng đời của một Thread
Một thread có thể ở một trong 5 trạng thái. Theo hãng Sun, chỉ có 4 trạng thái trong vòng đời của thread là new, runnable, non-runnable và end.   
Nhưng để hiểu rõ hơn, mình sẽ giải thích nó theo 5 trạng thái.    
Vòng đời của luồng được kiểm soát bởi JVM. các trạng thái như sau:
- new  
- Runnable  
- Running  
- Non-runnable  
- Terminated  

![image](https://user-images.githubusercontent.com/70504465/125232949-ddc6c680-e307-11eb-9859-68e1468ce29e.png)

1, New  
Luồng ở trạng thái new nếu tạo một intance của lớp Thread nhưng trước khi gọi phương thức start()

2, Runnable   
Luồng trong trạng thái Runnable sau khi gọi tới phương thức start()  

3, Running  
Luồng ở trạng thái này khi thread scheduler đã chọn nó  

4, Non-Runnable
Đây là trạng thái khi luồng vẫn còn sống, nhưng không đủ điều kiện để chạy

5, Terminated  
Một luồng đã ở trạng thái này khi phương thức run() của nó thoát