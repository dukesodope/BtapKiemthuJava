# BtapKiemthuJava
Trần Trung Đức - 22SE1.1 - BIT220204

Kiểm thử một lớp xử lý toán học đơn giản:  các phép toán cơ bản như cộng, trừ, nhân, chia
https://chatgpt.com/share/677b3e46-2d50-8013-bacb-b7e11d46d4e2
![image](https://github.com/user-attachments/assets/05e81cd3-3b4e-42ee-9082-999b19f66a3e)
Lớp MathUtils
- Đây là lớp chính thực hiện các phép toán cơ bản: cộng, trừ, nhân, chia.
- Phương thức divide kiểm tra lỗi chia cho 0 và ném ra ngoại lệ IllegalArgumentException.
  ![image](https://github.com/user-attachments/assets/110075d0-9577-40b6-80c2-92668cef42a8)
Lớp MathUtilsTest - Dùng JUnit 5 để viết các trường hợp kiểm thử đơn vị.
Các phương thức kiểm thử:
- assertEquals(expected, actual): Kiểm tra kết quả thực tế có khớp với kết quả mong đợi không.
- assertThrows(exceptionClass, executable): Kiểm tra nếu một ngoại lệ được ném ra đúng như mong đợi.
![image](https://github.com/user-attachments/assets/c18ec485-3295-44c9-b06b-73f9fce31b22)
Các trường hợp kiểm thử
 - testAdd: Kiểm tra cộng 2 số nguyên dương và âm.
 - testSubtract: Kiểm tra trừ 2 số.
 - testMultiply: Kiểm tra nhân 2 số.
 - testDivide: Kiểm tra phép chia và trường hợp chia cho 0.
