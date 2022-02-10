# **Kiến trúc trong Spring Boot**

Kiến trúc MVC trong Spring Boot được xây dựng dựa trên tư tưởng **độc lập** kết hợp với các nguyên lý thiết kế hướng đối tượng (một đại diện tiêu biểu là Dependency Inversion). Độc lập ở đây ám chỉ việc các layer phục vụ các mục đích nhất định, khi muốn thực hiện một công việc ngoài phạm vi thì sẽ đưa công việc xuống các layer thấp hơn.

Kiến trúc **Controller** - **Service** - **Repository** chia project thành 3 lớp:
![Kiến trúc Controller-Service - Repository chia project thành 3 lớp](https://super-static-assets.s3.amazonaws.com/8a72ee8e-d4aa-4a06-985f-e92802c5bc44/images/f5ff73d5-5bd6-4d03-a0e1-da9418ec9a70.png?w=1500&f=webp)

**Consumer Layer hay Controller**: `là tầng giao tiếp với bên ngoài và handler các request từ bên ngoài tới hệ thống`.

**Service Layer**: `Thực hiện các nghiệp vụ và xử lý logic`

**Repository Layer**: `Chịu trách nhiệm giao tiếp với các DB, thiết bị lưu trữ, xử lý query và trả về các kiểu dữ liệu mà tầng Service yêu cầu.`
