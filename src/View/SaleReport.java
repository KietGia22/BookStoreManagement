/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JOptionPane;

import Model.BaoCaoDoanhThuModel;
import Model.BaoCaoTonModel;
import Controller.BaoCaoController;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;



/**
 *
 * @author nosc
 */
public class SaleReport extends javax.swing.JFrame {

    int month, year;
    int STT_BCT = 1, STT_BCDT = 1;
    ArrayList<BaoCaoTonModel> list_bctModel = new ArrayList<BaoCaoTonModel>();
    ArrayList<BaoCaoDoanhThuModel> list_bcdtModel = new ArrayList<BaoCaoDoanhThuModel>();
    BaoCaoController bcController = new BaoCaoController();
    String TDN, MK;
    
    public SaleReport() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        int lastYear = bcController.GetMinYear();
        System.out.println(lastYear);
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        for(int i = lastYear; i <= currentYear; i++ ) {
            cbbYear.addItem(String.valueOf(i));
        }

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        tableReportTon.getTableHeader().setDefaultRenderer(centerRenderer);
        tableReportDT.getTableHeader().setDefaultRenderer(centerRenderer);
    }
    
    public SaleReport(String TenDN, String MatKhau) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        int lastYear = bcController.GetMinYear();
        System.out.println(lastYear);
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        for(int i = lastYear; i <= currentYear; i++ ) {
            cbbYear.addItem(String.valueOf(i));
        }

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        tableReportTon.getTableHeader().setDefaultRenderer(centerRenderer);
        tableReportDT.getTableHeader().setDefaultRenderer(centerRenderer);
        
        this.TDN = TenDN;
        this.MK = MatKhau;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbbMonth = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbbYear = new javax.swing.JComboBox<>();
        btnViewReport = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        tabChart = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableReportTon = new javax.swing.JTable();
        tabBookReport = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableReportDT = new javax.swing.JTable();
        QuayLaiBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 100, 100));

        jLabel1.setFont(new java.awt.Font("Serif", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Báo cáo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(332, 332, 332))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );

        jPanel4.setBackground(new java.awt.Color(173, 216, 230));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setText("Tháng");

        cbbMonth.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cbbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng 1", "Tháng 2", "Tháng 3", "Tháng 4", "Tháng 5", "Tháng 6", "Tháng 7", "Tháng 8", "Tháng 9", "Tháng 10", "Tháng 11", "Tháng 12" }));
        cbbMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbMonthActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setText("Năm");

        cbbYear.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cbbYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbYearActionPerformed(evt);
            }
        });

        btnViewReport.setBackground(new java.awt.Color(0, 204, 204));
        btnViewReport.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnViewReport.setText("Xem báo cáo");
        btnViewReport.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnViewReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewReportActionPerformed(evt);
            }
        });

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        tableReportTon.setBackground(new java.awt.Color(0, 204, 204));
        tableReportTon.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tableReportTon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên sách", "Thể loại", "Tồn đầu", "Phát sinh", "Tồn cuối"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableReportTon);

        javax.swing.GroupLayout tabChartLayout = new javax.swing.GroupLayout(tabChart);
        tabChart.setLayout(tabChartLayout);
        tabChartLayout.setHorizontalGroup(
            tabChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
        );
        tabChartLayout.setVerticalGroup(
            tabChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Báo cáo tồn kho", tabChart);

        tableReportDT.setBackground(new java.awt.Color(0, 204, 204));
        tableReportDT.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tableReportDT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên sách", "Thể loại", "Số lượng bán", "Giá tiền", "Tổng tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableReportDT);

        javax.swing.GroupLayout tabBookReportLayout = new javax.swing.GroupLayout(tabBookReport);
        tabBookReport.setLayout(tabBookReportLayout);
        tabBookReportLayout.setHorizontalGroup(
            tabBookReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
        );
        tabBookReportLayout.setVerticalGroup(
            tabBookReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Báo cáo doanh thu", tabBookReport);

        QuayLaiBtn.setBackground(new java.awt.Color(0, 204, 204));
        QuayLaiBtn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        QuayLaiBtn.setText("Quay lại");
        QuayLaiBtn.setMargin(new java.awt.Insets(2, 10, 2, 10));
        QuayLaiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuayLaiBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(cbbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnViewReport)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(QuayLaiBtn)
                .addGap(30, 30, 30))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewReport))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QuayLaiBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbMonthActionPerformed
        month = cbbMonth.getSelectedIndex() + 1;
        System.out.println(month);
    }//GEN-LAST:event_cbbMonthActionPerformed

    private void cbbYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbYearActionPerformed
        year = Integer.parseInt(cbbYear.getSelectedItem().toString());
        System.out.println(year);
    }//GEN-LAST:event_cbbYearActionPerformed

    private void btnViewReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewReportActionPerformed
        DefaultTableModel modelTon = (DefaultTableModel) tableReportTon.getModel();
        DefaultTableModel modelDT = (DefaultTableModel) tableReportDT.getModel();

        // get data for table ReportTon
        for (int i = modelTon.getRowCount() - 1; i >= 0; i--) {
            modelTon.removeRow(i);
        }
        STT_BCT = 1;
        list_bctModel = bcController.GetListBaoCaoTon(month, year);
        if(list_bctModel.size() == 0) {
            JOptionPane.showMessageDialog(null, "Không có dữ liệu báo cáo tồn để hiển thị");
        }
        else {
            for (BaoCaoTonModel bct : list_bctModel) {
                Object[] rowData = new Object[]{STT_BCT, bct.getTenSach(), bct.getTenTheLoai(), bct.getTonDau(), bct.getPhatSinh(), bct.getTonCuoi()};
                modelTon.addRow(rowData);
                STT_BCT++;
            } 
            tableReportTon.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        }     


        // get data for table ReportDT
        for (int i = modelDT.getRowCount() - 1; i >= 0; i--) {
            modelDT.removeRow(i);
        }
        STT_BCDT = 1;
        list_bcdtModel = bcController.GetListBaoCaoDoanhThu(month, year);
        if(list_bcdtModel.size() == 0) {
            JOptionPane.showMessageDialog(null, "Không có dữ liệu báo cáo doanh thu để hiển thị");
        }
        else {
            for (BaoCaoDoanhThuModel bcdt : list_bcdtModel) {
                Object[] rowData = new Object[]{STT_BCDT, bcdt.getTenSach(), bcdt.getTenTheLoai(), bcdt.getSoLuong(), bcdt.getGiaTien(), bcdt.getTongTien()};
                modelDT.addRow(rowData);
                STT_BCDT++;
            } 
        }

        System.out.println(list_bctModel.size());
        System.out.println(list_bcdtModel.size());
    }//GEN-LAST:event_btnViewReportActionPerformed

    private void QuayLaiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuayLaiBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        new Home(TDN, MK);
    }//GEN-LAST:event_QuayLaiBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args) {
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
            java.util.logging.Logger.getLogger(SaleReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaleReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaleReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaleReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaleReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton QuayLaiBtn;
    private javax.swing.JButton btnViewReport;
    private javax.swing.JComboBox<String> cbbMonth;
    private javax.swing.JComboBox<String> cbbYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel tabBookReport;
    private javax.swing.JPanel tabChart;
    private javax.swing.JTable tableReportDT;
    private javax.swing.JTable tableReportTon;
    // End of variables declaration//GEN-END:variables
}
