/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.NhanVienNhapLieu;

import Entity.DatTruoc;
import Entity.DongDatTruoc;
import Entity.Sach;
import Entity.TaiLieu;
import Entity.TapChi;
import java.awt.Color;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tinhlam
 */
public class GiaoDienQLTaiLieu extends javax.swing.JFrame {

    JFrame parent;
    ArrayList<TaiLieu> ds;
    DefaultTableCellRenderer headerRenderer;

    /**
     * Creates new form GiaoDienQLTaiLieu
     */
    public GiaoDienQLTaiLieu(JFrame parent) {
        this.parent = parent;
        initComponents();
        setup();
        loadDefaultList(new Sach());
        renderTable();
    }

    private void setup() {
        final Color BLUE_COLOR = new Color(51, 102, 255, 255);
        final Color WHITE_COLOR = new Color(255, 255, 255, 255);

        headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(BLUE_COLOR);
        headerRenderer.setForeground(WHITE_COLOR);
        headerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < jTable1.getModel().getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
            jTable1.getColumnModel().getColumn(i).setPreferredWidth(150);
        }
        jTable1.setGridColor(BLUE_COLOR);
        jTable1.setForeground(BLUE_COLOR);
        jTable1.setShowGrid(true);
        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
    }
    
    public void loadDefaultList(TaiLieu tl){
        if (tl instanceof Sach){
            ds = new Sach().layDanhSach();
        }else {
            ds = new TapChi().layDanhSach();
        }
    }

    public void renderTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        model.setColumnIdentifiers(Sach.getProperties());
        for (int i = 0; i < jTable1.getModel().getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
            jTable1.getColumnModel().getColumn(i).setPreferredWidth(150);
        }
        for (TaiLieu tl : ds) {
            if (tl instanceof Sach) {
                Sach sach = (Sach) tl;
                model.addRow(sach.getValues());
            }else {
                TapChi tapChi = (TapChi)tl;
                model.addRow(tapChi.getValues());
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        topLb = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        centerPanel = new javax.swing.JPanel();
        centerTopPanel = new javax.swing.JPanel();
        themBtn = new javax.swing.JButton();
        tenTf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        timTheoTenBtn = new javax.swing.JButton();
        sachBtn = new javax.swing.JRadioButton();
        tapChiBtn = new javax.swing.JRadioButton();
        suaBtn = new javax.swing.JButton();
        xoaBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        TLORLVTf = new javax.swing.JTextField();
        timTheoTLORLVBtn = new javax.swing.JButton();
        centerCenterPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainPanel.setLayout(new java.awt.BorderLayout());

        topPanel.setBackground(new java.awt.Color(51, 102, 255));
        topPanel.setPreferredSize(new java.awt.Dimension(1000, 100));

        topLb.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        topLb.setForeground(new java.awt.Color(255, 255, 255));
        topLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        topLb.setText("Quản Lý Tài Liệu");

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(51, 102, 255));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/go_back.png"))); // NOI18N
        backBtn.setText("Trở Về");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(topLb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(176, 176, 176))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addComponent(topLb, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addGap(2, 2, 2))
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(topPanel, java.awt.BorderLayout.PAGE_START);

        centerPanel.setPreferredSize(new java.awt.Dimension(1000, 700));
        centerPanel.setLayout(new java.awt.BorderLayout());

        centerTopPanel.setBackground(new java.awt.Color(255, 255, 255));
        centerTopPanel.setPreferredSize(new java.awt.Dimension(1000, 100));

        themBtn.setBackground(new java.awt.Color(51, 102, 255));
        themBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        themBtn.setForeground(new java.awt.Color(255, 255, 255));
        themBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        themBtn.setText("Thêm");
        themBtn.setBorder(null);
        themBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setText("Tên");

        timTheoTenBtn.setBackground(new java.awt.Color(51, 102, 255));
        timTheoTenBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        timTheoTenBtn.setForeground(new java.awt.Color(255, 255, 255));
        timTheoTenBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        timTheoTenBtn.setText("Tìm");
        timTheoTenBtn.setBorder(null);
        timTheoTenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timTheoTenBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(sachBtn);
        sachBtn.setForeground(new java.awt.Color(51, 102, 255));
        sachBtn.setSelected(true);
        sachBtn.setText("Sách");
        sachBtn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sachBtnItemStateChanged(evt);
            }
        });

        buttonGroup1.add(tapChiBtn);
        tapChiBtn.setForeground(new java.awt.Color(51, 102, 255));
        tapChiBtn.setText("Tạp Chí");
        tapChiBtn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sachBtnItemStateChanged(evt);
            }
        });

        suaBtn.setBackground(new java.awt.Color(51, 102, 255));
        suaBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        suaBtn.setForeground(new java.awt.Color(255, 255, 255));
        suaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit.png"))); // NOI18N
        suaBtn.setText("Sửa");
        suaBtn.setBorder(null);
        suaBtn.setPreferredSize(new java.awt.Dimension(85, 30));
        suaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaBtnActionPerformed(evt);
            }
        });

        xoaBtn.setBackground(new java.awt.Color(51, 102, 255));
        xoaBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        xoaBtn.setForeground(new java.awt.Color(255, 255, 255));
        xoaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        xoaBtn.setText("Xóa");
        xoaBtn.setBorder(null);
        xoaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 255));
        jLabel4.setText("Thể Loại");

        timTheoTLORLVBtn.setBackground(new java.awt.Color(51, 102, 255));
        timTheoTLORLVBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        timTheoTLORLVBtn.setForeground(new java.awt.Color(255, 255, 255));
        timTheoTLORLVBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        timTheoTLORLVBtn.setText("Tìm");
        timTheoTLORLVBtn.setBorder(null);
        timTheoTLORLVBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timTheoTLORLVBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout centerTopPanelLayout = new javax.swing.GroupLayout(centerTopPanel);
        centerTopPanel.setLayout(centerTopPanelLayout);
        centerTopPanelLayout.setHorizontalGroup(
            centerTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerTopPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(centerTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sachBtn)
                    .addComponent(tapChiBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(themBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(suaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(xoaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tenTf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timTheoTenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TLORLVTf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timTheoTLORLVBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        centerTopPanelLayout.setVerticalGroup(
            centerTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, centerTopPanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(centerTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(centerTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(TLORLVTf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(timTheoTLORLVBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(timTheoTenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tenTf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(xoaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(suaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(themBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(centerTopPanelLayout.createSequentialGroup()
                        .addComponent(sachBtn)
                        .addGap(18, 18, 18)
                        .addComponent(tapChiBtn)))
                .addGap(23, 23, 23))
        );

        centerPanel.add(centerTopPanel, java.awt.BorderLayout.PAGE_START);

        centerCenterPanel.setBackground(new java.awt.Color(255, 255, 255));
        centerCenterPanel.setPreferredSize(new java.awt.Dimension(1000, 700));
        centerCenterPanel.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setOpaque(false);
        jTable1.setSelectionBackground(new java.awt.Color(51, 204, 255));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);

        centerCenterPanel.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        centerPanel.add(centerCenterPanel, java.awt.BorderLayout.CENTER);

        mainPanel.add(centerPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.parent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void themBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themBtnActionPerformed
        TaiLieu taiLieu = (sachBtn.isSelected()) ? new Sach() : new TapChi();
        GiaoDienThemTaiLieu form = new GiaoDienThemTaiLieu(this, taiLieu);
        form.setVisible(true);
    }//GEN-LAST:event_themBtnActionPerformed

    private void timTheoTenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timTheoTenBtnActionPerformed
        if (tenTf.getText().equals("")) {
            if (sachBtn.isSelected()) {
                ds = new Sach().layDanhSach();
            } else {
                ds = new TapChi().layDanhSach();
            }
            renderTable();
            return;
        }
        if (sachBtn.isSelected()) {
            ds = new Sach().timKiemTheoTen(tenTf.getText());
        } else {
            ds = new TapChi().timKiemTheoTen(tenTf.getText());
        }
        renderTable();
    }//GEN-LAST:event_timTheoTenBtnActionPerformed

    private void suaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaBtnActionPerformed
        int row = jTable1.getSelectedRow();
        GiaoDienSuaTaiLieu form = new GiaoDienSuaTaiLieu(this, ds.get(row));
        form.setVisible(true);
    }//GEN-LAST:event_suaBtnActionPerformed

    private void xoaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaBtnActionPerformed
        int row = jTable1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Dữ liệu chọn không hợp lệ");
            return;
        }
        int op = JOptionPane.showConfirmDialog(this, "Xác nhận xóa", "Xác nhận", JOptionPane.OK_CANCEL_OPTION);
        if (op == JOptionPane.OK_OPTION) {
            ds.get(row).xoa();
            if (sachBtn.isSelected()) {
                ds = new Sach().layDanhSach();
            } else {
                ds = new TapChi().layDanhSach();
            }
            renderTable();
        }
    }//GEN-LAST:event_xoaBtnActionPerformed

    private void timTheoTLORLVBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timTheoTLORLVBtnActionPerformed
        if (TLORLVTf.getText().equals("")) {
            if (sachBtn.isSelected()) {
                ds = new Sach().layDanhSach();
            } else {
                ds = new TapChi().layDanhSach();
            }
            renderTable();
            return;
        }
        if (sachBtn.isSelected()) {
            ds = new Sach().timKiemTheoTheLoai(TLORLVTf.getText());
        } else {
            ds = new TapChi().timKiemTheoLinhVuc(TLORLVTf.getText());
        }
        renderTable();
    }//GEN-LAST:event_timTheoTLORLVBtnActionPerformed

    private void sachBtnItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sachBtnItemStateChanged
        if (sachBtn.isSelected()) {
            ds = new Sach().layDanhSach();
            jLabel4.setText("Thể loại");
        } else {
            ds = new TapChi().layDanhSach();
            jLabel4.setText("Lĩnh vực");
        }
        renderTable();
    }//GEN-LAST:event_sachBtnItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TLORLVTf;
    private javax.swing.JButton backBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel centerCenterPanel;
    private javax.swing.JPanel centerPanel;
    private javax.swing.JPanel centerTopPanel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JRadioButton sachBtn;
    private javax.swing.JButton suaBtn;
    private javax.swing.JRadioButton tapChiBtn;
    private javax.swing.JTextField tenTf;
    private javax.swing.JButton themBtn;
    private javax.swing.JButton timTheoTLORLVBtn;
    private javax.swing.JButton timTheoTenBtn;
    private javax.swing.JLabel topLb;
    private javax.swing.JPanel topPanel;
    private javax.swing.JButton xoaBtn;
    // End of variables declaration//GEN-END:variables
}
