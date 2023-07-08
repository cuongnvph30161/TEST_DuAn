/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorys;

import interfacerepositorys.INhanVienRepository;
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
public class NhanVienRepository implements INhanVienRepository {

    private static Connection connection = null;

    static {
        try {
            connection = DbConnector.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getMaNhanVienByEmail(String email) {
        int maNhanVien = 0;
        try {
            String query = "select MaNhanVien from NhanVien  where email =?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                maNhanVien = rs.getInt("MaNhanVien");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return maNhanVien;
    }

}
