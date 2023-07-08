/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package irepository;

import domainmodel.NguoiDung;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface INguoiDungrepository {
    public ArrayList<NguoiDung> getAll();
    public boolean insert(NguoiDung nguoiDung);
    public boolean update(String id , NguoiDung nguoiDung);
   
}
