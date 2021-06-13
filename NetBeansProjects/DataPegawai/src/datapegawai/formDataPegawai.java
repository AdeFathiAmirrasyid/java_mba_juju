package datapegawai;

import java.awt.event.KeyEvent;

public class formDataPegawai extends javax.swing.JFrame {

    class dataPegawai extends DataPegawai {

        String nip = txtNip.getText();
        String name = txtNama.getText();
        Double gaji, zakat;

        double hitungZakat() {
            gaji = Double.parseDouble(txtGaji.getText());
            zakat = gaji * 0.025;
            return zakat;
        }

    }

    public formDataPegawai() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jenis = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNip = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtGaji = new javax.swing.JTextField();
        cmbBagian = new javax.swing.JComboBox<>();
        btnSimpan = new javax.swing.JButton();
        cbhave = new javax.swing.JCheckBox();
        cbtraveling = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cbgame = new javax.swing.JCheckBox();
        cbgadget = new javax.swing.JCheckBox();
        cbmenonton = new javax.swing.JCheckBox();
        cbmusic = new javax.swing.JCheckBox();
        cbbermain = new javax.swing.JCheckBox();
        cblain = new javax.swing.JCheckBox();
        rbLk = new javax.swing.JRadioButton();
        rbPr = new javax.swing.JRadioButton();
        jToolBar1 = new javax.swing.JToolBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblGaji = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblbagian = new javax.swing.JLabel();
        lblKelamin = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblNip = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblZakat = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lblAgama1 = new javax.swing.JLabel();
        lblHobby = new javax.swing.JLabel();
        lblHobby2 = new javax.swing.JLabel();
        lblHobby1 = new javax.swing.JLabel();
        lblHobby4 = new javax.swing.JLabel();
        lblHobby5 = new javax.swing.JLabel();
        lblHobby6 = new javax.swing.JLabel();
        lblHobby7 = new javax.swing.JLabel();
        lblHobby3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setText("                              Data Pegawai");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("NIP                         :");

        jLabel3.setText("Nama                      :");

        jLabel4.setText("Bagian                     :");

        jLabel5.setText("Gaji                         :");

        txtNip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNipKeyTyped(evt);
            }
        });

        cmbBagian.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrasi", "Accounting", "Manager Marketing", "Staf Operasional" }));
        cmbBagian.setSelectedIndex(-1);
        cmbBagian.setToolTipText("");
        cmbBagian.setName(""); // NOI18N

        btnSimpan.setText("SIMPAN");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        cbhave.setText("have Fun");

        cbtraveling.setText("Traveling");

        jLabel16.setText("Kelamin                   :");

        jLabel17.setText("Hobbi                      :");

        cbgame.setText("Game");

        cbgadget.setText("Gadget");

        cbmenonton.setText("Menonton");

        cbmusic.setText("Music");

        cbbermain.setText("Bermain");

        cblain.setText("Lain - Lain");

        jenis.add(rbLk);
        rbLk.setText("Laki -Laki");

        jenis.add(rbPr);
        rbPr.setText("Perempuan");

        jToolBar1.setRollover(true);

        jLabel7.setText("Bagian          :");

        lblGaji.setText("gaji");

        jLabel8.setText("Gaji              :");

        jLabel6.setText("Nama           :");

        lblbagian.setText("bagian");

        lblKelamin.setText("kelamin");

        jLabel9.setText("NIP              :");

        lblNama.setText("nama");

        jLabel10.setText("Kelamin        :");

        lblNip.setText("Nip");

        jLabel18.setText("Zakat              :");

        lblZakat.setText("zakat");

        jLabel23.setText("Hobby          :");

        lblHobby.setBorder(new javax.swing.border.MatteBorder(null));

        lblHobby2.setBorder(new javax.swing.border.MatteBorder(null));

        lblHobby1.setBorder(new javax.swing.border.MatteBorder(null));

        lblHobby4.setBorder(new javax.swing.border.MatteBorder(null));

        lblHobby5.setBorder(new javax.swing.border.MatteBorder(null));

        lblHobby6.setBorder(new javax.swing.border.MatteBorder(null));

        lblHobby7.setBorder(new javax.swing.border.MatteBorder(null));

        lblHobby3.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel23))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKelamin)
                            .addComponent(lblNip)
                            .addComponent(lblNama))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(36, 36, 36)
                                .addComponent(lblZakat))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(36, 36, 36)
                                .addComponent(lblbagian))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(36, 36, 36)
                                .addComponent(lblGaji)))
                        .addGap(148, 148, 148))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblHobby4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHobby5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHobby6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHobby7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblHobby, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHobby1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHobby2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 307, Short.MAX_VALUE)
                                        .addComponent(lblAgama1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblHobby3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblNama))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(lblKelamin)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lblNip)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblGaji))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblbagian))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(lblZakat))))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHobby2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHobby, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHobby1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHobby3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHobby7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHobby5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHobby4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHobby6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(lblAgama1)
                .addGap(66, 66, 66))
        );

        jScrollPane1.setViewportView(jPanel1);

        jToolBar1.add(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbBagian, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGaji, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addGap(53, 53, 53)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbhave)
                                .addComponent(cbmenonton))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbgame)
                                .addComponent(cbmusic))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbbermain)
                                .addComponent(cbtraveling))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbgadget)
                                .addComponent(cblain)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(56, 56, 56)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNip, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addGap(71, 71, 71)
                            .addComponent(rbLk)
                            .addGap(18, 18, 18)
                            .addComponent(rbPr))
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(rbLk)
                    .addComponent(rbPr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbhave)
                    .addComponent(cbtraveling)
                    .addComponent(jLabel17)
                    .addComponent(cbgame)
                    .addComponent(cbgadget))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbmenonton)
                    .addComponent(cbmusic)
                    .addComponent(cbbermain)
                    .addComponent(cblain))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbBagian, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtGaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        dataPegawai dataPegawai1 = new dataPegawai();
        Double zakat1, gaji;
        gaji = Double.parseDouble(txtGaji.getText());
        zakat1 = dataPegawai1.hitungZakat();
        String jkLk, jkPr;

        // combobox Bagian
        String selectedValue = cmbBagian.getSelectedItem().toString();
        lblbagian.setText(selectedValue);

        //jenis kelamin
        if (rbLk.isSelected()) {
            jkLk = rbLk.getText();
            lblKelamin.setText(jkLk);
        } else if (rbPr.isSelected()) {
            jkPr = rbPr.getText();
            lblKelamin.setText(jkPr);
        }
        // Status
        String lbltampil;
        if (cbhave.isSelected()) {
            lbltampil = cbhave.getText();
            lblHobby.setText(lbltampil);
        }
        if (cbgame.isSelected()) {
            lbltampil = cbgame.getText();
            lblHobby1.setText(lbltampil);
        }
        if (cbtraveling.isSelected()) {
            lbltampil = cbtraveling.getText();
            lblHobby2.setText(lbltampil);
        }
        if (cbgadget.isSelected()) {
            lbltampil = cbgadget.getText();
            lblHobby3.setText(lbltampil);
        }
        if (cbmenonton.isSelected()) {
            lbltampil = cbmenonton.getText();
            lblHobby4.setText(lbltampil);
        }
        if (cbmusic.isSelected()) {
            lbltampil = cbmusic.getText();
            lblHobby5.setText(lbltampil);
        }
        if (cbbermain.isSelected()) {
            lbltampil = cbbermain.getText();
            lblHobby6.setText(lbltampil);
        }
        if (cblain.isSelected()) {
            lbltampil = cblain.getText();
            lblHobby7.setText(lbltampil);
        }

        lblNip.setText(dataPegawai1.nip);
        lblNama.setText(dataPegawai1.name);
        lblGaji.setText(dataPegawai1.gaji.toString());
        lblZakat.setText(String.valueOf(zakat1));

        ClearDataForms();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void txtNipKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNipKeyTyped
        FilterOnlyNumber(evt);
    }//GEN-LAST:event_txtNipKeyTyped
    private void FilterOnlyNumber(KeyEvent b) {
        if (Character.isAlphabetic(b.getKeyChar())) {
            b.consume();
        }
    }

    void ClearDataForms() {

        txtNip.setText(null);
        txtNama.setText(null);
        jenis.clearSelection();
        cmbBagian.setSelectedIndex(-1);
        txtGaji.setText(null);

  

    }

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
            java.util.logging.Logger.getLogger(formDataPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formDataPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formDataPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formDataPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formDataPegawai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimpan;
    private javax.swing.JCheckBox cbbermain;
    private javax.swing.JCheckBox cbgadget;
    private javax.swing.JCheckBox cbgame;
    private javax.swing.JCheckBox cbhave;
    private javax.swing.JCheckBox cblain;
    private javax.swing.JCheckBox cbmenonton;
    private javax.swing.JCheckBox cbmusic;
    private javax.swing.JCheckBox cbtraveling;
    private javax.swing.JComboBox<String> cmbBagian;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.ButtonGroup jenis;
    private javax.swing.JLabel lblAgama1;
    private javax.swing.JLabel lblGaji;
    private javax.swing.JLabel lblHobby;
    private javax.swing.JLabel lblHobby1;
    private javax.swing.JLabel lblHobby2;
    private javax.swing.JLabel lblHobby3;
    private javax.swing.JLabel lblHobby4;
    private javax.swing.JLabel lblHobby5;
    private javax.swing.JLabel lblHobby6;
    private javax.swing.JLabel lblHobby7;
    private javax.swing.JLabel lblKelamin;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNip;
    private javax.swing.JLabel lblZakat;
    private javax.swing.JLabel lblbagian;
    private javax.swing.JRadioButton rbLk;
    private javax.swing.JRadioButton rbPr;
    private javax.swing.JTextField txtGaji;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNip;
    // End of variables declaration//GEN-END:variables
}
