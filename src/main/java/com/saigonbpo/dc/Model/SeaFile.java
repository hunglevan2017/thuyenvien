package com.saigonbpo.dc.Model;

import java.util.Date;

public class SeaFile {
    private Integer id;

    private String name;

    private Date uploadeddate;

    private Integer iduploadeduser;

    private Date lastmodifieddate;

    private Integer idlastmodifieduser;

    private Integer workgroupid;

    private Integer folderid;

    private Float size;

    private String type;

    private Boolean signalfile;

    private String fullPath;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getUploadeddate() {
        return uploadeddate;
    }

    public void setUploadeddate(Date uploadeddate) {
        this.uploadeddate = uploadeddate;
    }

    public Integer getIduploadeduser() {
        return iduploadeduser;
    }

    public void setIduploadeduser(Integer iduploadeduser) {
        this.iduploadeduser = iduploadeduser;
    }

    public Date getLastmodifieddate() {
        return lastmodifieddate;
    }

    public void setLastmodifieddate(Date lastmodifieddate) {
        this.lastmodifieddate = lastmodifieddate;
    }

    public Integer getIdlastmodifieduser() {
        return idlastmodifieduser;
    }

    public void setIdlastmodifieduser(Integer idlastmodifieduser) {
        this.idlastmodifieduser = idlastmodifieduser;
    }

    public Integer getWorkgroupid() {
        return workgroupid;
    }

    public void setWorkgroupid(Integer workgroupid) {
        this.workgroupid = workgroupid;
    }

    public Integer getFolderid() {
        return folderid;
    }

    public void setFolderid(Integer folderid) {
        this.folderid = folderid;
    }

    public Float getSize() {
        return size;
    }

    public void setSize(Float size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getSignalfile() {
        return signalfile;
    }

    public void setSignalfile(Boolean signalfile) {
        this.signalfile = signalfile;
    }

    public String getFullPath() {
        return fullPath;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }
}