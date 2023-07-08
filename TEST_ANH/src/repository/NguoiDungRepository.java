/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import domainmodel.NguoiDung;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import irepository.INguoiDungrepository;

/**
 *
 * @author Admin
 */
public class NguoiDungRepository implements INguoiDungrepository {

    public static Connection connection = null;

    static {
        try {
            connection = DbConnector.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<NguoiDung> getAll() {
        try {
            ArrayList<NguoiDung> listNguoiDungs = new ArrayList<>();
            String query = "select * from NguoiDung";
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("Id");
                byte[] anh = rs.getBytes("Anh");
                NguoiDung nguoiDung = new NguoiDung(id, anh);
                listNguoiDungs.add(nguoiDung);
            }
            return listNguoiDungs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean insert(NguoiDung nguoiDung) {
        try {
            String query = "insert into NguoiDung(anh) values(?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setBytes(1, nguoiDung.getAnh());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(String id, NguoiDung nguoiDung) {
        try {
            String query = "update NguoiDung set anh = ? where Id = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setBytes(1, nguoiDung.getAnh());
            ps.setString(2, id);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false; // Trả về false nếu có lỗi xảy ra
    }

}
