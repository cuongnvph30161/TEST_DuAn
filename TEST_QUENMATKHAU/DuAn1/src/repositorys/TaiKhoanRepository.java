/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorys;

import interfacerepositorys.ITaiKhoanRepository;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import utilities.DbConnector;

/**
 *
 * @author Admin
 */
public class TaiKhoanRepository implements ITaiKhoanRepository {

    private static Connection connection = null;

    static {
        try {
            connection = DbConnector.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String updatePassWord(String newPassWord, int maNhanVien) {
        try {
            String query = "update TaiKhoan set MatKhau =? where MaNhanVien =?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, newPassWord);
            ps.setInt(2, maNhanVien);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
