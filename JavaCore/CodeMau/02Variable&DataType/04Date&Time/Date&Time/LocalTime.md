# LocalTime
LocalTime biểu diễn thời gian trong của một ngày và không bao gồm thông tin về múi giờ, hay nói cách dễ hiểu LocalTime chính là giờ, phút giây trong một ngày cụ thể. 

### Khởi tạo LocalTime
Để khởi tạo một LocalTime object chúng ta có nhiều cách. Hai cách đơn giản nhất là:  
`LocalTime.now()` : Lấy giờ hiện tại  
`LocalTIme.of()` : Truyền vào một giờ cụ thể

### Truy cập giá trị LocalTime 
Bạn có thể truy cập giờ, phút, giây và nano giây của LocalTime object qua các method: `getHour()`, `getMinute()`, `getSecond()`, `getNano()`.

### plus và minus trong LocalTime
Để cộng trừ giá trị của LocalTime object chúng ta có các method sau:   

`plusHours()`: Cộng giờ  
`minusHours()`: Trừ giờ  
`plusMinutes()`: Cộng phút  
`minusMinutes()`: Trừ phút  
`plusSeconds()`: Cộng giây  
`minusSeconds()`: Trừ giây  
`plusNano()`: Cộng nano giây  
`minusNano()`: Trừ nano giây  