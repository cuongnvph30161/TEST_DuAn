/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodel;

/**
 *
 * @author Admin
 */
public class NguoiDung {

    private int id;
    private byte[] anh;

    public NguoiDung(int id, byte[] anh) {
        this.id = id;
        this.anh = anh;
    }

    public NguoiDung() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getAnh() {
        return anh;
    }

    public void setAnh(byte[] anh) {
        this.anh = anh;
    }

    @Override
    public String toString() {
        return "NguoiDung{" + "id=" + id + ", anh=" + anh + '}';
    }

   
}
