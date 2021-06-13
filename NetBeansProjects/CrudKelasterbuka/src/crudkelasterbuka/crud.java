package crudkelasterbuka;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class crud extends javax.swing.JFrame {

    public crud() {
        initComponents();
        load_table();
        ClearDataForms();
    }

    void ClearDataForms() {
        nama.setText(null);
        nim.setText(null);
        alamat.setText(null);
        hp.setText(null);
        pilih.setSelectedIndex(-1);
        jenis.clearSelection();
        id.setText(null);
    }

    void load_table() {
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("No");
        model.addColumn("Nama");
        model.addColumn("Nim");
        model.addColumn("Alamat");
        model.addColumn("No.Hp");
        model.addColumn("Prodi");
        model.addColumn("Jenis Kelamin");
        model.addColumn("ID");
        try {
            int no = 1;
            String sql = "select * from crud";
            java.sql.Connection conn = (Connection) koneksi.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{no++, res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7)});
            }
            tabel.setModel(model);
        } catch (Exception e) {
            //tampilin message box

        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jenis = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        nim = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        edit = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex, int colIndex)
            {
                return false; //Disallow the editing of any cell
            }
        };
        hp = new javax.swing.JTextField();
        pilih = new javax.swing.JComboBox<>();
        laki = new javax.swing.JRadioButton();
        pr = new javax.swing.JRadioButton();
        tambah = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("Jenis Kelamin :");

        jLabel6.setText("Prodi     :");

        nim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nimKeyTyped(evt);
            }
        });

        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        tabel.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        hp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hpKeyTyped(evt);
            }
        });

        pilih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sistem Informasi", "Tehnik Informatika", "Ilmu Computer" }));
        pilih.setSelectedIndex(-1);
        pilih.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jenis.add(laki);
        laki.setText("Laki-Laki");

        jenis.add(pr);
        pr.setText("Perempuan");

        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        jLabel1.setText("Nama     :");

        jLabel2.setText("Nim       :");

        jLabel3.setText("Alamat    :");

        jLabel4.setText("No.Hp    :");

        jLabel7.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(laki, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(pr))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(pilih, javax.swing.GroupLayout.Alignment.LEADING, 0, 187, Short.MAX_VALUE)
                                            .addComponent(nama, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nim, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(alamat, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(hp, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(hp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(pilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(laki)
                        .addComponent(pr)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambah)
                    .addComponent(edit)
                    .addComponent(hapus)
                    .addComponent(clear))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nimKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nimKeyTyped
        FilterOnlyNumber(evt);
    }//GEN-LAST:event_nimKeyTyped

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed

        try {
            if (nama.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Kolom tidak boleh kosong \n Data belom di Edit ! \n Silahkan masukan data yang mau di Edit ", "Peringatan", JOptionPane.WARNING_MESSAGE);
            } else if (nim.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Kolom tidak boleh kosong \n Data belom di Edit ! \n Silahkan masukan data yang mau di Edit ", "Peringatan", JOptionPane.WARNING_MESSAGE);
            } else if (alamat.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Kolom tidak boleh kosong \n Data belom di Edit ! \n Silahkan masukan data yang mau di Edit ", "Peringatan", JOptionPane.WARNING_MESSAGE);
            } else if (hp.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Kolom tidak boleh kosong \n Data belom di Edit ! \n Silahkan masukan data yang mau di Edit ", "Peringatan", JOptionPane.WARNING_MESSAGE);
            } else if (pilih.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog(null, "Kolom tidak boleh kosong \n Data belom di Edit ! \n Silahkan masukan data yang mau di Edit ", "Peringatan", JOptionPane.WARNING_MESSAGE);
            } else if (jenis.equals("")) {
                JOptionPane.showMessageDialog(null, "Kolom tidak boleh kosong \n Data belom di Edit ! \n Silahkan masukan data yang mau di Edit ", "Peringatan", JOptionPane.WARNING_MESSAGE);
            } else {
                String jenis = "";
                if (laki.isSelected()) {
                    jenis = "laki-laki";
                } else if (pr.isSelected()) {
                    jenis = "perempuan";
                }
                String sql = "UPDATE crud SET Nama = '" + nama.getText()
                        + "',Nim = " + nim.getText()
                        + ",Alamat = '" + alamat.getText()
                        + "',Phone =" + hp.getText()
                        + ",Prodi = '" + pilih.getSelectedItem()
                        + "',jenis_Kelamin = '" + jenis
                        + "' WHERE Nim = '" + nim.getText()
                        + "'";
                java.sql.Connection conn = (Connection) koneksi.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Data berhasil di Edit");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "\n Perubahan data Gagal");
        }
        load_table();
        ClearDataForms();
    }//GEN-LAST:event_editActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed

        try {
            String sql = "delete from crud where nim='" + nim.getText() + "'";
            java.sql.Connection conn = (Connection) koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "berhasil di hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Pilih Data yang mau di hapus");
        }
        load_table();
        ClearDataForms();
    }//GEN-LAST:event_hapusActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        ClearDataForms();
    }//GEN-LAST:event_clearActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
        ClearDataForms();
        int baris = tabel.rowAtPoint(evt.getPoint());
        String nama1 = tabel.getValueAt(baris, 1).toString();
        nama.setText(nama1);
        String nim1 = tabel.getValueAt(baris, 2).toString();
        nim.setText(nim1);
        String alamat1 = tabel.getValueAt(baris, 3).toString();
        alamat.setText(alamat1);
        String hp1 = tabel.getValueAt(baris, 4).toString();
        hp.setText(hp1);
        String pilih1 = tabel.getValueAt(baris, 5).toString();
        pilih.setSelectedItem(pilih1);
        if (tabel.getValueAt(baris, 6).equals("laki-laki")) {
            jenis.setSelected(laki.getModel(), true);
        } else if (tabel.getValueAt(baris, 6).equals("perempuan")) {
            jenis.setSelected(pr.getModel(), true);
        }
        String id1 = tabel.getValueAt(baris, 7).toString();
        id.setText(id1);
    }//GEN-LAST:event_tabelMouseClicked

    private void hpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hpKeyTyped

        FilterOnlyNumber(evt);
    }//GEN-LAST:event_hpKeyTyped

    private boolean FormValidation() {
        if (id.getText().equals("") || nama.getText().equals("") || nim.getText().equals("") || 
           alamat.getText().equals("") || pilih.getSelectedItem() == null) {
            return false;
        }

        if ((laki.isSelected() || pr.isSelected()) == false) {
            return false;
        }
        return true;
    }
    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // filter
        if (FormValidation()) {
            try {
                String jk = laki.isSelected() ? "Laki-laki" : pr.isSelected() ? "Perempuan" : "";
                String sql = "INSERT INTO crud VALUES ("
                        + "'  " + nama.getText()
                        + "','" + nim.getText()
                        + "','" + alamat.getText()
                        + "','" + hp.getText()
                        + "','" + pilih.getSelectedItem()
                        + "','" + jk
                        + "',' " + id.getText()
                        + "')";
                java.sql.Connection conn = (Connection) koneksi.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this, "Data berhasil di Edit");
                load_table();
                ClearDataForms();
            } catch (HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.toString(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
        }
    }//GEN-LAST:event_tambahActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crud().setVisible(true);
            }
        });
    }

    private void FilterOnlyNumber(KeyEvent b) {
        if (Character.isAlphabetic(b.getKeyChar())) {
            b.consume();
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JButton clear;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField hp;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup jenis;
    private javax.swing.JRadioButton laki;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nim;
    private javax.swing.JComboBox<String> pilih;
    private javax.swing.JRadioButton pr;
    private javax.swing.JTable tabel;
    private javax.swing.JButton tambah;
    // End of variables declaration//GEN-END:variables
}
