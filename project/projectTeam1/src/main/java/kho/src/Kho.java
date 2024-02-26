
import java.awt.Image;
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Kho extends javax.swing.JFrame {

    public Kho() {
        initComponents();
        init();
    }
    
    public void init() {
        hinhanh();
    }
    
    public void hinhanh() {
        ImageIcon iconlogo = new ImageIcon(getClass().getResource("/hinhanh/logots.jpg"));
        ImageIcon iconmenungang = new ImageIcon(getClass().getResource("/hinhanh/menungang.png"));
        
        Image imglogo = iconlogo.getImage().getScaledInstance(jLabellogo.getWidth(), jLabellogo.getHeight(), Image.SCALE_SMOOTH);
        Image imgmenungang = iconmenungang.getImage().getScaledInstance(jLabelmenungang.getWidth(), jLabelmenungang.getHeight(), Image.SCALE_SMOOTH);
        
        jLabellogo.setIcon(new ImageIcon(imglogo));
        jLabelmenungang.setIcon(new ImageIcon(imgmenungang));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelquanlykho = new javax.swing.JLabel();
        jLabellogo = new javax.swing.JLabel();
        jLabelmenungang = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jComboBoxid = new javax.swing.JComboBox<>();
        jComboBoxten = new javax.swing.JComboBox<>();
        jComboBoxsoluong = new javax.swing.JComboBox<>();
        jComboBoxdongia = new javax.swing.JComboBox<>();
        jComboBoxconlai = new javax.swing.JComboBox<>();
        jComboBoxngaynhap = new javax.swing.JComboBox<>();
        jComboBoxnhacungcap = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jButtonxoa = new javax.swing.JButton();
        jButtonsua = new javax.swing.JButton();
        jButtonthem = new javax.swing.JButton();
        jButtoncapnhat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(252, 208, 171));

        jLabelquanlykho.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabelquanlykho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelquanlykho.setText("QUẢN LÝ KHO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabellogo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelquanlykho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelmenungang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelquanlykho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabellogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabelmenungang, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(199, 134, 95));

        jComboBoxid.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jComboBoxid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "K1", "K2", "K3" }));

        jComboBoxten.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jComboBoxten.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tên", "Trà Lài", "Trà Nho", "Trà Sữa" }));

        jComboBoxsoluong.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jComboBoxsoluong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Số lượng", "<10", "<20", "<30" }));

        jComboBoxdongia.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jComboBoxdongia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đơn giá", "<1 triệu", "<2 triệu", "<3 triệu" }));

        jComboBoxconlai.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jComboBoxconlai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Còn lại", "<10 gói", "<20 gói", "<30 gói" }));

        jComboBoxngaynhap.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jComboBoxngaynhap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ngày nhập", "Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6", "Tháng 7", "Tháng 8", "Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12", " " }));

        jComboBoxnhacungcap.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jComboBoxnhacungcap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhà cung cấp", "Phúc Long Tea", "2 lần Tea", "Katinat", " " }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jComboBoxid, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jComboBoxten, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jComboBoxsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jComboBoxdongia, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jComboBoxconlai, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jComboBoxngaynhap, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jComboBoxnhacungcap, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxid, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxten, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxdongia, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxconlai, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxngaynhap, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxnhacungcap, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(159, 122, 90));

        jButtonxoa.setBackground(new java.awt.Color(215, 227, 77));
        jButtonxoa.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButtonxoa.setText("Xóa");

        jButtonsua.setBackground(new java.awt.Color(215, 227, 77));
        jButtonsua.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButtonsua.setText("Sửa");

        jButtonthem.setBackground(new java.awt.Color(215, 227, 77));
        jButtonthem.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButtonthem.setText("Thêm");

        jButtoncapnhat.setBackground(new java.awt.Color(215, 227, 77));
        jButtoncapnhat.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButtoncapnhat.setText("Cập nhật");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(jButtonxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButtonsua, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButtonthem, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButtoncapnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonsua, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonthem, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtoncapnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tên", "Số lượng", "Đơn giá", "Còn lại", "Ngày nhập", "Nhà cung cấp"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Kho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtoncapnhat;
    private javax.swing.JButton jButtonsua;
    private javax.swing.JButton jButtonthem;
    private javax.swing.JButton jButtonxoa;
    private javax.swing.JComboBox<String> jComboBoxconlai;
    private javax.swing.JComboBox<String> jComboBoxdongia;
    private javax.swing.JComboBox<String> jComboBoxid;
    private javax.swing.JComboBox<String> jComboBoxngaynhap;
    private javax.swing.JComboBox<String> jComboBoxnhacungcap;
    private javax.swing.JComboBox<String> jComboBoxsoluong;
    private javax.swing.JComboBox<String> jComboBoxten;
    private javax.swing.JLabel jLabellogo;
    private javax.swing.JLabel jLabelmenungang;
    private javax.swing.JLabel jLabelquanlykho;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
