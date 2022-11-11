package BTBuoi5;

import java.util.Date;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
       int ngay, thang, nam;
        Scanner scanner = new Scanner(System.in);
        ngay = scanner.nextInt();
        thang = scanner.nextInt();
        nam = scanner.nextInt();
        if (ngay > 0 && ngay <= 31 && thang > 0 && thang <= 12 && nam > 1989 && nam <= 2020) {
           System.out.println(ngay + "/" + thang + "/" + nam);

       } else {
          IllegalArgumentException ecx;
            System.out.println("Nhập sai dữ liệu");
      }





    }
}
