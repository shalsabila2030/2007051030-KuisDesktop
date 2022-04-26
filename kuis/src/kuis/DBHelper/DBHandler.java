
package kuis.DBHelper;

import com.sun.istack.internal.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;

public class DBHandler {
   public final Connection conn;

    public DBHandler(String driver) {
        this.conn = DBHelper.getConnection(driver);
    }
    public void addSetrika(Setrika str){
        String insertStr = "INSERT INTO 'setrika'('id','nama','harga','tgl_produksi','jenis','merk')"
                + "VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement stmtInsert = conn.prepareStatement(insertStr);
            stmtInsert.setString(1, str.getId());
            stmtInsert.setString(2, str.getNama());
            stmtInsert.setString(3, str.getHarga());
            stmtInsert.setString(4, str.getTgl_produksi());
            stmtInsert.setString(5, str.getJenis());
            stmtInsert.setString(6, str.getMerk());           
            stmtInsert.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static class Setrika {

        public Setrika() {
        }
    }
    
}
