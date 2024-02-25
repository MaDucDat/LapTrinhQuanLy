/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_NhanVien;

import java.util.Objects;

/**
 *
 * @author maduc
 */
public class Nhan_Vien {
    int  MaNhanVien;
    String  HotenNhanVien;
    int phone;
    int CCCD;
    String  GioiTinh;
    String CaLam;

    public Nhan_Vien(int MaNhanVien, String HotenNhanVien, int phone, int CCCD, String GioiTinh, String CaLam) {
        this.MaNhanVien = MaNhanVien;
        this.HotenNhanVien = HotenNhanVien;
        this.phone = phone;
        this.CCCD = CCCD;
        this.GioiTinh = GioiTinh;
        this.CaLam = CaLam;
    }
   
    public int getMaNhanVien() {
        return MaNhanVien;
    }

    public String getHotenNhanVien() {
        return HotenNhanVien;
    }

    public int getPhone() {
        return phone;
    }

    public int getCCCD() {
        return CCCD;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public String getCaLam() {
        return CaLam;
    }

    public void setMaNhanVien(int MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public void setHotenNhanVien(String HotenNhanVien) {
        this.HotenNhanVien = HotenNhanVien;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setCCCD(int CCCD) {
        this.CCCD = CCCD;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public void setCaLam(String CaLam) {
        this.CaLam = CaLam;
    }

    @Override
    public String toString() {
        return "Nhan_Vien{" + "MaNhanVien=" + MaNhanVien + ", HotenNhanVien=" + HotenNhanVien + ", phone=" + phone + ", CCCD=" + CCCD + ", GioiTinh=" + GioiTinh + ", CaLam=" + CaLam + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.MaNhanVien;
        hash = 23 * hash + Objects.hashCode(this.HotenNhanVien);
        hash = 23 * hash + this.CCCD;
        hash = 23 * hash + Objects.hashCode(this.GioiTinh);
        hash = 23 * hash + Objects.hashCode(this.CaLam);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Nhan_Vien other = (Nhan_Vien) obj;
        if (this.MaNhanVien != other.MaNhanVien) {
            return false;
        }
        if (this.phone != other.phone) {
            return false;
        }
        if (this.CCCD != other.CCCD) {
            return false;
        }
        if (!Objects.equals(this.HotenNhanVien, other.HotenNhanVien)) {
            return false;
        }
        if (!Objects.equals(this.GioiTinh, other.GioiTinh)) {
            return false;
        }
        return Objects.equals(this.CaLam, other.CaLam);
    }
}
