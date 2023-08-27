/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import domainModel.DichVu;
import domainModel.GiaoCa;
import domainModel.GiaoCaCT;
import domainModel.TaiKhoan;
import java.time.LocalDateTime;
import java.util.*;
import repository.RPGiaoCa;

/**
 *
 * @author toi84
 */
public class ServiceGiaoCa {

    RPGiaoCa repo = new RPGiaoCa();

    public GiaoCaCT getTT(LocalDateTime gv, LocalDateTime gr) {
        GiaoCaCT list = repo.getGiaoCaTT(gv, gr);
        return list;
    }

    public GiaoCaCT getTC(LocalDateTime gv, LocalDateTime gr) {
        GiaoCaCT list = repo.getGiaoCaTC(gv, gr);
        return list;
    }

    public ArrayList<TaiKhoan> getListTenTK(String tenTK) {
        ArrayList<TaiKhoan> list = repo.listNameTk(tenTK);
        return list;
    }

    public void insertGiaoCa(GiaoCa gc, LocalDateTime gv, LocalDateTime gr) {
        repo.insertGiaoCa(gc, gv, gr);
    }

}
