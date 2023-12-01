import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainApp {
    private JFrame frame;
    private JTable table;
    private DefaultTableModel tableModel;
    private JTextField tfMaPV, tfHoTen, tfDiaChi, tfLoaiPV;
    private JButton btnNhapPV, btnXoaPV;
    private JTextField tfMaKBV, tfTenKBV, tfDonGia;
    private JButton btnNhapKBV, btnSuaKBV;
    private JTextField tfTimKiem;
    private JButton btnTimKiem;
    private JButton btnLapBangCong, btnTinhThuNhap;

    public MainApp() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Quản lý phóng viên");
        frame.setBounds(100, 100, 800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout(0, 0));

        JPanel panelNhapXoaPV = new JPanel();
        frame.getContentPane().add(panelNhapXoaPV, BorderLayout.NORTH);

        tableModel = new DefaultTableModel();
        tableModel.addColumn("ma pv");
        tableModel.addColumn("ho ten");
        tableModel.addColumn("dia chi");
        tableModel.addColumn("loai pv");

        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        JPanel panelNhapSuaKBV = new JPanel();
        frame.getContentPane().add(panelNhapSuaKBV, BorderLayout.SOUTH);

        JPanel panelTimKiem = new JPanel();
        frame.getContentPane().add(panelTimKiem, BorderLayout.WEST);

        JPanel panelCongThuNhap = new JPanel();
        frame.getContentPane().add(panelCongThuNhap, BorderLayout.EAST);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainApp();
        });
    }
}
