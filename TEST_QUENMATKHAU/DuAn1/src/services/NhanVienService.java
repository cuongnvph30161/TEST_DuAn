/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import interfacerepositorys.INhanVienRepository;
import interfaceservices.INhanVienService;
import repositorys.NhanVienRepository;

/**
 *
 * @author Admin
 */
public class NhanVienService implements INhanVienService{
public  INhanVienRepository nhanVienRepository = new NhanVienRepository();
    @Override
    public int getMaNhanVienByEmail(String email) {
        return nhanVienRepository.getMaNhanVienByEmail(email);
    }
    
}
