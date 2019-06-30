package com.saigonbpo.dc.Model;

import java.util.Date;


import com.fasterxml.jackson.annotation.JsonFormat;

public class SeaThongTinThuyenVien {
    private Integer id;

    private String hoten;

    private Integer hinh;

    private Boolean gioitinh;


    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "vi-VN", timezone = "Asia/Ho_Chi_Minh")
    private Date ngaysinh;

    private String noisinh;

    private String dtdidong;

    private String dtnha;

    private String email;

    private String diachitamchu;

    private String cmnd;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "vi-VN", timezone = "Asia/Ho_Chi_Minh")
    private String cmndngaycap;

    private String cmndnoicap;

    private String diachihokhau;

    private String bhxh;

    private String solaodong;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "vi-VN", timezone = "Asia/Ho_Chi_Minh")
    private Date solaodongngaycap;

    private String masothuecanhan;

    private String songuoidangkyphuthuoc;

    private String chieucao;

    private String cannang;

    private String nhommau;

    private Integer sizequanao;

    private Integer sizegiay;

    private String chichubaoholaodong;

    private String tinhtranghonnhan;

    private String sotaikhoannganhang;

    private String diemhoihuong;

    private String sothich;

    private Integer tinhtrangdieudong;

    private String passport;

    private String chucdanhtheochuyenmonid;

    private Integer chucdanhtheohientaiid;

    private String ghichu;

    private Integer quoctich;

    private String nguoilienhe;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "vi-VN", timezone = "Asia/Ho_Chi_Minh")
    private Date ngaybatdaulamviec;

    private String kynanglamviec;

    private String trangthaiid;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "vi-VN", timezone = "Asia/Ho_Chi_Minh")
    private Date ngaytao;

    private Integer nguoitaoid;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "vi-VN", timezone = "Asia/Ho_Chi_Minh")
    private Date ngaycapnhat;

    private Integer nguoicapnhatid;

    private String maso;

    private String ghichubaoholaodong;

    private String vitrilamviec;

    private Integer isdelete;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "vi-VN", timezone = "Asia/Ho_Chi_Minh")
    private Date passportngaycap;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "vi-VN", timezone = "Asia/Ho_Chi_Minh")
    private Date passportngayhethan;

    private String reason;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "vi-VN", timezone = "Asia/Ho_Chi_Minh")
    private Date request;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "vi-VN", timezone = "Asia/Ho_Chi_Minh")
    private Date agreement;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "vi-VN", timezone = "Asia/Ho_Chi_Minh")
    private Date datereceived;

    private String checkedby;

    private String smp;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "vi-VN", timezone = "Asia/Ho_Chi_Minh")
    private Date smpngaycap;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "vi-VN", timezone = "Asia/Ho_Chi_Minh")
    private Date smpngayhethan;

    private String smb;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "vi-VN", timezone = "Asia/Ho_Chi_Minh")
    private Date smbngayhethan;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "vi-VN", timezone = "Asia/Ho_Chi_Minh")
    private Date dateapplied;

    private String checkby;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "vi-VN", timezone = "Asia/Ho_Chi_Minh")
    private Date datecheckby;

    private Integer ss;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public Integer getHinh() {
        return hinh;
    }

    public void setHinh(Integer hinh) {
        this.hinh = hinh;
    }

    public Boolean getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(Boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getNoisinh() {
        return noisinh;
    }

    public void setNoisinh(String noisinh) {
        this.noisinh = noisinh;
    }

    public String getDtdidong() {
        return dtdidong;
    }

    public void setDtdidong(String dtdidong) {
        this.dtdidong = dtdidong;
    }

    public String getDtnha() {
        return dtnha;
    }

    public void setDtnha(String dtnha) {
        this.dtnha = dtnha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiachitamchu() {
        return diachitamchu;
    }

    public void setDiachitamchu(String diachitamchu) {
        this.diachitamchu = diachitamchu;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getCmndngaycap() {
        return cmndngaycap;
    }

    public void setCmndngaycap(String cmndngaycap) {
        this.cmndngaycap = cmndngaycap;
    }

    public String getCmndnoicap() {
        return cmndnoicap;
    }

    public void setCmndnoicap(String cmndnoicap) {
        this.cmndnoicap = cmndnoicap;
    }

    public String getDiachihokhau() {
        return diachihokhau;
    }

    public void setDiachihokhau(String diachihokhau) {
        this.diachihokhau = diachihokhau;
    }

    public String getBhxh() {
        return bhxh;
    }

    public void setBhxh(String bhxh) {
        this.bhxh = bhxh;
    }

    public String getSolaodong() {
        return solaodong;
    }

    public void setSolaodong(String solaodong) {
        this.solaodong = solaodong;
    }

    public Date getSolaodongngaycap() {
        return solaodongngaycap;
    }

    public void setSolaodongngaycap(Date solaodongngaycap) {
        this.solaodongngaycap = solaodongngaycap;
    }

    public String getMasothuecanhan() {
        return masothuecanhan;
    }

    public void setMasothuecanhan(String masothuecanhan) {
        this.masothuecanhan = masothuecanhan;
    }

    public String getSonguoidangkyphuthuoc() {
        return songuoidangkyphuthuoc;
    }

    public void setSonguoidangkyphuthuoc(String songuoidangkyphuthuoc) {
        this.songuoidangkyphuthuoc = songuoidangkyphuthuoc;
    }

    public String getChieucao() {
        return chieucao;
    }

    public void setChieucao(String chieucao) {
        this.chieucao = chieucao;
    }

    public String getCannang() {
        return cannang;
    }

    public void setCannang(String cannang) {
        this.cannang = cannang;
    }

    public String getNhommau() {
        return nhommau;
    }

    public void setNhommau(String nhommau) {
        this.nhommau = nhommau;
    }

    public Integer getSizequanao() {
        return sizequanao;
    }

    public void setSizequanao(Integer sizequanao) {
        this.sizequanao = sizequanao;
    }

    public Integer getSizegiay() {
        return sizegiay;
    }

    public void setSizegiay(Integer sizegiay) {
        this.sizegiay = sizegiay;
    }

    public String getChichubaoholaodong() {
        return chichubaoholaodong;
    }

    public void setChichubaoholaodong(String chichubaoholaodong) {
        this.chichubaoholaodong = chichubaoholaodong;
    }

    public String getTinhtranghonnhan() {
        return tinhtranghonnhan;
    }

    public void setTinhtranghonnhan(String tinhtranghonnhan) {
        this.tinhtranghonnhan = tinhtranghonnhan;
    }

    public String getSotaikhoannganhang() {
        return sotaikhoannganhang;
    }

    public void setSotaikhoannganhang(String sotaikhoannganhang) {
        this.sotaikhoannganhang = sotaikhoannganhang;
    }

    public String getDiemhoihuong() {
        return diemhoihuong;
    }

    public void setDiemhoihuong(String diemhoihuong) {
        this.diemhoihuong = diemhoihuong;
    }

    public String getSothich() {
        return sothich;
    }

    public void setSothich(String sothich) {
        this.sothich = sothich;
    }

    public Integer getTinhtrangdieudong() {
        return tinhtrangdieudong;
    }

    public void setTinhtrangdieudong(Integer tinhtrangdieudong) {
        this.tinhtrangdieudong = tinhtrangdieudong;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getChucdanhtheochuyenmonid() {
        return chucdanhtheochuyenmonid;
    }

    public void setChucdanhtheochuyenmonid(String chucdanhtheochuyenmonid) {
        this.chucdanhtheochuyenmonid = chucdanhtheochuyenmonid;
    }

    public Integer getChucdanhtheohientaiid() {
        return chucdanhtheohientaiid;
    }

    public void setChucdanhtheohientaiid(Integer chucdanhtheohientaiid) {
        this.chucdanhtheohientaiid = chucdanhtheohientaiid;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public Integer getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(Integer quoctich) {
        this.quoctich = quoctich;
    }

    public String getNguoilienhe() {
        return nguoilienhe;
    }

    public void setNguoilienhe(String nguoilienhe) {
        this.nguoilienhe = nguoilienhe;
    }

    public Date getNgaybatdaulamviec() {
        return ngaybatdaulamviec;
    }

    public void setNgaybatdaulamviec(Date ngaybatdaulamviec) {
        this.ngaybatdaulamviec = ngaybatdaulamviec;
    }

    public String getKynanglamviec() {
        return kynanglamviec;
    }

    public void setKynanglamviec(String kynanglamviec) {
        this.kynanglamviec = kynanglamviec;
    }

    public String getTrangthaiid() {
        return trangthaiid;
    }

    public void setTrangthaiid(String trangthaiid) {
        this.trangthaiid = trangthaiid;
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

    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getGhichubaoholaodong() {
        return ghichubaoholaodong;
    }

    public void setGhichubaoholaodong(String ghichubaoholaodong) {
        this.ghichubaoholaodong = ghichubaoholaodong;
    }

    public String getVitrilamviec() {
        return vitrilamviec;
    }

    public void setVitrilamviec(String vitrilamviec) {
        this.vitrilamviec = vitrilamviec;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public Date getPassportngaycap() {
        return passportngaycap;
    }

    public void setPassportngaycap(Date passportngaycap) {
        this.passportngaycap = passportngaycap;
    }

    public Date getPassportngayhethan() {
        return passportngayhethan;
    }

    public void setPassportngayhethan(Date passportngayhethan) {
        this.passportngayhethan = passportngayhethan;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getRequest() {
        return request;
    }

    public void setRequest(Date request) {
        this.request = request;
    }

    public Date getAgreement() {
        return agreement;
    }

    public void setAgreement(Date agreement) {
        this.agreement = agreement;
    }

    public Date getDatereceived() {
        return datereceived;
    }

    public void setDatereceived(Date datereceived) {
        this.datereceived = datereceived;
    }

    public String getCheckedby() {
        return checkedby;
    }

    public void setCheckedby(String checkedby) {
        this.checkedby = checkedby;
    }

    public String getSmp() {
        return smp;
    }

    public void setSmp(String smp) {
        this.smp = smp;
    }

    public Date getSmpngaycap() {
        return smpngaycap;
    }

    public void setSmpngaycap(Date smpngaycap) {
        this.smpngaycap = smpngaycap;
    }

    public Date getSmpngayhethan() {
        return smpngayhethan;
    }

    public void setSmpngayhethan(Date smpngayhethan) {
        this.smpngayhethan = smpngayhethan;
    }

    public String getSmb() {
        return smb;
    }

    public void setSmb(String smb) {
        this.smb = smb;
    }

    public Date getSmbngayhethan() {
        return smbngayhethan;
    }

    public void setSmbngayhethan(Date smbngayhethan) {
        this.smbngayhethan = smbngayhethan;
    }

    public Date getDateapplied() {
        return dateapplied;
    }

    public void setDateapplied(Date dateapplied) {
        this.dateapplied = dateapplied;
    }

    public String getCheckby() {
        return checkby;
    }

    public void setCheckby(String checkby) {
        this.checkby = checkby;
    }

    public Date getDatecheckby() {
        return datecheckby;
    }

    public void setDatecheckby(Date datecheckby) {
        this.datecheckby = datecheckby;
    }

    public Integer getSs() {
        return ss;
    }

    public void setSs(Integer ss) {
        this.ss = ss;
    }
}