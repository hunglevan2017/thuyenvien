package com.saigonbpo.dc.Model;

import java.util.Date;

public class SeaTau {
    private Integer id;

    private String ten;

    private String imo;

    private String callsign;

    private String ghichu;

    private String loaitauid;

    private Date ngaytao;

    private Integer nguoitaoid;

    private Date ngaycapnhat;

    private Integer nguoicapnhatid;

    private Boolean isactive;

    private Integer trongtai;

    private Integer congsuatmay;

    private String alias;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getImo() {
        return imo;
    }

    public void setImo(String imo) {
        this.imo = imo;
    }

    public String getCallsign() {
        return callsign;
    }

    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public String getLoaitauid() {
        return loaitauid;
    }

    public void setLoaitauid(String loaitauid) {
        this.loaitauid = loaitauid;
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

    public Boolean getIsactive() {
        return isactive;
    }

    public void setIsactive(Boolean isactive) {
        this.isactive = isactive;
    }

    public Integer getTrongtai() {
        return trongtai;
    }

    public void setTrongtai(Integer trongtai) {
        this.trongtai = trongtai;
    }

    public Integer getCongsuatmay() {
        return congsuatmay;
    }

    public void setCongsuatmay(Integer congsuatmay) {
        this.congsuatmay = congsuatmay;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}