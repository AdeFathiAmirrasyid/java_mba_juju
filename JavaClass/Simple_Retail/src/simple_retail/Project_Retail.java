package simple_retail;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Project_Retail extends javax.swing.JFrame {

   
    private int SelectedProdukId;

    public Project_Retail() {
      

        initComponents();
        menampilkan_tableProduk();
           Pembelian ob_pembelian1 = new Pembelian();
         ob_pembelian1.menampilkan_tablePembelian();
        ob_pembelian1.tampil_combobox();
        ob_pembelian1.tampil();
//        menampilkan_tablePembelian();
//        tampil_combobox();
    }
    

//Pembelian
//    private void menampilkan_tablePembelian() {
//        DefaultTableModel model = new DefaultTableModel();
//        model.addColumn("No");
//        model.addColumn("Produk ");
//        model.addColumn("Harga Produk");
//        model.addColumn("Jumlah Barang");
//        model.addColumn("Total Harga");
//
//        try {
//            int no = 1;
//            String sql = "select * from pembelian";
//            java.sql.Connection conn = (Connection) koneksi.koneksidb();
//            java.sql.Statement stm = conn.createStatement();
//            java.sql.ResultSet res = stm.executeQuery(sql);
//            while (res.next()) {
//                model.addRow(new Object[]{no++, res.getString(1), res.getString(2),
//                    res.getString(3), res.getString(4)});
//            }
//            tabelPembelian.setModel(model);
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
//        }
//    }
//    private void tampil_combobox() {
//        try {
//            String sql = "select namaProduk from produk   ";
//            java.sql.Connection conn = (Connection) koneksi.koneksidb();
//            java.sql.Statement stm = conn.createStatement();
//            java.sql.ResultSet res = stm.executeQuery(sql);
//            while (res.next()) {
//                 comPembelian.addItem(res.getString("namaProduk"));
//            }
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(this, "Error  : \n " + e);
//        }
//    }
//    public void tampil() {
//        try {
//            String sql = "select HargaBeli from produk where namaProduk ='" + comPembelian.getSelectedItem() + "'";
//            java.sql.Connection conn = (Connection) koneksi.koneksidb();
//            java.sql.Statement stm = conn.createStatement();
//            java.sql.ResultSet res = stm.executeQuery(sql);
//            while (res.next()) {
//                hargaProduk.setText(res.getString("HargaBeli"));
//            }
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    sampai sini Pembelian
    void refreshData() {
        SelectedProdukId = 0;
        text_namaProduk.setText(null);
        text_kodeProduk.setText(null);
        text_stok.setText(null);
        text_hargaBeli.setText(null);
        text_hargaJual.setText(null);
        text_keterangan.setText(null);
        tabelBarang.clearSelection();
    }

    private void menampilkan_tableProduk() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Id ");
        model.addColumn("Nama Produk");
        model.addColumn("Kode Produk");
        model.addColumn("Stok");
        model.addColumn("Harga Beli");
        model.addColumn("Harga Jual");
        model.addColumn("Keterangan");

        try {
            int no = 1;
            String sql = "select * from produk";
            java.sql.Connection conn = (Connection) koneksi.koneksidb();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{no++, res.getString(1), res.getString(2),
                    res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7)});
            }
            tabelBarang.setModel(model);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        panelProdukBarang = new javax.swing.JPanel();
        text_stok = new javax.swing.JTextField();
        text_hargaBeli = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        text_hargaJual = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        text_keterangan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        button_save = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBarang = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        button_update = new javax.swing.JButton();
        button_delete = new javax.swing.JButton();
        text_namaProduk = new javax.swing.JTextField();
        button_refresh = new javax.swing.JButton();
        text_kodeProduk = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jumlahBarang = new javax.swing.JTextField();
        totalHarga = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelPembelian = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        hargaProduk = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        comPembelian = new javax.swing.JComboBox<>();
        jButton22 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        panel112 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabelPenjualan = new javax.swing.JTable();
        jumlahBarang_penj = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jButton20 = new javax.swing.JButton();
        hargaProduk_penj = new javax.swing.JTextField();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        comPenjualan = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        text_stok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_stokKeyTyped(evt);
            }
        });

        text_hargaBeli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_hargaBeliKeyTyped(evt);
            }
        });

        jLabel3.setText("Kode Produk    :");

        text_hargaJual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_hargaJualKeyTyped(evt);
            }
        });

        jLabel4.setText("Stok                :");

        jLabel5.setText("Harga Beli        :");

        button_save.setText("Save");
        button_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_saveActionPerformed(evt);
            }
        });

        jLabel6.setText("Harga Jual       :");

        tabelBarang.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelBarang);

        jLabel7.setText("Keterangan      :");

        jLabel9.setText("Nama Produk   :");

        button_update.setText("Update");
        button_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_updateActionPerformed(evt);
            }
        });

        button_delete.setText("Delete");
        button_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_deleteActionPerformed(evt);
            }
        });

        button_refresh.setText("Refresh");
        button_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_refreshActionPerformed(evt);
            }
        });

        text_kodeProduk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_kodeProdukKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Serif", 1, 48)); // NOI18N
        jLabel1.setText("Produk Barang");

        javax.swing.GroupLayout panelProdukBarangLayout = new javax.swing.GroupLayout(panelProdukBarang);
        panelProdukBarang.setLayout(panelProdukBarangLayout);
        panelProdukBarangLayout.setHorizontalGroup(
            panelProdukBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProdukBarangLayout.createSequentialGroup()
                .addGroup(panelProdukBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE))
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProdukBarangLayout.createSequentialGroup()
                .addGroup(panelProdukBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProdukBarangLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(panelProdukBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProdukBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel9))
                            .addComponent(jLabel7)))
                    .addGroup(panelProdukBarangLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(button_save, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71)
                .addGroup(panelProdukBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelProdukBarangLayout.createSequentialGroup()
                        .addGroup(panelProdukBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(text_keterangan, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(text_hargaJual)
                            .addComponent(text_hargaBeli)
                            .addComponent(text_stok)
                            .addComponent(text_namaProduk)
                            .addComponent(text_kodeProduk))
                        .addGap(376, 376, 376))
                    .addGroup(panelProdukBarangLayout.createSequentialGroup()
                        .addComponent(button_update, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(button_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
        );
        panelProdukBarangLayout.setVerticalGroup(
            panelProdukBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProdukBarangLayout.createSequentialGroup()
                .addGroup(panelProdukBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelProdukBarangLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(panelProdukBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(text_namaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(panelProdukBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(text_kodeProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(panelProdukBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(text_stok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(panelProdukBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(text_hargaBeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(panelProdukBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(text_hargaJual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(panelProdukBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(text_keterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(panelProdukBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_save, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_update, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        jTabbedPane2.addTab("Manage Produk", panelProdukBarang);

        jLabel20.setText("Total Harga");

        jButton19.setText("Refresh");

        jLabel21.setText("Produk          :");

        jLabel22.setText("Harga Produk     :");

        tabelPembelian.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tabelPembelian);

        jLabel23.setText("Jumlah Barang   :");

        jLabel24.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel24.setText("Aplikasi Retail Pembelian");

        comPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comPembelianActionPerformed(evt);
            }
        });

        jButton22.setText("Save");

        jButton27.setText("Update");

        jButton28.setText("Delete");

        jButton23.setText("Refresh");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                        .addGap(65, 65, 65)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23))
                                .addGap(113, 113, 113)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hargaProduk)
                                    .addComponent(jumlahBarang)
                                    .addComponent(totalHarga)
                                    .addComponent(comPembelian, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(90, 90, 90))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(169, 169, 169))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(comPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hargaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(287, Short.MAX_VALUE))))
        );

        jTabbedPane2.addTab("Pembelian", jPanel5);

        jLabel26.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel26.setText("Aplikasi Retail Penjualan");

        jLabel30.setText("Produk          :");

        jLabel31.setText("Harga Produk     :");

        tabelPenjualan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(tabelPenjualan);

        jLabel32.setText("Jumlah Barang   :");

        jButton20.setText("Refresh");

        jButton25.setText("Update");

        jButton26.setText("Delete");

        jLabel33.setText("Total Harga");

        jButton21.setText("Save");

        javax.swing.GroupLayout panel112Layout = new javax.swing.GroupLayout(panel112);
        panel112.setLayout(panel112Layout);
        panel112Layout.setHorizontalGroup(
            panel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel112Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel112Layout.createSequentialGroup()
                        .addGroup(panel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel112Layout.createSequentialGroup()
                                .addGroup(panel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel32))
                                .addGap(113, 113, 113)
                                .addGroup(panel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jumlahBarang_penj, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hargaProduk_penj, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comPenjualan, javax.swing.GroupLayout.Alignment.LEADING, 0, 208, Short.MAX_VALUE)
                                    .addComponent(jTextField24)))
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(panel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane6))
                .addGap(201, 201, 201))
        );
        panel112Layout.setVerticalGroup(
            panel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel112Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel112Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(panel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(comPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(panel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hargaProduk_penj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31))
                        .addGap(29, 29, 29)
                        .addGroup(panel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jumlahBarang_penj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))
                        .addGap(40, 40, 40)
                        .addGroup(panel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33)))
                    .addGroup(panel112Layout.createSequentialGroup()
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(291, 291, 291))
        );

        jTabbedPane2.addTab("Penjualan", panel112);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_deleteActionPerformed
        if (text_kodeProduk.getText().equals("") || SelectedProdukId == 0) {
            JOptionPane.showMessageDialog(this, "Pilih Data yang mau di hapus");
            return;
        }
        try {
            String sql = "delete from produk where Id =" + SelectedProdukId;
            java.sql.Connection conn = (Connection) koneksi.koneksidb();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            menampilkan_tableProduk();
            refreshData();
            JOptionPane.showMessageDialog(null, "berhasil di hapus");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Error : \n " + e);
        }
    }//GEN-LAST:event_button_deleteActionPerformed

    private void button_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_refreshActionPerformed
        refreshData();
    }//GEN-LAST:event_button_refreshActionPerformed
    private boolean FormValidation() {
        if (text_namaProduk.getText().equals("") || text_kodeProduk.getText().equals("")
                || text_stok.getText().equals("") || text_hargaBeli.getText().equals("")
                || text_hargaJual.getText().equals("") || text_keterangan.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "\n Data belom Lengkap ! \n Silahkan Lengkapi Data Berikiut ", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        return true;
    }

    private void button_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_saveActionPerformed
        if (FormValidation()) {
            try {
                String sql = "INSERT INTO produk (namaProduk,kodeProduk,Stok,HargaBeli,HargaJual,Keterangan) values("
                        + "'" + text_namaProduk.getText()
                        + "','" + text_kodeProduk.getText()
                        + "','" + text_stok.getText()
                        + "','" + text_hargaBeli.getText()
                        + "','" + text_hargaJual.getText()
                        + "','" + text_keterangan.getText()
                        + "')";
                java.sql.Connection conn = (Connection) koneksi.koneksidb();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                menampilkan_tableProduk();
                JOptionPane.showMessageDialog(this, "Data berhasil di tambahkan ");
                refreshData();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.toString(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_button_saveActionPerformed

    private void tabelBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBarangMouseClicked
        refreshData();
        int baris = tabelBarang.rowAtPoint(evt.getPoint());
        SelectedProdukId = Integer.parseInt(tabelBarang.getValueAt(baris, 1).toString());
        String namaProduk1 = tabelBarang.getValueAt(baris, 2).toString();
        text_namaProduk.setText(namaProduk1);
        String kodeProduk1 = tabelBarang.getValueAt(baris, 3).toString();
        text_kodeProduk.setText(kodeProduk1);
        String stok1 = tabelBarang.getValueAt(baris, 4).toString();
        text_stok.setText(stok1);
        String hargaBeli1 = tabelBarang.getValueAt(baris, 5).toString();
        text_hargaBeli.setText(hargaBeli1);
        String hargaJual1 = tabelBarang.getValueAt(baris, 6).toString();
        text_hargaJual.setText(hargaJual1);
        String keterangan1 = tabelBarang.getValueAt(baris, 7).toString();
        text_keterangan.setText(keterangan1);
    }//GEN-LAST:event_tabelBarangMouseClicked

    private void button_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_updateActionPerformed
        if (text_kodeProduk.getText().equals("") || SelectedProdukId == 0) {
            JOptionPane.showMessageDialog(this, "Pilih Data yang mau di Edit");
            return;
        }
        try {
            String sql = " UPDATE produk SET kodeProduk =  "
                    + text_kodeProduk.getText()
                    + ",namaProduk = '" + text_namaProduk.getText()
                    + "',kodeProduk = " + text_kodeProduk.getText()
                    + ",Stok = " + text_stok.getText()
                    + ",HargaBeli = " + text_hargaBeli.getText()
                    + ",HargaJual = " + text_hargaJual.getText()
                    + ",Keterangan = '" + text_keterangan.getText()
                    + "' where ID = " + SelectedProdukId;
            java.sql.Connection conn = (Connection) koneksi.koneksidb();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            menampilkan_tableProduk();
            refreshData();
            JOptionPane.showMessageDialog(null, "Data berhasil di Edit");

        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(this, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_button_updateActionPerformed
    private void FilterOnlyNumber(KeyEvent b) {
        if (Character.isAlphabetic(b.getKeyChar())) {
            b.consume();
        }
    }
    private void text_kodeProdukKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_kodeProdukKeyTyped
        FilterOnlyNumber(evt);
    }//GEN-LAST:event_text_kodeProdukKeyTyped

    private void text_stokKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_stokKeyTyped
        FilterOnlyNumber(evt);
    }//GEN-LAST:event_text_stokKeyTyped

    private void text_hargaBeliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_hargaBeliKeyTyped
        FilterOnlyNumber(evt);
    }//GEN-LAST:event_text_hargaBeliKeyTyped

    private void text_hargaJualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_hargaJualKeyTyped
        FilterOnlyNumber(evt);
    }//GEN-LAST:event_text_hargaJualKeyTyped

    private void comPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comPembelianActionPerformed
//        tampil();
    }//GEN-LAST:event_comPembelianActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Project_Retail().setVisible(true);
            }

        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_delete;
    private javax.swing.JButton button_refresh;
    private javax.swing.JButton button_save;
    private javax.swing.JButton button_update;
    private javax.swing.JComboBox<String> comPembelian;
    private javax.swing.JComboBox<String> comPenjualan;
    private javax.swing.JTextField hargaProduk;
    private javax.swing.JTextField hargaProduk_penj;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jumlahBarang;
    private javax.swing.JTextField jumlahBarang_penj;
    private javax.swing.JPanel panel112;
    private javax.swing.JPanel panelProdukBarang;
    private javax.swing.JTable tabelBarang;
    private javax.swing.JTable tabelPembelian;
    private javax.swing.JTable tabelPenjualan;
    private javax.swing.JTextField text_hargaBeli;
    private javax.swing.JTextField text_hargaJual;
    private javax.swing.JTextField text_keterangan;
    private javax.swing.JTextField text_kodeProduk;
    private javax.swing.JTextField text_namaProduk;
    private javax.swing.JTextField text_stok;
    private javax.swing.JTextField totalHarga;
    // End of variables declaration//GEN-END:variables
}
