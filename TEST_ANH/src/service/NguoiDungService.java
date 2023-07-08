/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domainmodel.NguoiDung;
import irepository.INguoiDungrepository;
import iservice.INguoiDungService;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import repository.NguoiDungRepository;

/**
 *
 * @author Admin
 */
public class NguoiDungService implements INguoiDungService {

    public INguoiDungrepository iNguoiDungRepository = new NguoiDungRepository();

    @Override
    public ArrayList<NguoiDung> getAll() {
        return iNguoiDungRepository.getAll();
    }

    @Override
    public String insert(NguoiDung nguoiDung) {
        if (iNguoiDungRepository.insert(nguoiDung)) {
            return "Them thanh cong";
        } else {
            return "Them that bai";
        }
    }

    @Override
    public String update(String id, NguoiDung nguoiDung) {
        if (iNguoiDungRepository.update(id, nguoiDung)) {
            return "update thanh cong";
        } else {
            return "update that bai";
        }
    }

}
