/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package global;

import domainModel.GioHang;
import domainModel.LichDatSanCT;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author sethk
 */
public class Global {

    public static String user = "";

    public static LocalDateTime gioVao;

    public static double tienBanGiaoCa;

    public static double tongSoTienHD_GetDate;

    public static double tongSoTienCoc_GetDate;

    public static boolean keyChucNang = true;

    public static boolean isKeyChucNang() {
        return keyChucNang;
    }

    public static void setKeyChucNang(boolean keyChucNang) {
        Global.keyChucNang = keyChucNang;
    }

    public Global() {
    }

    public static double getTongSoTienHD_GetDate() {
        return tongSoTienHD_GetDate;
    }

    public static void setTongSoTienHD_GetDate(double tongSoTienHD_GetDate) {
        Global.tongSoTienHD_GetDate = tongSoTienHD_GetDate;
    }

    public static double getTongSoTienCoc_GetDate() {
        return tongSoTienCoc_GetDate;
    }

    public static void setTongSoTienCoc_GetDate(double tongSoTienCoc_GetDate) {
        Global.tongSoTienCoc_GetDate = tongSoTienCoc_GetDate;
    }

    public static double getTienBanGiaoCa() {
        return tienBanGiaoCa;
    }

    public static void setTienBanGiaoCa(double tienBanGiaoCa) {
        Global.tienBanGiaoCa = tienBanGiaoCa;
    }

    public static String getUser() {
        return user;
    }

    public static void setUser(String user) {
        Global.user = user;
    }

    public static LocalDateTime getGioVao() {
        return gioVao;
    }

    public static void setGioVao(LocalDateTime gioVao) {
        Global.gioVao = gioVao;
    }

}
