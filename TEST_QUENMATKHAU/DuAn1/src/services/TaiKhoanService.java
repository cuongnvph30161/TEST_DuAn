/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import interfacerepositorys.ITaiKhoanRepository;
import interfaceservices.ITaiKhoanService;
import repositorys.TaiKhoanRepository;

/**
 *
 * @author Admin
 */
public class TaiKhoanService implements ITaiKhoanService{
public ITaiKhoanRepository taiKhoanRepository = new TaiKhoanRepository();
    @Override
    public String updatePassWord(String passWord, int maNhanVien) {
        return taiKhoanRepository.updatePassWord(passWord, maNhanVien);
    }
    
}
