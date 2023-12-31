/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.NhanVienNhapLieu;

import Entity.ConNguoi;
import Entity.TacGia;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tinhlam
 */
public class GiaoDienQLTacGia extends javax.swing.JFrame {

    JFrame parent;
    DefaultTableCellRenderer headerRenderer;
    ArrayList<ConNguoi> ds;

    /**
     * Creates new form GiaoDienQLTacGia
     */
    public GiaoDienQLTacGia(JFrame parent) {
        this.parent = parent;
        initComponents();
        setup();
        loadDefaultList();
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

    public void loadDefaultList() {
        ds = new TacGia().layDanhSach();
    }

    public void renderTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        model.setColumnIdentifiers(TacGia.getProperties());
        for (int i = 0; i < jTable1.getModel().getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
            jTable1.getColumnModel().getColumn(i).setPreferredWidth(150);
        }
        for (ConNguoi tl : ds) {
            TacGia tg = (TacGia) tl;
            model.addRow(tg.getValues());
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

        mainPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        topLb = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        centerPanel = new javax.swing.JPanel();
        centerTopPanel = new javax.swing.JPanel();
        themBtn = new javax.swing.JButton();
        tenTf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        timBtn = new javax.swing.JButton();
        suaBtn = new javax.swing.JButton();
        xoaBtn = new javax.swing.JButton();
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
        topLb.setText("Quản Lý Tác Giả");

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

        timBtn.setBackground(new java.awt.Color(51, 102, 255));
        timBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        timBtn.setForeground(new java.awt.Color(255, 255, 255));
        timBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        timBtn.setText("Tìm");
        timBtn.setBorder(null);
        timBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timBtnActionPerformed(evt);
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

        javax.swing.GroupLayout centerTopPanelLayout = new javax.swing.GroupLayout(centerTopPanel);
        centerTopPanel.setLayout(centerTopPanelLayout);
        centerTopPanelLayout.setHorizontalGroup(
            centerTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerTopPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(themBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(suaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xoaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(tenTf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(timBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        centerTopPanelLayout.setVerticalGroup(
            centerTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, centerTopPanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(centerTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenTf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(xoaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(themBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
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
        GiaoDienThemTacGia form = new GiaoDienThemTacGia(this);
        form.setVisible(true);
    }//GEN-LAST:event_themBtnActionPerformed

    private void timBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timBtnActionPerformed
        if (tenTf.getText().equals("")) {
            ds = new TacGia().layDanhSach();
        } else {
            String ten = tenTf.getText();
            ds = new TacGia().timKiemTheoTen(ten);
        }
        renderTable();
    }//GEN-LAST:event_timBtnActionPerformed

    private void suaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaBtnActionPerformed
        int row = jTable1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Dữ liệu chọn không hợp lệ");
            return;
        }
        GiaoDienSuaTacGia form = new GiaoDienSuaTacGia(this, (TacGia) ds.get(row));
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
            ds = new TacGia().layDanhSach();
            renderTable();
        }
    }//GEN-LAST:event_xoaBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel centerCenterPanel;
    private javax.swing.JPanel centerPanel;
    private javax.swing.JPanel centerTopPanel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton suaBtn;
    private javax.swing.JTextField tenTf;
    private javax.swing.JButton themBtn;
    private javax.swing.JButton timBtn;
    private javax.swing.JLabel topLb;
    private javax.swing.JPanel topPanel;
    private javax.swing.JButton xoaBtn;
    // End of variables declaration//GEN-END:variables
}
