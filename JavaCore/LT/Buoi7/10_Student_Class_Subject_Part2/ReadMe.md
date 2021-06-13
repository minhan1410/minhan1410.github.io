# Nội dung buổi số 2 Student - Class - Subject - Teacher

Phân tích bài toán, yêu cầu - Requirement Analysis

Who: ai dùng, ai bị tác động, ai được hưởng lợi, ai tham gia, ai chịu trách nhiệm, ai bị liên quan

What: cái gì? dữ liệu nhập là gì? bán cái gì? tác động lên cái gì?

How: làm như thế nào? Nhập dữ liệu bằng giao diện web, hoặc di động

Where: ở đâu?  ứng dụng cài đặt ở đâu? Người dùng sử dụng nó ở đâu?
Đặc thù địa điểm ở vùng sâu, vùng xa. Ở nơi bảo mật cực cao, không có truy cập Internet.

When: khi nào? chú ý những thời điểm đặc biệt như: ngày lễ, tết.

How many: số lượng danh mục mặt hàng. 6 mặt hàng sẽ khác nhiều với 30,000 mặt hàng. Quản lý trung tâm đào tạo 100 sinh viên sẽ rất khác quản lý trường đại học 10,000 sinh viên.

## Áp dụng thực tế vào bài toán quản lý một trường cấp 3
1. Một lớp học có sinh viên học. Lớp giải tán nhưng sinh viên vẫn tồn tại.
2. Một sinh viên học nhiều môn. Một số môn bắt buộc, và một số tuỳ chọn.
3. Điểm số cho sinh viên từ 0..10
4. Một trường, ở một niên khoá có nhiều lớp học đặt tên 10A, 10B, 10C...10A, 11A...11F, 12A...12F

------- Đây là business rule mô tả hoạt động lớp học
Ở mỗi lớp, có từ 20-45 sinh viên học.
Mỗi sinh viên học một số môn bắt buộc và một số môn tuỳ chọn.
Một giáo viên có thể dạy vài môn học.
Một giáo viên có thể dạy vài lớp.
Trong một môn học, mỗi sinh viên sẽ phải tham gia vài lần kiểm tra, một lần kiểm tra giữa kỳ, một kiểm tra cuối kỳ.
Một lần kiểm tra, nếu sinh viên tham gia sẽ nhận được một điểm từ 0..10.
