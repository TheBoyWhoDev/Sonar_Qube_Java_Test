import java.util.List;
import java.util.Scanner;

class Subject {
    public String mamh;
    public String tenmh;
    public int sotin;
}

class Student {
    public String masv;
    public String ten;
    public int somh;
}

class Invoice {
    public Student a;
    public List<Subject> b;
    public String quyDinh;
    public int hocPhi;
    public int tongTin;
    public int tongThu;
}

class PaymentController {
    public Invoice getInvoice() {
        Scanner input = new Scanner(System.in);
        Invoice c = new Invoice();
        c.a.masv = input.nextLine();
        c.a.ten = input.nextLine();
        c.a.somh = input.nextLine();
        for (int i = 1; i <= c.a.somh; i++) {
            Subject subject = new Subject();
            subject.mamh = input.nextLine();
            subject.tenmh = input.nextLine();
            subject.sotin = input.nextInt();
            c.b.add(subject);
            c.tongTin = c.tongTin + subject.sotin;
        }
        c.quyDinh = input.nextLine();
        c.hocPhi = input.nextInt();
        c.tongThu = c.tongTin * c.hocPhi;
        input.close();
        return c;
    }
}

public class dongtien {
    public static void main(String[] args) {
        PaymentController pc = new PaymentController();
        // Output for test
        Invoice invoice = pc.getInvoice();
        // InvoiceView.show(invoice);
    }
}