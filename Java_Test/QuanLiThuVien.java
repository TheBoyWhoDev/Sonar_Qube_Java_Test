import java.util.Scanner;

public class QuanLiThuVien {
    public static class TaiLieu {
        protected String ma;
        protected String tenNhaXB;
        protected int soBanPH;
        protected int soAnPham;
        protected static int so = 0;

        public TaiLieu() {
            this.ma = "";
            this.tenNhaXB = "";
            this.soBanPH = 0;
            this.soAnPham = 0;
        }

        public TaiLieu(String tenNhaXB, int soBanPH) {
            this.tenNhaXB = tenNhaXB;
            this.soBanPH = soBanPH;
        }

        public void setMa() {
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            this.ma = s;
        }

        public String getMa() {
            return this.ma;
        }

        public void setMa(String ma) {
            this.ma = ma;
        }

        public String getTenNhaXB() {
            return this.tenNhaXB;
        }

        public void setTenNhaXB(String tenNhaXB) {
            this.tenNhaXB = tenNhaXB;
        }

        public int getSoBanPH() {
            return this.soBanPH;
        }

        public void setSoBanPH(int soBanPH) {
            this.soBanPH = soBanPH;
        }
    }

    public interface ITaiLieu {
        int getSoAnPham();
    }

    public static class TapChi extends TaiLieu implements ITaiLieu {

        private String thang;

        public TapChi() {
            this.thang = "";
        }

        public TapChi(String tenNhaXB, int soBanPH, String thang) {
            this.tenNhaXB = tenNhaXB;
            this.soBanPH = soBanPH;
            this.thang = thang;
        }

        public String getThang() {
            return this.thang;
        }

        public void setThang(String thang) {
            this.thang = thang;
        }

        @Override
        public String toString() {
            return ma + " " + tenNhaXB + " " + soBanPH + " " + thang + " " + soAnPham;
        }

        @Override
        public int getSoAnPham() {
            return this.soAnPham;
        }

        @Override
        public void setMa() {
            if (this.soBanPH >= 0 && this.soBanPH <= 100)
                this.soAnPham = this.soBanPH * 2 / 100;
            if (this.soBanPH >= 101 && this.soBanPH <= 200)
                this.soAnPham = this.soBanPH * 5 / 100;
            if (this.soBanPH > 200)
                this.soAnPham = this.soBanPH * 8 / 100;
            if (this.tenNhaXB == "KHCNTT TT")
                this.soAnPham = this.soAnPham * 102 / 100;
            String[] words = this.tenNhaXB.split("\\s+");
            StringBuilder result = new StringBuilder();
            for (String word : words) {
                if (!word.isEmpty()) {
                    result.append(word.charAt(0));
                }
            }
            TaiLieu.so++;
            String num = String.format("%03d", TaiLieu.so);
            this.ma = result.toString().toUpperCase() + num;
        }
    }

    public static class Sach extends TaiLieu implements ITaiLieu {

        private String tenSach;
        private String tenTG;
        private int soTrang;

        public Sach() {
            this.tenSach = "";
            this.tenTG = "";
            this.soTrang = 0;
        }

        public Sach(String tenSach, String tenTG, String tenNhaXB, int soTrang, int soBanPH) {
            this.tenSach = tenSach;
            this.tenTG = tenTG;
            this.tenNhaXB = tenNhaXB;
            this.soTrang = soTrang;
            this.soBanPH = soBanPH;
        }

        public String getTenSach() {
            return this.tenSach;
        }

        public String getTenTG() {
            return this.tenTG;
        }

        public int getSoTrang() {
            return this.soTrang;
        }

        public void setTenSach(String tenSach) {
            this.tenSach = tenSach;
        }

        public void setTenTG(String tenTG) {
            this.tenTG = tenTG;
        }

        public void setSoTrang(int soTrang) {
            this.soTrang = soTrang;
        }

        @Override
        public String toString() {
            return ma + " " + tenSach + " " + tenTG + " " + tenNhaXB + " " + soBanPH + " " + soAnPham;
        }

        @Override
        public int getSoAnPham() {
            return this.soAnPham;
        }

        @Override
        public void setMa() {
            if (this.soBanPH >= 0 && this.soBanPH <= 200)
                this.soAnPham = this.soBanPH * 5 / 100;
            if (this.soBanPH >= 201 && this.soBanPH <= 500)
                this.soAnPham = this.soBanPH * 8 / 100;
            if (this.soBanPH > 500)
                this.soAnPham = this.soBanPH * 10 / 100;
            if (this.tenNhaXB == "giao duc")
                this.soAnPham = this.soAnPham * 98 / 100;
            String[] words = this.tenTG.split(" ");
            String lastName = "";
            if (words.length > 0) {
                lastName = words[words.length - 1].toUpperCase();
            }
            TaiLieu.so++;
            String num = String.format("%03d", TaiLieu.so);
            this.ma = lastName + num;
        }
    }

    public static void main(String[] args) {
        TapChi t = new TapChi("KHCNTT TT", 250, "10/2023");
        t.setMa();
        System.out.println(t);
        Sach s = new Sach("LT HDT", "Nguyen manh Son", "giao duc", 220, 1000);
        s.setMa();
        System.out.println(s);
    }
}