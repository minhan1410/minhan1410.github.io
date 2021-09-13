## LocalDate
LocalDate đại diện cho ngày (year, month, day (yyyy-MM-dd))

## Khởi tạo LocalDate
- `now()` dùng để lấy ngày hiện tại
- `of()` dùng để truyền một ngày mà ta mong muốn
- `ZoneId` truyền timezone khi khởi tạo

## Lấy ngày, tháng, năm từ LocalDate
Lấy ngày ta sử dụng các phương thức:
- `getDayOfWeek()` : in ra các ngày trong tuần như MONDAY, SUNDAY, TUESDAY,...
- `getDayOfMonth()` : in ra ngày trong tháng
- `getDayOfYear()` : in ra số ngày tính theo năm. VD: tính đến ngày 25/4/2021 là 115 ngày

Lấy tháng ta sử dụng các phương thức:
- `getMonth()` : in ra tháng VD: APRIL, AUGUST, MAY,...
- `getMonthValue()` : in ra tháng nhưng là số VD: 2, 4, 12,...

Lấy năm ta sử dụng phương thức:
- `getYear()` : in ra năm

## Cộng và trừ ngày tháng năm trong LocalDate
LocalDate có sẵn các method plus(), minus() tương ứng với ngày tháng năm để thực hiện thao tác cộng trừ trong LocalDate Object

## So sánh LocalDate Object
- Phương thức isEqual(): Trả về true nếu LocalDate object hiện tại bằng với other, ngược lại là false
- Phương thức isAfter(): Trả về true nếu LocalDate object có giá trị lớn hơn LocalDate other truyền vào và ngược lại là false
- Phương thức isBefore(): Trả về true nếu LocalDate object có giá trị nhỏ hơn LocalDate other truyền vào và ngược lại là false
- Phương thức compareTo(): Trả về số dương nếu object hiện tại lớn hơn other, 0 nếu bằng nhau và số âm nếu ngược lại