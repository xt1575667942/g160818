package com.zking.crm.model;

import java.util.Date;

public class Read {
    private Integer id;

    private Integer readyear;

    private Integer readmonth;

    private String userno;

    private String meterno;

    private Integer rmaxvalue;

    private Integer volumeid;

    private Integer volumeindex;

    private Integer readempid;

    private String readdate;

    private Integer prevalue;

    private Boolean enter;

    private Integer curvalue;

    private Boolean dial;

    private Integer amount;

    private String formula;

    private Integer audit;

    private Integer auditempid;

    private Date auditdate;

    public Read(Integer id, Integer readyear, Integer readmonth, String userno, String meterno, Integer rmaxvalue, Integer volumeid, Integer volumeindex, Integer readempid, String readdate, Integer prevalue, Boolean enter, Integer curvalue, Boolean dial, Integer amount, String formula, Integer audit, Integer auditempid, Date auditdate) {
        this.id = id;
        this.readyear = readyear;
        this.readmonth = readmonth;
        this.userno = userno;
        this.meterno = meterno;
        this.rmaxvalue = rmaxvalue;
        this.volumeid = volumeid;
        this.volumeindex = volumeindex;
        this.readempid = readempid;
        this.readdate = readdate;
        this.prevalue = prevalue;
        this.enter = enter;
        this.curvalue = curvalue;
        this.dial = dial;
        this.amount = amount;
        this.formula = formula;
        this.audit = audit;
        this.auditempid = auditempid;
        this.auditdate = auditdate;
    }

    public Read() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReadyear() {
        return readyear;
    }

    public void setReadyear(Integer readyear) {
        this.readyear = readyear;
    }

    public Integer getReadmonth() {
        return readmonth;
    }

    public void setReadmonth(Integer readmonth) {
        this.readmonth = readmonth;
    }

    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno;
    }

    public String getMeterno() {
        return meterno;
    }

    public void setMeterno(String meterno) {
        this.meterno = meterno;
    }

    public Integer getRmaxvalue() {
        return rmaxvalue;
    }

    public void setRmaxvalue(Integer rmaxvalue) {
        this.rmaxvalue = rmaxvalue;
    }

    public Integer getVolumeid() {
        return volumeid;
    }

    public void setVolumeid(Integer volumeid) {
        this.volumeid = volumeid;
    }

    public Integer getVolumeindex() {
        return volumeindex;
    }

    public void setVolumeindex(Integer volumeindex) {
        this.volumeindex = volumeindex;
    }

    public Integer getReadempid() {
        return readempid;
    }

    public void setReadempid(Integer readempid) {
        this.readempid = readempid;
    }

    public String getReaddate() {
        return readdate;
    }

    public void setReaddate(String readdate) {
        this.readdate = readdate;
    }

    public Integer getPrevalue() {
        return prevalue;
    }

    public void setPrevalue(Integer prevalue) {
        this.prevalue = prevalue;
    }

    public Boolean getEnter() {
        return enter;
    }

    public void setEnter(Boolean enter) {
        this.enter = enter;
    }

    public Integer getCurvalue() {
        return curvalue;
    }

    public void setCurvalue(Integer curvalue) {
        this.curvalue = curvalue;
    }

    public Boolean getDial() {
        return dial;
    }

    public void setDial(Boolean dial) {
        this.dial = dial;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public Integer getAudit() {
        return audit;
    }

    public void setAudit(Integer audit) {
        this.audit = audit;
    }

    public Integer getAuditempid() {
        return auditempid;
    }

    public void setAuditempid(Integer auditempid) {
        this.auditempid = auditempid;
    }

    public Date getAuditdate() {
        return auditdate;
    }

    public void setAuditdate(Date auditdate) {
        this.auditdate = auditdate;
    }
}