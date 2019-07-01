package com.saigonbpo.dc.Model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SeaThongTinChucDanh {
    private Integer id;

    private Integer chucdanhid;

    private Integer thuyenvienid;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "vi-VN", timezone = "Asia/Ho_Chi_Minh")
    private Date tungay;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "vi-VN", timezone = "Asia/Ho_Chi_Minh")
    private Date denngay;

    private String ghichu;

    private Date ngaytao;

    private Integer nguoitaoid;

    private Date ngaycapnhat;

    private Integer nguoicapnhatid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getChucdanhid() {
        return chucdanhid;
    }

    public void setChucdanhid(Integer chucdanhid) {
        this.chucdanhid = chucdanhid;
    }

    public Integer getThuyenvienid() {
        return thuyenvienid;
    }

    public void setThuyenvienid(Integer thuyenvienid) {
        this.thuyenvienid = thuyenvienid;
    }

    public Date getTungay() {
        return tungay;
    }

    public void setTungay(Date tungay) {
        this.tungay = tungay;
    }

    public Date getDenngay() {
        return denngay;
    }

    public void setDenngay(Date denngay) {
        this.denngay = denngay;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public Date getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }

    public Integer getNguoitaoid() {
        return nguoitaoid;
    }

    public void setNguoitaoid(Integer nguoitaoid) {
        this.nguoitaoid = nguoitaoid;
    }

    public Date getNgaycapnhat() {
        return ngaycapnhat;
    }

    public void setNgaycapnhat(Date ngaycapnhat) {
        this.ngaycapnhat = ngaycapnhat;
    }

    public Integer getNguoicapnhatid() {
        return nguoicapnhatid;
    }

    public void setNguoicapnhatid(Integer nguoicapnhatid) {
        this.nguoicapnhatid = nguoicapnhatid;
    }
}