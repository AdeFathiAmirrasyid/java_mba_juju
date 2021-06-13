package simple_retail;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Pembelian  {

    public javax.swing.JComboBox<String> comPembelian;
    public javax.swing.JTextField hargaProduk;
    public javax.swing.JTable tabelPembelian;

    public void menampilkan_tablePembelian() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Produk ");
        model.addColumn("Harga Produk");
        model.addColumn("Jumlah Barang");
        model.addColumn("Total Harga");

        try {
            int no = 1;
            String sql = "select * from pembelian";
            java.sql.Connection conn = (Connection) koneksi.koneksidb();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{no++, res.getString(1), res.getString(2),
                    res.getString(3), res.getString(4)});
            }
            tabelPembelian.setModel(model);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void tampil_combobox() {
        try {
            String sql = "select namaProduk from produk   ";
            java.sql.Connection conn = (Connection) koneksi.koneksidb();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                comPembelian.addItem(res.getString("namaProduk"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error  : \n " + e);
        }
    }

    public void tampil() {
        try {
            String sql = "select HargaBeli from produk where namaProduk ='" + comPembelian.getSelectedItem() + "'";
            java.sql.Connection conn = (Connection) koneksi.koneksidb();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                hargaProduk.setText(res.getString("HargaBeli"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
