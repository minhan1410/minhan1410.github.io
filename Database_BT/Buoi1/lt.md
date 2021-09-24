## Tạo database

```sql
CREATE DATABASE library;
```

## Tạo bảng

```sql
CREATE TABLE book(
	book_id int PRIMARY KEY,
    title TEXT NOT NULL,
    author VARCHAR(30) NULL,
    category VARCHAR(50),
    publication_date DATE
);
```

## SỬa bảng
**Thêm cột**
```sql
ALTER TABLE book_id
ADD publishing_company TEXT;
```

**Xóa cột**
```sql
ALTER TABLE book
DROP COLUMN author;
```

**Sửa tên cột**
```sql
ALTER TABLE book
CHANGE publication_date publishing_date DATE;
```

**ĐỔi kiểu dữ liệu**
```sql
ALTER TABLE book
MODIFY COLUMN category TEXT;
```

## DROP
**DROP TABLE**
```sql
DROP TABLE table_name;
```

**DROP DATABASE**
```sql
DROP DATABASE test;
```

## Thêm dữ liệu

```sql
INSERT INTO book(book_id, title, category, publishing_date, publishing_company) 
VALUES (1, 'book', 'action', '2001-12-12', 'company')
```

Có thể sử dụng mockaroo