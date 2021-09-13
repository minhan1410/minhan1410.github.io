# LocalDateTime
LocalDateTime là sự kết hợp giữa LocalDate và LocalTime. LocalDateTime biểu diễn thời gian chính xác đến từng phút giây được áp dụng cho các trường hợp cần ghi dấu lịch sử etc.  

### Khởi tạo LocalDateTime
Để khởi tạo LocalDateTime object chúng ta có nhiều cách, hai trong số các cách thường được sử dụng là:  
`LocalDateTime.now()`: Lấy ngày và giờ hiện tại
`LocalDateTime.of()` : Truyền vào thời gian chỉ định

### Truy xuất giá trị LocalDateTime
LocalDateTime object có rất nhiều giá trị chúng ta có thể lấy từ ngày, tháng, năm đến giờ, phút giây etc. Chúng ta sẽ cùng nhau điểm qua các method giúp chúng ta lấy các giá trị tương ứng.  

`getYear()`
`getMonth()`
`getDayOfMonth()`
`getDayOfWeek()`
`getDayOfYear()`
`getHour()`
`getMinute()`
`getSecond()`
`getNano()`

### plus và minus trong LocalDateTime
Để cộng trừ các giá trị của LocalDateTime object chúng ta có thể sử dụng các method:

`plusYears()`
`plusMonths()`
`plusDays()`
`plusHours()`
`plusMinutes()`
`plusSeconds()`
`plusNanos()`
`minusYears()`
`minusMonths()`
`minusDays()`
`minusHours()`
`minusMinutes()`
`minusSeconds()`
`minusNanos()`