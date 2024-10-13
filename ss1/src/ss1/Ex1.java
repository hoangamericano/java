//package ss1;
//
//import java.util.Scanner;
//
//public class Ex1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//// Phương trình bật 2
//		int a=0;
//		int b=0;
//		int c =0;
//		int delta;
//		boolean flag= true;
//		Scanner sc = new Scanner(System.in);
//		do {
//			
//			try {
//				System.out.println("Nhập a=");
//				a = sc.nextInt();
//			} catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("Chỉ được nhập kí tự số, xin hãy nhập lại");
//				sc.next();
//			}
//			try {
//				System.out.println("nhập b= ");
//				b = sc.nextInt();
//			} catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("Chỉ được nhập kí tự số, xin hãy nhập lại");
//				sc.next();
//			}
//			try {
//				System.out.println("nhập c= ");
//				c = sc.nextInt();
//			} catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("Chỉ được nhập kí tự số, xin hãy nhập lại");
//				sc.next();
//			}
//			delta = b * b - 4 * a * c;
//			if (delta < 0) {
//				System.out.println("Phương trình vô nghiệm");
//			}
//			if (delta == 0) {
//				int x = -b / (2 * a);
//				System.out.println("Phương trình có nghiệm kép");
//				System.out.println("X1=X2= " + x);
//			}
//			if (delta > 0) {
//				System.out.println("Phương trình có 2 nghiệm riêng biệt");
//				int x1, x2;
//				x1 = (-b + delta) / (2 * a);
//				x2 = (-b - delta) / (2 * a);
//				System.out.println("X1= " + x1 + ", " + "X2= " + x2);
//			}
//		} while (a == 0);
//		
//		
//		
//
//	}
//}
package ss1;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        // Khai báo các biến
        int a = 0, b = 0, c = 0;
        double delta;
        Scanner sc = new Scanner(System.in);

        // Nhập giá trị cho biến a, b, c với kiểm tra lỗi
        a = inputIntValue("Nhập a (khác 0): ", sc, true);
        b = inputIntValue("Nhập b: ", sc, false);
        c = inputIntValue("Nhập c: ", sc, false);

        // Tính delta và xét nghiệm của phương trình
        delta = b * b - 4.0 * a * c; // Sử dụng 4.0 để ép kiểu double cho phép tính chính xác
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (delta == 0) {
            double x = -b / (2.0 * a);
            System.out.println("Phương trình có nghiệm kép: X1 = X2 = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm riêng biệt");
            System.out.println("X1 = " + x1 + ", X2 = " + x2);
        }

        // Đóng Scanner sau khi sử dụng
        sc.close();
    }

    /**
     * Phương thức nhập vào giá trị số nguyên với kiểm tra ngoại lệ và điều kiện ràng buộc.
     * 
     * @param message     Thông báo nhập giá trị
     * @param sc          Đối tượng Scanner để đọc đầu vào
     * @param isANonZero  Điều kiện kiểm tra nếu cần nhập a phải khác 0
     * @return Giá trị số nguyên đã được kiểm tra
     */
    public static int inputIntValue(String message, Scanner sc, boolean isANonZero) {
        int value = 0; // Khởi tạo biến lưu giá trị
        boolean isValid = false; // Biến đánh dấu việc nhập liệu có hợp lệ hay không

        do {
            try {
                System.out.print(message);
                value = sc.nextInt();
                if (isANonZero && value == 0) { // Điều kiện kiểm tra nếu a phải khác 0
                    System.out.println("Giá trị a không được bằng 0, vui lòng nhập lại.");
                } else {
                    isValid = true; // Dữ liệu hợp lệ, thoát khỏi vòng lặp
                }
            } catch (Exception e) {
                System.out.println("Chỉ được nhập kí tự số, xin hãy nhập lại.");
                sc.next(); // Loại bỏ dữ liệu không hợp lệ để tránh vòng lặp vô tận
            }
        } while (!isValid); // Tiếp tục vòng lặp cho đến khi giá trị hợp lệ

        return value; // Trả về giá trị số nguyên đã nhập
    }
}

