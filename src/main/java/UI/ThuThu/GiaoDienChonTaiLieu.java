/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.ThuThu;

import Entity.Muon;
import Entity.TaiLieu;
import java.awt.Color;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tinhlam
 */
public class GiaoDienChonTaiLieu extends javax.swing.JFrame {

    ArrayList<TaiLieu> ds;
    
    public GiaoDienChonTaiLieu() {
        initComponents();
        setup();
        loadDefaultList();
    }
    
    private void setup() {
        final Color BLUE_COLOR = new Color(51, 102, 255, 255);
        final Color WHITE_COLOR = new Color(255, 255, 255, 255);

        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(BLUE_COLOR);
        headerRenderer.setForeground(WHITE_COLOR);
        headerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < jTable1.getModel().getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        jTable1.setGridColor(BLUE_COLOR);
        jTable1.setForeground(BLUE_COLOR);
        jTable1.setShowGrid(true);
        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    }

    public void loadDefaultList() {
    }

    private void renderTable() {
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        model.setRowCount(0);
//        for (Muon m : ds) {
//            String sh = String.valueOf(m.getDocGia().getSoHieu());
//            String tgtdk = m.getThoiGianTraDuKien().format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss"));
//            model.addRow(new Object[]{false, sh, tgtdk});
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        huyBtn = new javax.swing.JButton();
        okBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        timBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        soHieuTf = new javax.swing.JTextField();
        sachBtn = new javax.swing.JRadioButton();
        tapChiBtn = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(723, 450));

        huyBtn.setBackground(new java.awt.Color(204, 204, 204));
        huyBtn.setForeground(new java.awt.Color(51, 102, 255));
        huyBtn.setText("Hủy");
        huyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huyBtnActionPerformed(evt);
            }
        });

        okBtn.setBackground(new java.awt.Color(51, 102, 255));
        okBtn.setForeground(new java.awt.Color(255, 255, 255));
        okBtn.setText("OK");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        timBtn.setBackground(new java.awt.Color(51, 102, 255));
        timBtn.setForeground(new java.awt.Color(255, 255, 255));
        timBtn.setText("Tìm");
        timBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 102, 255));
        jLabel6.setText("Số hiệu tài liệu");

        soHieuTf.setForeground(new java.awt.Color(0, 0, 0));
        soHieuTf.setEnabled(false);

        sachBtn.setForeground(new java.awt.Color(51, 102, 255));
        sachBtn.setSelected(true);
        sachBtn.setText("Sách");
        sachBtn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sachBtnItemStateChanged(evt);
            }
        });

        tapChiBtn.setForeground(new java.awt.Color(51, 102, 255));
        tapChiBtn.setText("Tạp Chí");
        tapChiBtn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tapChiBtnsachBtnItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(okBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(huyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
            .addComponent(jScrollPane1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sachBtn)
                    .addComponent(tapChiBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(soHieuTf, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(timBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(sachBtn)
                        .addGap(18, 18, 18)
                        .addComponent(tapChiBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(soHieuTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(timBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(huyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void huyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huyBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_huyBtnActionPerformed

    private void timBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timBtnActionPerformed

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_okBtnActionPerformed

    private void sachBtnItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sachBtnItemStateChanged
//        if (sachBtn.isSelected()) {
//            ds = new Sach().layDanhSach();
//            jLabel4.setText("Thể loại");
//        } else {
//            ds = new TapChi().layDanhSach();
//            jLabel4.setText("Lĩnh vực");
//        }
//        renderTable();
    }//GEN-LAST:event_sachBtnItemStateChanged

    private void tapChiBtnsachBtnItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tapChiBtnsachBtnItemStateChanged
//        if (sachBtn.isSelected()) {
//            ds = new Sach().layDanhSach();
//            jLabel4.setText("Thể loại");
//        } else {
//            ds = new TapChi().layDanhSach();
//            jLabel4.setText("Lĩnh vực");
//        }
//        renderTable();
    }//GEN-LAST:event_tapChiBtnsachBtnItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton huyBtn;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton okBtn;
    private javax.swing.JRadioButton sachBtn;
    private javax.swing.JTextField soHieuTf;
    private javax.swing.JRadioButton tapChiBtn;
    private javax.swing.JButton timBtn;
    // End of variables declaration//GEN-END:variables
}
