﻿# Flyweight Pattern

- Mẫu thiết kế này gọi là **`“hạng ruồi”`** flyweight nguyên do thay vì phải làm việc với `nhiều đối tượng độc lập, to lớn`, bạn giảm bớt kích thước chúng bằng việc `tạo một tập hợp các đối tượng dùng chung nhỏ hơn`, gọi là `flyweights` mà bạn có thể cài đặt vào lúc thực thi chương trình để chúng trông giống như những đối tượng lớn hơn. Mỗi đối tượng to lớn có thể tiêu tốn nhiều tài nguyên hệ thống, bằng cách `tách những điểm giống nhau của các đối tượng này`, và dựa trên việc `cấu hình thời gian thực` để mô phỏng lại các đối tượng lớn, bạn đã làm giảm bớt gánh nặng lên tài nguyên hệ thống.

- Bạn có thể đem những phần riêng biệt ra khỏi mã nguồn của những đối tượng to lớn và tạo ra những đối tượng flyweight. Khi làm điều này, bạn đã chấm dứt việc sử dụng nhiều đối tượng có chung các đặc điểm, và giảm xuống việc chỉ sử dụng một đối tượng, có thể cài đặt khi chương trình thực thi, mô phỏng lại cả tập hợp các đối tượng to lớn ban đầu.
- #### Xử lý vấn đề đa luồng:
Mẫu flyweight được sử dụng để kiểm soát việc tạo dựng đối tượng, nhưng bạn lưu ý rằng nó cũng bị chung một vấn đế với mẫu Singleton mà chúng ta đã nhắc tới. Nếu mã nguồn của bạn có sử dụng đa luồng, bạn có thể tránh việc tạo ra quá nhiều đối tượng flyweight bằng cách tách rời quá trình tạo đối tượng ra khỏi toán tử new như đã từng làm với mẫu Singleton. Bạn có thể tạo đối tượng flyweight ngay khi lớp được nạp lần đầu tiên, ngăn cản
việc truy xuất hàm khởi dựng bằng cách gán cho nó một truy cập cục bộ, và cho phép việc tạo đối tượng thông qua hàm getInstance.

>**Note:** Mấu flyweight có hạn chế là bạn sẽ mất thêm thời gian để cài đặt một đối tượng flyweight và nếu bạn phải cài đặt bao bọc mọi thứ, bạn có thể sẽ làm giảm hiệu năng hệ thống nhiều hơn mong đợi. Một hạn chế nữa là: bởi vì bạn tách một lớp mẫu chung ra khỏi đối tượng để tạo flyweight, bạn phải thêm vào một lớp khác trong việc lập trình, và có thể gây ra sự khó khăn trong việc bảo trì và mở rộng. 
 
 
