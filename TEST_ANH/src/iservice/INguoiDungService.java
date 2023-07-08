/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package iservice;

import domainmodel.NguoiDung;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface INguoiDungService {

    public ArrayList<NguoiDung> getAll();

    public String insert(NguoiDung nguoiDung);

    public String update(String id, NguoiDung nguoiDung);    
}
